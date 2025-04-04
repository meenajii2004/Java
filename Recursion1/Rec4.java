package Recursion1;

import java.util.Scanner;

public class Rec4 {

    static int GCD(int x , int y){
        if(y==0) return x ;
        return GCD(y,x%y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int x = sc.nextInt();   
        System.out.println("Enter the second number : ");
        int y = sc.nextInt();
        System.out.println("GCD of " + x + " and " + y + " is : " + GCD(x,y));
    }
}
