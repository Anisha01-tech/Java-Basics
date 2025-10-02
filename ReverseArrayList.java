import java.util.ArrayList;
import java.util.Collections;
public class ReverseArrayList {
//    static void reverseList(ArrayList<Integer> list){
//        int i=0,j=list.size()-1;   // we can do it in simmpler way by importing collections class and using collection.reverse methd
//
//        while(i<j){
//            Integer temp=Integer.valueOf(list.get(i));
//            list.set(i,list.get(j));
//            list.set(j,temp);
//            i++;
//            j--;
//        }
//
//    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(8);
        list.add(0);
        list.add(19);
        list.add(10);
        list.add(4);

        System.out.println("original list "+ list);
        //reverseList(list);
        Collections.reverse(list);
        System.out.println("reversed list "+ list);





    }

}
