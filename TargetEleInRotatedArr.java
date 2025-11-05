// Given the rotated array of integers, which contain distinct elements, and an integer target,
// return the index of target if it is in the array. Otherwise return -1. 

public class TargetEleInRotatedArr {
    static int findTarget(int[] a, int target){
        
        int st=0, end=a.length-1;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(a[mid]==target){
                return mid;
            }
            else if(a[mid]<a[end]){  // mid to end is sorted
                if(target>a[mid] && target<=a[end]){
                    st=mid+1;

                }
                else{
                    end=mid-1;
                }
            }
            else{  //st to mmid is sorted
                if(target>=a[st] && target<a[mid]){
                    end=mid-1;
                }
                else{
                    st=mid+1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a={3,4,5,1,2};
        int target=4;
        System.out.println(findTarget(a,target));
    }
    
}
