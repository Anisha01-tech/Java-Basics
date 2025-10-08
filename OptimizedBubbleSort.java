public class OptimizedBubblleSort {            // for nearly sorted array e.g.{64,45,46,48,54,23}
        static void bubbleSort(int[] a){
        int n=a.length;
        for(int i=0;i<n-1; i++){
            boolean flag=false;
            for(int j=0; j<n-i-1; j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=true;
                }
            }
            if(flag==false){
                return;
            }

        }
        
        
    }
    public static void main(String[] args) {
        int[] a={7,3,4,5,6,1};
        bubbleSort(a);
        for(int val: a){
            System.out.println(val + "");
        }
    }
    
}
