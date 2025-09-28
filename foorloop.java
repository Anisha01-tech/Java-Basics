import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int sum=0;
        for(int num=1;num<=n;num++){
            sum+=num;
        }
        System.out.println(sum);
    }
}
