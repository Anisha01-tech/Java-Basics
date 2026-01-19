public class DisplayOfLLUsingRecursion {
    public static void display(Node head){
        if(head==null) return;
        System.out.print(head.data+" ");
        display(head.next);
    }
    // if we want to display LL in reverse order
    public static void displayr(Node head){
        if(head==null) return;
        display(head.next);
        System.out.print(head.data+" ");
        
    }
    public static class Node{         
        int data; 
        Node next; 

        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(5);   
        Node b=new Node(3);
        Node c=new Node(7);
        Node d=new Node(2);
        Node e=new Node(8);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        display(a);
        System.out.println( );
        displayr(a);
    }
    
}
