
public class Constructor {
    public static class Student{
        String name;
        int roll;
        double percent;

        // constructor
        public Student(String naam, int rno, double per){
        name=naam;
        roll=rno;
        percent=per;
        }

    }
    public static void main(String[] args) {
        Student s1= new Student("Anurag", 102, 89.90);
        System.out.println(s1.name);
        System.out.println(s1.roll);
        System.out.println(s1.percent);
        
    }
    
}
