public class PeakElementInArr {
    static int findPeakEleIndex(int[] a){
        int st=0, end=a.length-1;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if((mid==0 || a[mid]>a[mid-1]) && (mid==a.length-1 || a[mid]>a[mid+1])){
                return mid;
            }
            if(a[mid]< a[mid+1]){
                st=mid+1;
            }
            else{
                end=mid-1;
            }
                
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a={1,2,1,3,1};
        System.out.println(findPeakEleIndex(a));
        
    }
    
}
