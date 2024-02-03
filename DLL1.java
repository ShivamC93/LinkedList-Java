public class DLL1 {
    public static class Node{
        int val ;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }
    public static void displatHead(Node head){
        Node temp = head;
        while(temp!= null){
            System.out.println(temp.val + " ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node insertAt(Node head, int x){
        Node t = new Node(30);
        t.next = head;
        head.prev = t;
        head = t;
        return head;

    }

    public static void displayRev(Node tail){
        Node temp = tail;
        while(temp!=null){
            System.out.println(temp.val+ " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(5);
        Node c = new Node(8);
        Node d = new Node(9);
        Node e = new Node(3);
        a.prev = null;
        a.next=b;
        b.prev = a;
        b.next =c;
        c.prev = b;
        c.next =d;
        d.prev =c;
        d.next =e;
        e.prev = d;
        e.next =null;
        //display the linked list
        //displatHead(a);
        //displayRev(e);
        Node newHead = insertAt(a, 35);
        displatHead(newHead);
    }
}
