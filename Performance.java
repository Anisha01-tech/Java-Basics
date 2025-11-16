import java.util.*;
public class Performance {
    public static void main(String[] args) {
        String str="";
        for(int i=1;i<=10;i++){
            str=str+i;
        }
        System.out.println(str);
        // here 10 string will form i.e. "", "1", "12",......., "12345678910"
        // if we have n inputs than no. of operation that occurs is n(n+1)/2.
        // This is why performance of strring is not good
    }
    
}
