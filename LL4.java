public class LL4 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static Node deleteAtEnd(Node head, int n){
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static void display(Node head){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(90);
        Node c = new Node(80);
        Node d = new Node(70);
        Node e = new Node(60);
        Node f = new Node(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        display(a);
        a = deleteAtEnd(a, 6);
        display(a);
    }
}
