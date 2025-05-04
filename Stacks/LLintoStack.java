package Stacks;

import javax.sound.midi.Soundbank;

public class LLintoStack {
    

    public static class Node{
        int data ;
        Node next ;

        Node(int data ){
            this.data = data;
        }
    }

    public static class Stackss{
        Node head = null;
        int size = 0;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head ;
            head = temp;
            size++;
        }

        int pop (){
            if(head == null){
                System.out.println("Stack Empty .");
                return -1;
            }

            int Top = head.data;
            head = head.next;
            size--;
            return Top;
        }

        int peek(){
            if(head == null){
                System.out.println("Stack Empty .");
                return -1;
            }
            return head.data;
        }

        void DisplayRec(Node h){
            if(h == null) return ;
            DisplayRec(h.next);
            System.out.print(h.data + " ");
        }

        void Display(){
            DisplayRec(head);
            System.out.println();
        }

        void DisplayRev(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data +" ");
                temp = temp.next;
            }
            System.out.println();
        }

        boolean isEmpty(){
            if(head == null) return true;
            else return false;
        }


    }

    public static void main(String[] args) {
        Stackss stk = new Stackss();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);

        stk.Display();
        stk.pop();
        stk.Display();
        System.out.println(stk.peek());
    }
}
