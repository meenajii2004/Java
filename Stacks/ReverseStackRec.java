package Stacks;

import java.util.Stack;

public class ReverseStackRec {

    public static void InsertAtBottom(Stack<Integer> st,int x){
        if(st.size() == 0){
            st.push(x);
            return;
        }
        int TopEle = st.pop();
        InsertAtBottom(st, x); 
        st.push(TopEle);
    }
    
    public static void reverse(Stack<Integer> stk){
        if(stk.size()==1) return;
        int Top = stk.pop();
        reverse(stk);
        InsertAtBottom(stk , Top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
}
