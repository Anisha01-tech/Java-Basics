//ques: we are given a array in non-decreasing order and we have to sq each ele of the array and present it in
// non-decreasing order


import java.util.Scanner;

public class SquareOfNon_DecreasingArray {
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse ( int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    static int[] sortSquare(int[] arr){
        int n=arr.length;
        int left=0,right=n-1;
        int[] ans=new int[n];
        int k=0;

        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k++]=arr[left]*arr[left];
                left++;
            }
            else{
                ans[k++]=arr[right]*arr[right];
                right--;
            }
        }
        return ans;
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
        System.out.println("original array");
        printArray(arr);
        int[] ans=  sortSquare(arr);
        System.out.println("sorted array");
        reverse(ans);  // if we not write this statement then we get sq of ele in as it is order as we entered the ele
        printArray(ans);


    }
}



