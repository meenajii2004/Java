package Sorting;

import java.util.Scanner;

public class QuickSorting {
    
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

    static int Partition(int [ ] arr , int low , int high ){
        int pivot = arr[high];
        int i = low-1; 
        
        for(int j = low ; j<high ; j++){
            if(arr[j] <= pivot ){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }


    static void QuickSort(int arr[] , int low , int high){
        if(low<high){
            int pivotIndex = Partition(arr , low , high);
            QuickSort(arr, low, pivotIndex-1);
            QuickSort(arr, pivotIndex+1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the size of array : ");
        int n  = sc.nextInt();

        int arr [] = new int[n];

        System.out.println("Enter the Element of Array : ");
        InputArray(arr, n);

        QuickSort(arr, 0 , n-1);

        System.out.println("Sorted Array :");
        PrintArray(arr, n);
    }
}
