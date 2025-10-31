// Given array of size N containing only 0s, 1s, and 2s; sort the array in ascending order

public class SortingExampleTwo {
      static void display(int[] a){
        for(int val: a){
            System.out.print(val + " ");
        }
        System.out.println();
    }
    static void swap(int[] a, int x, int y){
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }

    // This is the first approach that we do in 2 passes

    static void sort(int[] arr){
        int count_0=0, count_1=0, count_2=0;
        for(int j: arr){
            if(j==0){
                count_0++;
            }
            else if(j==1){
                count_1++;
            }
            else{
                count_2++;
            }
        }
    
        int k=0;
        while(count_0 > 0){
            arr[k++]=0;
            count_0--;
        }
        while(count_1 > 0){
            arr[k++]=1;
            count_1--;
        }
        while(count_2 > 0){
            arr[k++]=2;
            count_2--;
        }
    }

    // Now in this approach we will do it in one pass
    static void sort2(int[] arr2){
        int lo=0, mid=0, hi=arr2.length-1;
        // explore the unknown region
        while(mid<=hi){
            if(arr2[mid]==0){
                swap(arr2,mid,lo);
                mid++;
                lo++;
            }
            else if(arr2[mid]==1){
                mid++;
            }
            else{
                swap(arr2,mid,hi);
                hi--;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr={2,2,1,0,2,2,1,0,0,1,2,0,2,1,0,1,1,0,0};
        System.out.println("sorted arry by  first approach");
        sort(arr);
        display(arr);
        int[] arr2={2,2,1,0,2,2,1,0,0,1,2,0,2,1,0,1,1,0,0};
        System.out.println("sorted array by second approach");
        sort2(arr2);
        display(arr2);
    }
    
}
