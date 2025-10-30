// Given an array of positive and negative integers, segregate them in linear time and constant space.
// The output should print all negative numbers, followed by all positive numbers.

public class SortingExample {
    static void display(int[] a){
        for(int val: a){
            System.out.print(val + " ");
        }
        System.out.println();
    }
    static void partition(int[] arr){
        int l=0, r=arr.length-1;
        while(l<=r){
            while(arr[l]<0) l++;
            while(arr[r]>=0) r--;
            if(l<=r){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr={19,-20,7,-4,-13,11,-5,3};
        partition(arr);
        display(arr);
    }
    
}

