//wap to sort arraylist of strings in descending order . here we do this using collection method

import java.util.ArrayList;
import java.util.Collections;
public class SortArrayList {
    public static void main(String[] args) {  // this is sorting of integer value
        ArrayList<Integer> list=new ArrayList<>();
        list.add(8);
        list.add(0);
        list.add(19);
        list.add(10);
        list.add(4);

        System.out.println("original list "+ list);

        Collections.sort(list);
        System.out.println("ascending order "+ list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("descending oredr "+ list);

        // sorting of string

        ArrayList<String> l1= new ArrayList<>();
        l1.add("welcome");
        l1.add("to");
        l1.add("my");
        l1.add("program");

        System.out.println("original list "+ l1);

        Collections.sort(l1);
        System.out.println("ascending order "+ l1);

        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("descending order " + l1);

    }

}
