public class RadixSort {
    static int findMax(int[] arr){
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    static void display(int[] a){
        for(int val: a){
            System.out.print(val + " ");
        }
        System.out.println();
    }

     static void countSort(int[] arr, int place){
        int n=arr.length;
        int[] output= new int[n];
        int max=findMax(arr);
        int[] count=new int[10];
        for(int i=0; i<arr.length;i++){
            count[(arr[i]/place)%10]++;
        }
        // Make prefix sum of count array
        for(int i=1; i<count.length; i++){
            count[i]+= count[i-1];
        }
        
        for(int i=n-1; i>=0; i--){
            int idx=count[(arr[i]/place)%10]-1;
            output[idx]=arr[i];
            count[(arr[i]/place)%10]--;
        }
        // copy all elememts of output in array
        for(int i=0; i<n; i++){
            arr[i]=output[i];
        }
    }
    static void radixSort(int[] arr){
        int mx=findMax(arr); // get maximum ele
        // apply counting sort to dort ele based on placed value
        for(int place=1; mx/place>0; place*=10){
            countSort(arr,place);
        }
    }
    public static void main(String[] args) {
        int[] arr={43,453,626,894,0,30,7};
        radixSort(arr);
        display(arr);
        
    }

    
}
