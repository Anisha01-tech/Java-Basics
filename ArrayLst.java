import java.util.ArrayList;
public class ArrayLst {
    public static void main(String[] args) {
        //Wrapper class
//        Integer i= Integer.valueOf(4); // here i and a are object but if declare it as int i=4 and float f=4.5 then it is variable
//        System.out.println(i);
//        Float a= Float.valueOf(4.5f);
//        System.out.println(a);

        // arraylist are just like array but they are of variable size not of fixed size
        //creation of arraylist

        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Boolean> l2= new ArrayList<>();

        // add new element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        //get an element at index i
        System.out.println(l1.get(0)); //here we cannot use l1[0]

        //print with for loop
        for(int i=0;i<l1.size();i++){  // here we do not use i.length
            System.out.println(l1.get(i));
        }

        //printing the arraylist directly
        System.out.println(l1); // here we get output in the form of list[5,6,7,8]

        //adding element at some index i i.e.[5,100,6,7,8]
        l1.add(1,100);
        System.out.println(l1);

        //modifying element at index i
        l1.set(1,10);
        System.out.println(l1);

        //removing an element at index i
        l1.remove(1);
        System.out.println(l1);

        //removing an element e
        l1.remove(Integer.valueOf(7));  // returns boolean
        System.out.println(l1); // if element exists then it remove it if not exist then do nth print the same array as before

        //checking if an element exists
        boolean ans=l1.contains(Integer.valueOf(6));
        System.out.println(ans);

        // if you don't specify the class,you can put anthing inside l
        ArrayList l=new ArrayList<>();
        l.add(8);
        l.add("p");
        l.add(8.9);
        System.out.println(l);

    }
}
