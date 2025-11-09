/* Given a mountain array "a" of length greater than 3, return the index "i" such that 
 * arr[0]<arr[1]<....<arr[i-1]<arr[i]>arr[i+1]>....>arr[arr.length-1] this index is known 
 * as peak index.
 */

public class PeakIndexInTheMountainArr {
    static int findPeakIndex(int[] a){
        int st=0, end=a.length-1;
       // int ans=-1;
        while(st<end){
            int mid= st+(end-st)/2;
            if(a[mid]<a[mid+1]){
              //  ans=mid+1;
                st=mid+1;
            }
            else{
               // end=mid-1;
               end=mid;
            }
        }
       // return ans;
       return st;
    }
    public static void main(String[] args) {
        int[] a={0,4,1,0};
        System.out.println(findPeakIndex(a));
    }
    
}
