package Searching;

import java.util.Scanner;

public class BinarySearch {
    
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

    static boolean  BinarySearching (int []arr , int x ){
        int size = arr.length;
        int start = 0;
        int end = size -1;
        int mid = ( start + end ) /2;

        while (start <= end ) { 
            if( x == arr[mid] ){
                return true ;
            }
            else if(x < arr[mid] ){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
    }

    static boolean RecursiveBinary(int []arr , int start , int end , int target ){
        if(start > end ) return false;

        int mid = (start +end) / 2; 

        if(target == arr[mid]){
            return true ;
        }
        else if(target < arr[mid]){
            return RecursiveBinary(arr, start, mid-1, target);
        }
        else{
            return RecursiveBinary(arr, mid+1, end, target);
        }
    }

    static int OccuranceBinary(int []arr , int target ){
        int start =0 , end= arr.length -1;
        int fo=-1;
        
        while (start < end ){
            int mid =(start + end )/2;
            if(target == arr[mid]){
                fo = mid ;
                end = mid-1;
            }
            else if(target < arr[mid] ){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return fo;
    }

    static int SquareRoot(int []arr , int target){
        int start =0 , end = arr.length -1;
        int answer = -1 ;

        while ( start <= end ){
            int mid = (start + end )/2;
            int value = arr[mid] * arr[mid] ;

            if(value == target){
                return mid ;
            }
            else if (target < value){
                end = mid-1;
            }
            else{
                start = mid+1;
                answer = mid;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of array : ");
        int n = sc.nextInt();

        int [] arr = new int[n];
        System.out.println("Enter the elements of array :");
        InputArray(arr, n);

        System.out.println("Enter the element : ");
        int x = sc.nextInt();

        // int index = OccuranceBinary(arr, x);

        // if(index != -1){
        //     System.out.println("First Occurence of " +x+ " is " + index);
        // }else{
        //     System.out.println(x + " is not found in the Array ");
        // }

        int index = SquareRoot(arr, x);

        if(index != -1){
            System.out.println("First Occurence of " +x+ " is " + index);
        }else{
            System.out.println(x + " is not found in the Array ");
        }

        // if(RecursiveBinary(arr, 0, n-1, x)){
        //     System.out.println("Element Found .");
        // }else{
        //     System.out.println("Element not found .");
        // }
    }
}
