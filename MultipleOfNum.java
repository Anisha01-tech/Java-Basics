import java.util.Scanner;

public class MultipleofNum {
    static int mul(int n,int k){
        if(k==1) {
            System.out.println(n);
            return n;
        }

        mul(n,k-1);
        System.out.println(n*k);
        return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number you want to find multiple of:");
        int n=sc.nextInt();
        System.out.println("enter how many multiple you want");
        int k=sc.nextInt();
        mul(n,k);
    }
}
