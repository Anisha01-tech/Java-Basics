import java.util.Scanner;

public class InverseTrianglePattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number of rows");
        int r=sc.nextInt();


        for(int i=r;i>=1;i--){
            for(int j=i;j>=1;j--){

                System.out.print("*");
            }
            System.out.println();



        }
    }

}


