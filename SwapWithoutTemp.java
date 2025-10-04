public class SwapWithout_Temp {

    static void swap(int a, int b)
    {
        System.out.println("original values before swap");  //we will do this by using sum and differences
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        a=a+b; //9+3=12
        b=a-b; //12-3=9 ==>b=9
        a=a-b; //12-9=3 ==>a=3

        System.out.println("values after swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
    public static void main(String[] args) {
        int a=9;
        int b=3;
        int[] arr={1,2,3,4,5};
        swap(a,b);
    }
}
