//given an array of integers of size n. answer q queries where you need to print the sum of values in the given range
//of indices from l to r (both included).
//note: the values of l and r in the queries follow one-based indexing.

import java.util.Scanner;

public class OneBasedIndexing {
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
        int[] arr=new int[n+1];

        System.out.println("enter "+ n + " elements");
        for(int i=1;i<=n;i++){ // we do i=1 and i<=n because it  is one-based indexing
            arr[i]=sc.nextInt();
        }
        int[] prefSum=makePrefixSumArray(arr);

        System.out.println("enter no. of queries");
        int q=sc.nextInt();

        while(q-->0){
            System.out.println("enter range");
            int l=sc.nextInt();
            int r=sc.nextInt();

            int ans=prefSum[r]-prefSum[l-1];

            System.out.println("sum "+ ans);
        }
    }
}

