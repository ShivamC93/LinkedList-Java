public class LL2 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedList{
        Node head = null;
        Node tail = null;
        void insertAtEnd(int val){//receive single parameter val.
            Node temp = new Node(val);
            if(head==null){
                head=tail=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
        }
        void insertAt(int idx, int val){
            Node t = new Node(val); //created new node
            Node temp = head;
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
        int getEle(int idx){
            Node temp = head;
            for(int i=1;i<=idx;i++){
                temp = temp.next;
            }
            return temp.data;
        }

        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head==null){
                head=tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }     

        void deleteAt(int idx){
            if(idx == 0) head =head.next;
            Node temp = head;
            for(int i =1;i<=idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }

        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+ " ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        linkedList l1 = new linkedList();
        l1.insertAtEnd(4);
        l1.insertAtEnd(5);
        l1.insertAtHead(3);
        l1.insertAtHead(6);
        l1.insertAt(3, 9);
        l1.deleteAt(2);
        l1.display();
        //System.out.println(l1.getEle(4));
    }
}

