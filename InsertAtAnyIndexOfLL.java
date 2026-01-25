public class InsertAtAnyIndexOfLL {
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
        void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){   // list empty
                head=temp;
                tail=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
        }
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
        void insertAtRandom(int idx,int val){
            Node t=new Node(val);
            Node temp=head;
            if(idx==size()){
                insertAtEnd(val);
                return;
            }
            else if(idx==0){
                insertAtStart(val);
                return;
            }
            else if(idx<0 || idx>size()){
                System.out.println("wrong index");
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
            
            
        }
       
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        int size(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        linkedlist l1= new linkedlist();
        l1.insertAtStart(4); //4
        l1.insertAtStart(9); // 9 -> 4
        l1.insertAtStart(12); // 12->9->4
        l1.insertAtStart(34);  //34->12->9->4
        l1.insertAtRandom(2, 67);   // 34->12->67->9->4 ,    index start from 0
        l1.insertAtRandom(0,100);
        l1.display();       

        
    }
    
}
