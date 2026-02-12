// Can we delete a node given the node itself as parameter


class ListNode
    {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
public class QuesOneOfLL {

    public void print(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void deleteNode(ListNode node){
        node.val=node.next.val;
        node.next=node.next.next;
    }
    public static void main(String[] args) {
        QuesOneOfLL obj = new QuesOneOfLL();

    
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.print("Original list: ");
        obj.print(head);

        
        ListNode nodeToDelete = head.next.next;
        obj.deleteNode(nodeToDelete);

        System.out.print("After deleting node: ");
        obj.print(head);
        
    }
    
}
