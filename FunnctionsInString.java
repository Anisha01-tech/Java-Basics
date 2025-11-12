import java.util.*;
public class FunstionsInStrings {
    public static void main(String[] args) {
        String str="Anisha Pandey";

        // its tells length of the string
        System.out.println(str.length());

        // It tells which chararter is in particular index
        char ch=str.charAt(3);
        System.out.println(ch);

        // it tells the index of te particular chracter, if it occurs more than one time
        // then it will retuen the first occurence's index
        System.out.println(str.indexOf('n'));

        /* it compare to strings i.e str and gtr
         * 1. if str==gtr then returns 0
         * 2. if str>gtr lexographically then return positive value
         * 3. if str<gtr lexographically then return negative value
         */
        String gtr="hello";
        System.out.println(str.compareTo(gtr));

        // it give trueor false if the given string has particular string or starts with or ends 
        // with it
        System.out.println(str.contains("ish"));
        System.out.println(str.startsWith("hi"));
        System.out.println(str.endsWith("ey"));

        // it converts string to lowercase or uppercase
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        // it concatenate to string
        String s=str.concat(gtr);
        System.out.println(s);

        // string + int/char/string
        System.out.println(gtr+"xyz");
        System.out.println(gtr+10);
        System.out.println(gtr+10+20);
        System.out.println(10+20+gtr);
        System.out.println(gtr+'a');

        // it prints substrings from 1st index to last-1 index
        System.out.println(str.substring(0,8));

        //it print substrings from the given index to end
        System.out.println(str.substring(3));

    }
    
}
