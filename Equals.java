import java.util.*;
public class Equals {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        String s3=new String("hello");
        System.out.println(s1==s2); // true
        // But if we write
        System.out.println(s1==s3);  // false
        // this gives false because '==' operator only see or compare address and give output

        // So in place of '==' we use 'str.euals()' because it see or compares adress first 
        // and then string also
        System.out.println(s1.equals(s3));  // true
    }
    
}
