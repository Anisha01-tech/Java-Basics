// Given an array where all its elements are sorted in increasing order except two swapped element
// sort it in linear time. Assumne there are no duplicates in the array

public class SortInLinearTime {
    static void display(int[] a){
        for(int val: a){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    static void sortArr(int[] arr){
        int n=arr.length;
        int x=-1, y=-1;
        if (n<=1){   //corner case
            return;
        }
        //process all adjacent element
        for(int i=1;i<n;i++){
            if(arr[i-1] > arr[i]){
                if(x==-1){ // first conflict
                    x=i-1;
                    y=i;
                }else{   //second conflict
                    y=i;
                }
            }

        }
        //swap x and y in arr
        int temp= arr[x];
        arr[x]= arr[y];
        arr[y]= temp;

    }
    public static void main(String[] args) {
        int[] arr={10,5,6,7,8,9,3};
        sortArr(arr);
        display(arr);
    }
    
}
