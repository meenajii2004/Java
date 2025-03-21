package Array;

import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {
        boolean Result = true;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of array : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=1 ; i<n ;i++){
            if(arr[i] < arr[i-1]){
                Result = false;
                break;
            }
        }

        System.out.println("Result is : "+Result);
        
    }
}