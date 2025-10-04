//Ques: check if can partiton the array into two subarrays with equal sums.More formally,check that the prefix sum of
// a part of the array is equal to the suffix sum of the rest of the arry.
// suffix sum=totalsum-prefsum

import java.util.Scanner;

public class SubArrayOfEqualSum {
    static int findArraySum(int[] arr){
        int totalSum=0;
        for(int i=0;i<arr.length;i++){
            totalSum+=arr[i];
        }
        return totalSum;
    }
    static boolean equalSumPartition(int[] arr){
        int totalSum=findArraySum(arr);
        int prefSum=0;
        for(int i=0;i<arr.length;i++){
            prefSum+=arr[i];
            int suffixSum=totalSum-prefSum;
            if(prefSum==suffixSum){
                return true;
            }
        }
        return false;

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
        System.out.println("equal partition possible:"+ equalSumPartition(arr));
    }
}
