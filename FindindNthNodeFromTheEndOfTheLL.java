/* Finding Nth node from the end of the LL (only head is given)
if we have m nodes then
nth node from last=(m - n + 1th) node from start
*/

public class Ques2ofLL {
    // in this we do traversal two times
    public static Node nthNode(Node head , int n){
        int size=0;
        Node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int m=size - n + 1;
        //mth node from start
        temp=head;
        for(int i=1;i<=m-1;i++){
            temp=temp.next;

        }
        return temp;
    }

    // in one traversal
    public static Node nthnode2(Node head, int n){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    } 
    public static class Node{         
        int data; 
        Node next; 

        Node(int data){
            this.data=data;
        }
    }
  
    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(13);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(15);
        Node f=new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        Node q=nthNode(a,2);
        Node p=nthnode2(a,2);
        System.out.println(q.data);
        System.out.println(p.data);
        
        
    }
    
}
