public class BasicsLL {
    public static class Node{         // List Node
            int data; // value
            Node next; // address of next node

            Node(int data){
                this.data=data;
            }
        }
    public static void main(String[] args) {
        // Node x= new Node();
        // System.out.println(x);  // address
        // System.out.println(x.data);  //0
        // System.out.println(x.next);  // null

        Node a=new Node(5);   // head node
        System.out.println(a.next);      // null
        Node b=new Node(3);
        Node c=new Node(7);
        Node d=new Node(2);
        Node e=new Node(8);   // tail node  pointing to null
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println(a);  // adress of a 
        System.out.println(a.next);  // address of b
        System.out.println(b);       // address of b
        System.out.println(a.next.data); // data pf b
        System.out.println(a.next.next.data); // data of c


        // displaying data of LL using loop
        Node temp=a;
        while(temp!=null){
            System.out.println(temp.data+" ");   // 5 3 7 2 8
            temp=temp.next;
        }        
    }
    
}
        
