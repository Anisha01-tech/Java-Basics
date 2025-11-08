/*Search the target value in the 2d integer matrix of dimension nxm and return true if found,else 
 * return false. The matrix has the following properties:
 * 1. Integers in each row are sorted from left to right.
 * 2. Integers in each column are sorted from top to bottom.
 */

public class BSInTwoDMat {
    static boolean findTarget(int[][] a, int target){
        int n=a.length, m=a[0].length;
        int i=0, j=m-1;
        while(i<n && j>=0){
            if(a[i][j]==target) return true;
            if(target<a[i][j]){
                j--; // move left
            }
            else{
                i++; //move down
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] a={{2,4,6,8},{5,6,7,20},{7,11,13,25},{12,14,17,30}};
        int target=14;
        System.out.println(findTarget(a,target));
    }
    
}
