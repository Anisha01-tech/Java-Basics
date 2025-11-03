// Find the first occurence of the gven ele x, given that the given arrya is sorted. If no
// occurence of x is found then retur -1.

public class FirstOccurenceOfTheGivenEle {
    static int firstOcc(int[] arr, int x){
        int n=arr.length;
        int st=0, end=n-1;
        int fo=-1;  // first occurence
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==x){
                fo=mid;
                end=mid-1;
            }
            else if(x<arr[mid]){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return fo;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,5,5,5,6};
        int x=5;
        System.out.println(firstOcc(arr,x));
    }
    
}
