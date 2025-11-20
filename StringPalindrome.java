import java.util.*;
public class StringPalindrome {
    public static void main(String[] args) {
        String str="abcdcba";
        StringBuilder gtr= new StringBuilder(str);
        gtr.reverse();
        String s =gtr+"";
        if(str.equals(s)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        
    }
    
}
