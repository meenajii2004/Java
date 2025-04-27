package LinkedListss;
import java.util.*;

public class Implementation {

    public static class Node {
        int data ;
        Node next; 

        Node(int data){
            this .data = data;
        }
    }

    public static class linkedlist{
        Node head= null;
        Node tail = null;
        int size =0 ;

        void insertAtEnd(int data ){
            Node temp = new Node(data);

            if(head == null){
                head = temp;
            }
            else{
                tail.next = temp ;
            }
            tail = temp;
            size++;
        }

        void insertAtBegining(int data){
            Node temp = new Node(data);

            if(head == null){
                head = temp;
            }
            else{
                temp.next = head ;
                head = temp;
            }
            size++;
        }

        void insertAtIndex(int index , int data ){
            Node tempval = new Node(data);
            Node temp = head;
            int count = 0;

            if(index == size()){
                insertAtEnd(data);
                size++;
                return ;
            }

            while(temp != null){

                if(index ==0){
                    insertAtBegining(data);
                    size++;
                    return ;
                }
                else if( index <0 || index > size()){
                    System.out.print("Enter a valid index .");
                    return ;
                }
                else if(count == (index -1 )){
                    tempval.next = temp.next ;
                    temp.next = tempval;
                    size++;
                    break;
                }
                else{
                    temp = temp.next;
                    count++;
                    size++;
                }
            }


        }

        int getAtIndex(int index){
            Node temp = head;
            for(int i =1 ;i <= index ; i++){
                temp = temp.next;
            }
            
            return temp.data;
        }

        void deleteAtIndex(int index ){
            Node temp = head ;
            int count = 0;

            if(index <0 || index > size ){
                System.out.println("Enter valid index .");
                return ;
            }
            else if (index == 0 ){
                head = head.next;
                size--;
                return;
            }
            else if(count == (index -1 )){
                temp.next = temp.next.next ;
            }
            else{
                temp = temp.next;
                count ++;
            }
            size--;
        }

        void Display(){
            Node temp = head ;
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    
        int size(){
            // int count =0;
            // Node temp = head;

            // while(temp != null){
            //     count++;
            //     temp = temp.next;
            // } 
            return size;
        }
    
    
    }
    

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(7);
        ll.insertAtEnd(9);
        ll.insertAtBegining(3);

        // ll.Display();
        // System.out.println();
        ll.insertAtIndex(1,19);
        
        
        ll.Display();
        
        System.out.println("");
        
        ll.deleteAtIndex(0);
        ll.Display();
        System.out.println("");
        
        // System.out.println(ll.getAtIndex(1));


        // System.out.println(ll.size());
        System.out.println(ll.head.data);
        System.out.println(ll.size);


    }
}
