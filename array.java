class ArrayExample{
    void demoArray(){
        int[] ages=new int[2];
        float weight[]=new float[2];
        String[] names=new String[2];

        ages[0]=45;
        ages[1]=61;

        weight[0]=64.56f;
        weight[1]=54;

        names[0]="rohan";
        names[1]="manvi";

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(weight[0]);
        System.out.println(weight[1]);
        System.out.println(names[0]);
        System.out.println(names[1]);

         // length of array
        System.out.println(ages.length);
        System.out.println(weight.length);
        System.out.println(names.length);

        //looping in array
        //for loop
        for(int i=0;i<2;i++){
            System.out.println(ages[i]);
        }

        //foreach loop
        for(float mass:weight){
            System.out.println(mass);
        }

        //while loop
        int i=0;
        while(i<2){
            System.out.println(names[i]);
            i+=1;
        }



    }

}

public class Array {
    public static void main(String[] args) {
        ArrayExample obj=new ArrayExample();
        obj.demoArray();
    }
}
