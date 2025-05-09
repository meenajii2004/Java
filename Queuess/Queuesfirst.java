package Queuess;

import java.util.LinkedList;
import java.util.Queue;

public class Queuesfirst{
    public static void main(String[] args) {
        Queue q = new LinkedList();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        Queue helper = new LinkedList<>();

        while(q.size()>0){
            System.out.print(q.peek() + " ");
            helper.add(q.poll());
        }
        while(helper.size()>0){
            q.add(helper.poll());
        }


    }
}