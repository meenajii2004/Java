package Recursion1;

import java.util.Scanner;

public class Rec2 {
static int SumDigit(int n){
    if(n>=0 && n<=9){
        return n;
    }
    return n%10 + SumDigit(n/10);
}


// static int PowerOf(int p , int q){
//     if(q==0){
//         return 1;
//     }
//     return p * PowerOf(p,q-1);
// }

static int PowerOf2(int p,int q){
    if(q==0) return 1;

    int smallpow = PowerOf2(p,q/2);

    if(q%2 == 0){
        return smallpow *smallpow;
    }
    else{
        return  p * smallpow * smallpow;
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find the sum of : ");
        int n = sc.nextInt();
        System.out.println("The sum is : "+SumDigit(n));

        System.out.println("Enter a number to find the power of and power :");
        int p = sc.nextInt();
        int q = sc.nextInt();

        System.out.println("The power is : "+PowerOf2(p,q));
    }
}
