/* Given a string, the task is to toggle all the characters of the string i.e. to convert 
 * upper case to lower case and vice versa.
 */

import java.util.*;
public class Toggle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        StringBuilder str= new StringBuilder(sc.nextLine());
        System.out.println(str);
        // toggle
        for(int i=0;i<str.length();i++){
            boolean flag =true; // true-> capital
            char ch=str.charAt(i);
            if(ch==' ') continue; // space
            int asci =(int)ch;
            if(asci>=97) flag=false; // small
            if(flag==true){
                asci+=32;
                char dh=(char)asci;
                str.setCharAt(i,dh);
            }
            else{
                asci-=32;
                char dh=(char)asci;
                str.setCharAt(i,dh);
            }
        }
        System.out.println(str);
    }
    
}
