/* Search the target value in the 2d integer matrix of dimension nxm and return true if found,else 
 * return false. The matrix has the following properties:
 * 1. Integers in each row are sorted from left to right.
 * 2. The first integer in each row is greater than the last integer of the previous row.
 */

public class BinarySearchOnTwoDMat {
    static boolean findTarget(int[][] a, int target){
        //no. of rows=n, no. of cols=m
        int n=a.length, m=a[0].length;
        int st=0, end=n*m-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            int midEle=a[mid/m][mid%m];
            if(midEle==target) return true;
            if(target<midEle){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int[][] a={{1,2,5,7},{10,11,16,20},{23,30,34,60}};
        int target=16;
        System.out.println(findTarget(a,target));
        
    }
    
}
