package Recursion1;

import java.util.Scanner;

public class Rec3 {

    static void MultipleOf(int n , int m){
        if(m==1){
            System.out.println(n);
            return;
        }
        MultipleOf(n, m-1);
        System.out.println(n*m);
        }
    
    static int SumOfSeries(int n){
        if(n==0) return 0;
        return n + SumOfSeries(n-1);
    }

    static int AlternateSumOfSeries(int n){
        if(n==0) return 0;
        if(n%2 == 0) return AlternateSumOfSeries(n-1) -n;
        else return AlternateSumOfSeries(n-1)+n;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // System.out.println("Enter the number to find multiple of : ");
        // int n = sc.nextInt();
        // System.out.println("Enter the number of multiples : ");
        // int m = sc.nextInt();
        
        // System.out.println("Multiples of " + n + " are : ");
        // MultipleOf(n,m);
        
        // System.out.println("Enter the number to find sum of series : ");
        System.out.println("Enter the number to find sum of Alternative series : ");
        int n = sc.nextInt();
        // System.out.println(SumOfSeries(n));
        System.out.println(AlternateSumOfSeries(n));
    }
}
