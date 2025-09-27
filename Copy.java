import java.util.Arrays;
import java.util.Scanner;

public class Copy {
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("enter size of array");
        int n = sc.nextInt();
        System.out.println("enter " + n + " elements");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("original array");
        printArray(arr);


        int arr2[] = Arrays.copyOf(arr, arr.length); // it also works like clone // if we pass 2 instead of arr.length
        // then only 2 elements gte copied

        System.out.println("copied array");
        printArray(arr2);

        arr2[0] = 0;
        arr2[1] = 0;
        System.out.println("original array after changing the value of arr2");
        printArray(arr);

        System.out.println("copied arr2 after changing arr2");
        printArray(arr2);
    }
}
