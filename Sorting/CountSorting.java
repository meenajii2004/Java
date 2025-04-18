package Sorting;

import java.util.Scanner;

public class CountSorting {
    
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

    static int findMax(int [] arr){
        int mx = Integer.MIN_VALUE;

        for(int val : arr){
            if(val > mx){
                mx = val;
            }
        }
        return mx;
    }

    static void BasicCountSort(int [] arr){
        int max = findMax(arr);
        int [] count = new int[max +1];

        for (int i =0 ; i<arr.length ; i++){
            count[arr[i]]++;
        }

        int index =0;
        for(int i = 0 ; i<=max ; i++){
            while(count[i] > 0){
                arr[index++] =i;
                count[i]--;
            }
        }


    }

    static void CountSort(int [] arr){
        int n = arr.length;
        int [] output = new int[n];
        int max = findMax(arr);
        int [] count = new int[max +1];

        for (int i =0 ; i<arr.length ; i++){
            count[arr[i]]++;
        }

        for(int i =1 ; i<count.length ; i++){
            count[i] += count[i-1];
        }

        for(int i =n-1 ; i>=0 ;i--){
            int idx = count[arr[i]]-1;
            output[idx] =arr[i];
            count[arr[i]]--;
        }

        for(int i=0 ; i < n ; i++){
            arr[i] = output[i];
        }

        // System.arraycopy(output, 0, arr, 0, n); Funtion for coping array into another .
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the size of array : ");
        int n  = sc.nextInt();

        int arr [] = new int[n];

        System.out.println("Enter the Element of Array : ");
        InputArray(arr, n);

        CountSort(arr);

        System.out.println("Sorted Array :");
        PrintArray(arr, n);
    }
}
