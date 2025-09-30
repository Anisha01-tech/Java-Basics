import java.util.Scanner;

public class PrefixSumInPlace {
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
//    static int[] makePrefixSumArray(int[] arr){
//        int n=arr.length;
//        int[] pref=new int[n];
//        pref[0]=arr[0];
//
//        for(int i=1;i<n;i++){
//            pref[i]=pref[i-1]+arr[i];
//        }
//        return pref; // in this the sum is stored in the diff array named pref
//    }                // now we are going to write a code in which in the sum is gonna stored in same array arr

    static int[] makePrefixSumArray(int[] arr){
        int n=arr.length;

        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("enter "+ n + " elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("input array");
        printArray(arr);

        int[] pref=makePrefixSumArray(arr);
        printArray(pref);
    }
}
