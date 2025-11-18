import java.util.*;
public class Builder {
    public static void main(String[] args) {
        StringBuilder str= new StringBuilder("hello");
        System.out.println(str);
        
        // functions
        // hello-> mello
        str.setCharAt(0,'m');
        System.out.println(str);

        // to add at last
        str.append("world");
        System.out.println(str);

        // inssert at any place
        str.insert(2,'y');
        System.out.println(str);

        // delete
        str.deleteCharAt(2);
        System.out.println(str);

        // delete(i,j)-> delete in range of i ,j whre j is excluded
        str.delete(2,4);
        System.out.println(str);

        // reverse
        str.reverse();
        System.out.println(str);

    }
    
}
