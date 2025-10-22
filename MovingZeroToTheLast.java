// Given an integer array arr, move all 0's to the end of it while maintaining the relative
//order of the non-zero element.


public class MovingZeroToLast {
    public static void main(String[] args) {
        int[] arr={1,0,4,5,0,23,5,0,1};
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int val: arr){
            System.out.println(val+"");
        }

    }
    
    
    
}
