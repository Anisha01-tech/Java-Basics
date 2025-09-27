import java.util.Scanner;
public class FactorialByRecursion {
    static int factorial(int n){
        if(n==0)   return 1;           // base case

        int smallAns=factorial(n-1);  // small problem

        int ans= n * smallAns;  // self work
        return ans;

    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter no. you want to find the factorial of:");
       int n=sc.nextInt();
       System.out.println( factorial(n));

    }
}
