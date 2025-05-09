package Queuess;

import java.lang.runtime.TemplateRuntime;

public class LLimplementationQueue {
    
    public static class Node{
        int data ;
        Node next ;
        
        Node(int data){
            this.data = data;
        }
    }
    
    
        public static class queueL{
            Node head = null ;
            Node tail = null;
            int size =0;

            public void add(int x){
                Node temp = new Node(x);
                if(size==0){
                    head = tail = temp ;
                }
                else{
                    tail.next = temp;
                    tail = temp;
                }
                size++;
            }

            public int remove(){
                if(size ==0 ){
                    System.out.println("Queue is Empty!");
                    return -1;
                }
                else{
                    int x = head.data;
                    head = head.next ;
                    size--;
                    return x;
                }
            }

            public int peek(){
                if(size ==0 ){
                    System.out.println("Queue is Empty!");
                    return -1;
                }
                else{
                    return head.data;
                }
            }

            public void Display(){
                Node temp = head;
                while(temp!=null){
                    System.out.print(temp.data +" ");
                    temp = temp.next;
                }
                System.out.println();
            }

            public int Size(){
                return size;
            }

            public boolean isEmpty(){
                if(size ==0){
                    return true;
                }
                else{
                    return false;
                }
            }
    
        }

    public static void main(String[] args) {
        queueL q = new queueL();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.Display();
        q.remove();
        q.Display();
        System.out.println(q.peek());
        System.out.println(q.Size());
    }
}
