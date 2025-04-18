package Sorting;

import java.util.Scanner;

public class MergeSorting {

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

        static void Merge(int [] arr , int start , int mid , int end){
            int a1 = mid - start + 1; //size of left array 
            int b1 = end - mid ; //size of right array

            int left [] = new int[a1];
            int right [] = new int[b1];

            for(int i=0 ; i<a1 ; i++){
                left[i] = arr[start + i];
            }
            for(int i=0 ; i<b1 ; i++){
                right[i] = arr[mid + 1 + i];
            }

            int i = 0 ,  j = 0 , k = start ;

            while(i<a1 && j<b1){
                if(left[i] <= right[j]){
                    arr[k] = left[i];
                    i++;
                }
                else{
                    arr[k] = right [j];
                    j++;
                }
                k++;
            }
            while(i<a1 && j == b1 ){
                arr[k] = left[i];
                i++;
                k++;
            }
            while(i==a1 && j<b1){
                arr[k] = right[j];
                j++;
                k++;
            }
        }

        static void MergeSort(int []arr , int start , int end ){
            if(start >= end ){
                return ;
            }
            int mid = (start + end)/2;

            MergeSort(arr , start , mid);
            MergeSort(arr , mid+1 , end);

            Merge(arr , start , mid , end);

        }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the size of array : ");
        int n  = sc.nextInt();

        int arr [] = new int[n];

        System.out.println("Enter the Element of Array : ");
        InputArray(arr, n);

        MergeSort(arr, 0 , n-1);

        System.out.println("Sorted Array :");
        PrintArray(arr, n);

        

    }
}
