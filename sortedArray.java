import java.util.Scanner;

public class ArrayIsSortedOrNot {
    static boolean isSorted(int[] arr){
        boolean check=true;
        for(int i=1;i<arr.length;i++){
            if (arr[i] < arr[i-1]) {    //for sorted array ith element (current element) should be greater then its pevious element
                //not sorted
                check=false;
                break;

            }
        }
        return check;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter " + n + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("is sorted " + isSorted(arr));
    }
}
