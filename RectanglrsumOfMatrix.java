//by pre-calculating the horizontal sum for each row in the matrix

import java.util.Scanner;
public class RectangleSum {
    static void findPrefSumMatrix(int[][] matrix){
        int r=matrix.length;
        int c=matrix[0].length;

        //traverse horizontally to calculate row wise pref sum
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                matrix[i][j]+=matrix[i][j-1];
            }
        }
    }
    static int findSum(int[][] matrix, int l1, int r1, int l2, int r2){
        int sum=0;
        findPrefSumMatrix(matrix);
        for(int i=l1;i<=l2;i++){
            //r1 to r2 sum for row i
            if(r1>=1)
            sum+=matrix[i][r2] - matrix[i][r1-1];
            else
                sum+=matrix[i][r2];
        }
       return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of rows and cols of the matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int total = r * c;
        System.out.println("enter " + total + " elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter rectangle boundaries");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("rectangle sum " + findSum(matrix,l1,r1,l2,r2));
    }

}
