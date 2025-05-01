package LinkedListss;

public class DoublyLinked {

    public static void Display(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void DisplayRev(Node tail){
        Node temp = tail;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void Display2(Node random){
        Node temp = random;

        while(temp.prev != null){
            temp = temp.prev;
        }

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static Node insertAtHead(Node head , int x){
        Node t = new Node(x);

        t.next = head ;
        head.prev = t;
        head = t;
        return head;
    }

    public static Node insertAtTail1(Node tail , int x){
        Node t = new Node(x);

        tail.next = t;
        t.prev = tail;
        tail = t;
        return tail;
    }

    public static void insertAtTail2(Node head , int x){
        Node t = head;

        while(t.next !=null){
            t = t.next;
        }

        Node temp = new Node(x);
        t.next = temp;
        temp.prev = t;        
    }

    public static Node insertAtIndex(Node head, int index, int x) {
        Node newt = new Node(x);

        // Case 1: Insert at index 0 (update head)
        if (index == 0) {
            newt.next = head;
            if (head != null) {
                head.prev = newt;
            }
            head = newt;
            return head;
        }

        // Case 2: Insert at any other index
        Node temp = head;
        int count = 0;

        while (temp != null) {
            if (count == index - 1) { // Found the position to insert
                newt.next = temp.next;
                if (temp.next != null) { // Check if temp.next is not null
                    temp.next.prev = newt;
                }
                temp.next = newt;
                newt.prev = temp;
                return head; // Return the unchanged head
            }
            count++;
            temp = temp.next;
        }

        // If index is out of bounds, do nothing
        System.out.println("Index out of bounds");
        return head;
    }

    public static class Node{
        int data ;
        Node next ;
        Node prev;

        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(7);
        Node e = new Node(9);

        a.prev = null;
        a.next = b;
        b.next = c;
        b.prev = a;
        c.next = d;
        c.prev = b;
        d.next = e;
        d.prev = c;
        e.prev = d;
        e.next = null;

        // Display(a);
        // DisplayRev(e);
        Display2(c);

        // insertAtTail2(a, 40);
        insertAtIndex(a, 2, 105);

        Display(a);
    }
    
}
