package Stacks;

import java.util.Stack;

public class PushAtBottom {
    

    public static void PushBottom(Stack<Integer> stk , int x){
        if(stk.size() == 0){
            stk.push(x);
            return;
        }
        int Top = stk.pop();
        PushBottom(stk, x);
        stk.push(Top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        PushBottom(st, 6);
        System.out.println(st);
    }
}