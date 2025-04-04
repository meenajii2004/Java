package Recursion1;

import java.util.Scanner;

public class Rec6 {

static int MaxInArray(int arr[] , int idr){

    if(idr == arr.length - 1) {
        return (arr[idr]);
    }

    int smallAns = MaxInArray(arr , idr+1);

    return Math.max(arr[idr] , smallAns);
    // 626786
}

static int SumOfArray(int arr[] , int idr){
    if(idr == arr.length-1){
        return arr[idr];
    }
    int smallAns = SumOfArray(arr , idr+1);
    return (arr[idr] + smallAns);
}

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );

        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();

        int arr[] = new int [n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // System.out.println("The maximum element in the array is : " + MaxInArray(arr , 0));
        System.out.println("The sum of the elements in the array is : " + SumOfArray(arr , 0));
    }
}
