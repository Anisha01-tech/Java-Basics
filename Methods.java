import java.util.Scanner;
class Algebra{
    int sum(int a,int b){
        int ans=a+b;
        return ans;
    }
}

public class Methods {
    public static void main(String[] args) {
        Algebra obj1=new Algebra();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two no. to add");
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("sum of the two no. is:");
        int ans= obj1.sum(a,b);
        System.out.println(ans);
    }
}
