import java.util.Scanner;
public class SecondMaxEle {

    static int findMax(int[] arr){
        int mx=Integer.MIN_VALUE;//we use MIN_VALUE to find max value and use MAX_VALUE to find the min value always
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    static int findSecondMax(int[] arr){
        int mx=findMax(arr);

        for(int i=0;i<arr.length;i++){
            if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondMax=findMax(arr);
        return secondMax;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("enter "+ n + " elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("second maximum element is "+ findSecondMax(arr));

    }
}
/* Algorithm
1.find maximum
2.mark all maximm as -infinity
3.find amximum again
4.that is our answer or second largest element
 */
