package Stacks;

import java.util.Stack;

public class MoveStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
    Stack<Integer> gt = new Stack<>();
    Stack<Integer> rt = new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);

    while(st.size()>0){
        gt.push(st.pop());
    }
    while(gt.size()>0){
        rt.push(gt.pop());
    }

    System.out.println(st);
    System.out.println(gt);
    System.out.println(rt);
    }



}
