/* properties
1. p[i][j]=p[i-1][j]+p[i-1][j-1]
2. in every row , first and last element is 1.
3. jagged array(not having same no. of column in every row) => ith row has i+1 columns
 */


import java .util.Scanner;
public class PascalTrinagle {
    static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] pascal(int n){
        int[][] ans=new int[n][]; // n is rows and the cols is not fix so we left it empty
        for(int i=0;i<n;i++){

            //ith row has i+1 col
            ans[i]= new int[i+1];  // means 0[i] row has 1[i+1] col

            // first and last ele in row is 1
            ans[i][0]=ans[i][i]=1;

            for(int j=1;j<i;j++){
                ans[i][j]=ans[i-1][j] + ans[i-1][j-1];
            }


        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n:");
        int n=sc.nextInt();
        int[][] ans=pascal(n);
        printMatrix(ans);
    }
}
