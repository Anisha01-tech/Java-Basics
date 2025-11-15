import java.util.*;
public class Memory {
    public static void main(String[] args) {
        /* these two below s and x are pointing to same memory address and this is called
         * INTERNING. 
         */
        String s="hello";
        String x="hello";
        System.out.println(System.identityHashCode(s));
       System.out.println(System.identityHashCode(x));

    
        // but if we use NEW keyword then it will point to another memory adress
        String m =new String("hello");
        System.out.println(System.identityHashCode(m));
    }
    
} 
