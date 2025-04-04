package Recursion1;

// import java.util.Scanner;

public class Rec5 {

    static void PrintArray(int arr[] , int idr){
        if(idr == arr.length){
            return ;
        }
        System.out.println(arr[idr]);
        PrintArray(arr, idr+1);
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        // int n = sc.nextInt();

        int arr[] = {1,2,3,4,5};
        System.out.println("Original Array : ");
        PrintArray(arr, 0);
    }
}
