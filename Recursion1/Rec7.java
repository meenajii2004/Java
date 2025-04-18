package Recursion1;

import java.util.Scanner;

public class Rec7 {

static boolean LinearSearch(int arr[] ,int x , int idr){
    if(idr == arr.length-1){
        return false;
    }
    if(arr[idr] == x) {
        return true;
    }
    return LinearSearch(arr, x, idr+1);
}

static void LinearSearch2(int arr[] ,int x , int idr){
    if(idr >= arr.length){
        return ;
    }
    if(arr[idr] == x) {
        System.out.println(idr);
    }
    LinearSearch2(arr, x, idr+1);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements of the array : ");
        for (int i =0 ;i<n ;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element for Search : ");
        int x = sc.nextInt();

        LinearSearch2(arr, x, 0);
    }
}
