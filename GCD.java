import java.util.Scanner;

public class GCD {
    static int gcd(int x,int y){
//        while(x%y!=0){     //  by longest division method
//            int rem=x%y;
//            x=y;
//            y=rem;
//        }
//        return y;

        // by euclid's algo
        // gcd(x,y)=gcd(y,x%y)
        //gcd(x,0)=x

        if(y==0) return x;
        return gcd(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first no.");
        int x=sc.nextInt();
        System.out.println("enter the second no.");
        int y=sc.nextInt();
        System.out.println("greatest common factor is:");
        System.out.println(gcd(x,y));
    }
}
