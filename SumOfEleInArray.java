public class SumOfEleInArray {
    static int printSum(int[] arr,int idx){
        if(idx==arr.length) return 0;
        if(idx==arr.length-1) return arr[idx];

        int smallAns=printSum(arr,idx+1);
        int ans= arr[idx] + smallAns;
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(printSum(arr,0));

    }
}
