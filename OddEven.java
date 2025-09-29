import  java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no. to check even or odd");
        int num= sc.nextInt();
        if(num%2!=0){
            System.out.println("odd number");
        }
        else{
            System.out.println("even number");
        }
    }
}
