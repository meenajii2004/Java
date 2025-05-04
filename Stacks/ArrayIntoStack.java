package Stacks;

import java.util.Scanner;

public class ArrayIntoStack {

    public static class Stacks{

        int SizeArray = 0;
        int[] arr ;

        public Stacks(int SizeArray) {
            this.SizeArray = SizeArray;
            this.arr = new int[SizeArray];
        }

        int idx =-1;

        void push(int x ){
            if(isFull()){
                System.out.println("Stack Overflow ");
                return ;
            }
            idx++;
            arr[idx]= x;
        }

        int peek(){
            if(idx <0 ){
                System.out.println("Stack is Empty ");
                return -1; 
            }
            return arr[idx];
        }

        int pop(){
            if(isEmpty()){
                System.out.println("Stack UnderFlow ");
                return -1;
            }
            int Top = arr[idx];
            arr[idx ] = 0;
            idx-- ;
            return Top;
        }

        int capacity(){
            return arr.length;
        }

        int size(){
            return idx +1;
        }

        boolean isEmpty(){
            if(idx == -1) return true;
            else return false;
        }

        boolean isFull(){
            if(idx == (capacity()-1)) return true ;
            else return false;
        }

        void Display(){
            for(int i=0 ;i<=idx;i++){
                System.out.print(arr[i] +" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entert the size of Stack :");
        int n = sc.nextInt();
        Stacks st = new Stacks(n);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.Display();
        st.pop();
        st.Display();
        // System.out.println(st.isEmpty());
        // System.out.println(st.isFull());
        System.out.println(st.capacity());
        System.out.println(st.size());
    }
    
}
