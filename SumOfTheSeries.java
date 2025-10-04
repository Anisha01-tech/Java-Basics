import java.util.Scanner;
public class SumTheSeries {     //1-2+3-4......
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no. of element in series");
        int n=sc.nextInt();
        int ans=0;
        for (int i=1;i<=n;i++){
            if(i%2==0){
                ans-=i;
            }else{
                ans+=i;
            }
        }
        System.out.println(ans);
    }
}
