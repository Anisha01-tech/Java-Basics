public class oops {
    // creating a new datatype
    public static class Student{
        String name;
        int roll;
        double percent;

    }
    public static void main(String[] args) {
        Student x = new Student(); // declaration
        // Initialization
        x.name="Anisha";      // default value: null
        x.roll=101;           // default value: 0
        x.percent=92.6;       // default value: 0.0
        System.out.println(x.name);
        System.out.println(x.roll);           // classses are uer defined blueprint
        System.out.println(x.percent);
                                             // here x and y are objects of class Student
        Student y=new Student();             // objects are real life entities
        x.name="Aneesha";
        x.roll=102;
        x.percent=87.89;

    }
    
}
/* Passing class to function
 * 1. We have to declare te class outside the main.
 * 2. classes are passed by reference.
 */
