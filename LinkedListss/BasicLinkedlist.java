package LinkedListss;

public class BasicLinkedlist {
    
    public static class Node{
        int data ;
        Node next ;

        Node(int data ){
            this.data = data;
        }
    }


    public static void main(String[] args) {
        Node a = new Node(8);
        Node b = new Node(5);
        Node c = new Node(10);

        a.next = b;

        System.out.println(a.next.data);

    }
}
