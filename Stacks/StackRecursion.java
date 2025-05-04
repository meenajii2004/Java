package Stacks;

import java.util.Stack;

public class StackRecursion {

    public static void DisplayRec(Stack<Integer> s){
        if(s.size() == 0) return;
        int Top = s.pop();
        System.out.print(Top +" ");
        DisplayRec(s);
        s.push(Top);
    }
    

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);
        DisplayRec(st);
        System.out.println(st);
    }
}
