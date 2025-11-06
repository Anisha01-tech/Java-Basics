
// Search ele in rotated in array with duplicate ele. Return true if the ele is found, else return false

public class SearchInDuplicateRotatedArr {
    static int findEle(int[] a, int target){
        int n=a.length-1;
        int st=0, end=n-1;
        
        while(st<=end){
            int mid=st+(end-st)/2;
            if(a[mid]==target){
                return mid;
            }
            else if(a[st]==a[mid]&& a[end]==a[mid]){
                st++;
                end--;
            }
            else if(a[mid]<=a[end]){  // mid to end is sorted
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
        return -1;
    }
        
    public static void main(String[] args) {
        int[] a={0,0,0,1,1,1,2,0,0,0};
        int target=2;
        System.out.println(findEle(a,target));
    }
}
    

