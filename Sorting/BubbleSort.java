package Sorting;

import java.util.Scanner;

public class BubbleSort {

    static void InputArray(int [] arr , int r ){
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<r;i++){
                arr[i] = sc.nextInt();
        }
    }

    static void PrintArray(int [] arr , int r ){
        for(int i=0 ; i< r ;i++){
                System.out.print(arr[i] + " ");
            }
        }

    static public void Swap(int[] arr ,int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    static public void BubbleSorting(int arr[]){
        int n = arr.length;

        for(int i =0 ; i< n-1 ; i++){

            boolean flag = false;

            for(int j=0 ; j<n-1-i ; j++){

                if(arr[j] > arr[j+1]){
                    Swap(arr, j, j+1);
                    flag = true;

                }

                if(!flag){
                    return;
                }
}
            }
        }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the Element of Array ");
        InputArray(arr, n);

        BubbleSorting(arr);

        System.out.println("Sorted Array :");
        PrintArray(arr, n);

    }
}
