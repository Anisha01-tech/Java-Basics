// print  all natural no. 1 to n
import java.util.Scanner;
public class Recursion {
    static void printIncreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter no. you have to print");
        int n=sc.nextInt();
        printIncreasing(n);

    }
}

/* RECURSION :  A FUNCTION CALLING ITSELF WITH DIFF PARAMETER AND A HALTING COND AND BASE CASE TO TERMINATE THE
INFINITE LOOP.

IN RECURSION, WE SOLVE A BIGGER PROBLEM WHILE SOLVING THE SMALLER SUBPROBLEMS.

THE RESCURSION SPELL:
1. IDENTIFY THE SMALLER PROBLEM, LET RECURSION SOLVE IT.
2. SELF WORK, DO YOUR WORK.
3. IDENTIFY THE BASE CASE-> SMALLER PROBLEM FOR WHICH THE ANSWER IS OBVIOUS.

SYNTAX:

methodName(N parameter){
    if(halt_condition){
        return result;
    }
    return methodName(N parameter)
}
 */
