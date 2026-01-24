public class InsertAtBeginningOfLL {
    public static class Node{         
        int data; 
        Node next; 

        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        Node head=null;
        Node tail=null;
        void insertAtStart(int val){
            Node temp=new Node(val);
            if(head==null){   // list empty
                head=temp;
                tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
            
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        linkedlist l1= new linkedlist();
        l1.insertAtStart(4); //4
        l1.insertAtStart(9); // 9 -> 4
        l1.display();       

        
    }
    
}
