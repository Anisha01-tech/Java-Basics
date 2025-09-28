class Examples{
    void demo(){
        int arr[]={1,5,3};
        int ans=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
        }
        System.out.println("max value is "+ ans);

    }
}

public class MaxOfArray {
    public static void main(String[] args) {
        Examples obj=new Examples();
        obj.demo();
    }
}
