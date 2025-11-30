import java.util.*;
public class Fraction {
    public static fraction add(fraction f1, fraction f2){
        int numerator = f1.num*f2.deno + f1.deno*f2.num;
        int denominator=f1.deno*f2.deno;
        fraction f3= new fraction(numerator, denominator);
        return f3;
    }
    public static fraction mul(fraction f1, fraction f2){
        int numerator = f1.num*f2.num;
        int denominator=f1.deno*f2.deno;
        fraction f4= new fraction(numerator, denominator);
        return f4;
    }
    public static int gcd(int num,int deno){
        int min =Math.min(num,deno);
        for(int i=min;i>=1;i--){
            if(num%i==0 && deno%i==0) return i;
        }
        return min;
    }
    public static class fraction{
        int num;
        int deno;
        public fraction(int num,int deno){
            this.num=num;
            this.deno=deno;
            simplify();
        }
        public void simplify(){
            // this func simplify the fraction and return it
            int hcf = gcd(num,deno);
            num/=hcf;
            deno/=hcf;
        }
    }
    public static void main(String[] args) {
        fraction f1 = new fraction(20,15);
        System.out.println(f1.num + "/" + f1.deno);

        fraction f2 = new fraction(35,21);
        System.out.println(f2.num + "/" + f2.deno);

        // addition of fraction
        System.out.println("addition of fraction");
        fraction f3 = add(f1,f2);
        System.out.println(f3.num+"/"+f3.deno);
        
        // multipliaction of fraction
        System.out.println("mulyipliaction of fraction");
        fraction f4 = mul(f1,f2);
        System.out.println(f4.num+"/"+f4.deno);
        

        
        
    }
    
}
