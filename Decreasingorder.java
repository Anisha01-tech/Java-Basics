import java.util.Scanner;
public class print_n_to_1 {
    static void printDecreasing(int n){
        if(n==1){ // base case
            System.out.println(1);
            return;
        }
        System.out.println(n); // sef work
        printDecreasing(n-1);  // recursive work
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. u want to print" );
        int n=sc.nextInt();
        printDecreasing(n);
    }
}
