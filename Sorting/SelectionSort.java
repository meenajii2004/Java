package Sorting;

import java.util.Scanner;
import java.util.function.IntUnaryOperator;

public class SelectionSort {
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

    static public void SelectionSorting(int [] arr){
        int n = arr.length;

        for(int i = 0 ; i< n-1 ;i++){
            int min_index = i;
            for(int j=i ; j<n-1 ; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            Swap(arr, i, min_index);
        }
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array :");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of array :");
        InputArray(arr, n);

        SelectionSorting(arr);

        System.out.println("Sorted Array : ");
        PrintArray(arr, n);
    }
}
