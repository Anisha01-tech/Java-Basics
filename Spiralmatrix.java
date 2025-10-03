import java.util.Scanner;
public class SpiralMatrix {
    static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void printSpiralOrder(int[][] matrix,int r , int c){

        int topRow=0, bottomRow=r-1, leftCol=0, rightCol=c-1;
        int totalElements=0;

        while(totalElements < r*c){
            // toprow-> leftcol to rightcol
            for(int j=leftCol;j<=rightCol && totalElements < r*c;j++){
                System.out.print(matrix[topRow][j] + " ");  // here row will be same col will vary
                totalElements++;
            }
            topRow++;


            // rightcol-> toprow to bottomrow
            for(int i=topRow;i<=bottomRow && totalElements < r*c;i++){
                System.out.print(matrix[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;


            // bottomrow-> rightcol to leftcol
            for(int j=rightCol;j>=leftCol && totalElements < r*c;j--){
                System.out.print(matrix[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;


            //leftcol-> bottommrow to toprow
            for(int i=bottomRow;i>=topRow && totalElements < r*c;i--){
                System.out.print(matrix[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;

        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of rows and cols of the matrix");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] matrix=new int[r][c];
        int total= r*c;
        System.out.println("enter " + total + "elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("input matrix");
        printMatrix(matrix);

        System.out.println("spiral oredr");
        printSpiralOrder(matrix,r,c);
    }
}
