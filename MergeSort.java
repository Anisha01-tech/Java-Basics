public class MergeSort {
    static void displayArr(int[] a){
        for(int val: a){
            System.out.print(val+" ");
        }
    }
    static void merge(int[] a, int l, int mid, int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int[] left=new int[n1];
        int[] right=new int[n2];
        int i,j,k;
        for(i=0; i<n1; i++) left[i]=a[l+i];
        for(j=0; j<n2; j++) right[j]=a[mid+1+j];

        i=0;
        j=0;
        k=l;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                a[k++]=left[i++];
            }
            else{
                a[k++]=right[j++];
            }
        }
        while(i<n1){
            a[k++]=left[i++];
        }
        while(j<n2){
            a[k++]=right[j++];
        }
    }
    static void mergeSort(int[] a, int l, int r){
        if(l>=r) return;
        int mid=(l+r)/2;
        mergeSort(a,l,mid);
        mergeSort(a,mid+1,r);
        merge(a,l,mid,r);


    }
    public static void main(String[] args) {
        int [] a={4,1,3,5,2};
        int n=a.length;
        System.out.println("array brfore sorting");
        displayArr(a);
        mergeSort(a,0,n-1);
        System.out.println();
        System.out.println("array after sorting");
        displayArr(a);
        
    }
    
}
