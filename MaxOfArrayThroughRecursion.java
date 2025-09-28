public class MaxOFArrayRecursion {
    static int printMax(int[] arr,int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int smallAns=printMax(arr,idx+1);
        return Math.max(arr[idx],smallAns);

    }
    public static void main(String[] args) {
        int[] arr={301,10,4,45,67,1,5};
        System.out.println(printMax(arr,0));
    }
}
