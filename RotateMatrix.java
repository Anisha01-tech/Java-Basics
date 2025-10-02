// Ques: we have to rotate a square matrix

import java.util.Scanner;

public class RotateMatrix {
    static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void findTransposeInPlace(int[][] matrix,int r, int c){


        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                //swap matrix[i][j] with matrix[j][i]
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    static void reverseArray(int[] arr){
        int i=0;
        int j=arr.length-1;

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void rotate(int[][] matrix , int n){
        // first tranpose the matrix
        //then reverse each row of the transposed matrix
        findTransposeInPlace(matrix,n,n); // n and n because it is a sq matrix  so row and col will be same i.e. n
        for(int i=0;i<n;i++){
            reverseArray(matrix[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of rows and cols"); //it is sq matrix so row and col will be same
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] matrix=new int[r][c];
        int totalElements= r * c;
        System.out.println("enter "+ totalElements+ " values");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("input matrix");
        printMatrix(matrix);

        rotate(matrix,r);

        System.out.println("rotation of matrix");
        printMatrix(matrix);
    }
}
