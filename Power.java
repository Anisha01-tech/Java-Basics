import java.util.Scanner;

public class Power {
    static int powers(int p,int q){
        if(q==0) return 1;

        int ans=powers(p,q-1)*p;
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. and power:");
        int p=sc.nextInt();
        int q=sc.nextInt();
        System.out.println(powers(p,q));
    }
}
