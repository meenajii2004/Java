package LinkedListss;
import java.util.*;

public class BasicLinkedlist {

    public static void RecursiveDisplay(Node head ){
        if(head == null) return ;

        System.out.print(head.data  +" ");
        RecursiveDisplay(head.next);
    }

    public static void DisplayReverse(Node head ){
        if(head == null) return ;
        DisplayReverse(head.next);
        System.out.print(head.data  +" ");
    }
    
    public static void Display(Node head){
        Node temp = head;

        while (temp!=null) {
                System.out.print(temp.data +" ");
                temp = temp.next;
            }
    }

    public static int LengthOfLL(Node head){
        int count =0 ;

        while(head != null){
            count++;
            head = head.next;
            // LengthOfLL(head.next);
        }

        return count;
    }


    
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
        Node d = new Node(105);
        Node e = new Node(1064);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // Node temp = a ;
        // for(int i=1 ; i<=5 ; i++){
        //     System.out.print(temp.data +" ");
        //     temp = temp.next;
        // }

        // Display(a);
        // System.out.println("");
        // DisplayReverse(a);


        // while (temp!=null) {
        //     System.out.print(temp.data +" ");
        //     temp = temp.next;
        // }


        System.out.println(LengthOfLL(a));

    }
}
