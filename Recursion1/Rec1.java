package Recursion1;
// Recursion/Rec1.java

import java.util.Scanner;

public class Rec1{
    
    static int Factorial(int n ){
        if (n == 0 || n == 1 ){
            return 1; 
        }
        return n * Factorial(n-1);
    }

    static int Fibonacci(int n ){
        if(n ==0 || n == 1 ) return n;
        return Fibonacci(n-1 )+ Fibonacci(n-2);
    }

    static void  PrintFibonacci(int n ){
        for(int i =0 ; i<n ;i++){
            System.out.print(Fibonacci(i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number to find factorial : ");
        System.out.println("Enter a number to find Fibonacci : ");
        int n = sc.nextInt();
        // int result = Factorial(n);
        int result = Fibonacci(n);
        System.out.println("Fibonacci of " + n + " is : "+ result);
        // System.out.println("Factorial of " + n + " is : "+ result);
    }
}