package Array;

import java.util.Scanner;

public class RotateMatrix {
    
static void InputArray(int [][] arr , int r , int c ){
    Scanner sc = new Scanner(System.in);
    for (int i=0;i<r;i++){
        for(int j=0 ; j<c ; j++){
            arr[i][j] = sc.nextInt();
        }
    }
}

static void PrintArray (int [][] arr , int r , int  c){
    for(int i=0 ; i< r ;i++){
        for (int j=0 ; j<c ; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
}

// Method 1 to tranpose matrix
// static int [][] TransposeMatrix(int [][] arr , int r , int c){
//     int [][] res = new int[c][r];

//     for(int i=0 ; i<r ; i++){
//         for(int j=0 ; j<c ; j++){
//             res[j][i] = arr[i][j];
//         }
//     }
//     return res;
// }

// Method 2 to tranpose matrix
// This will work when the ratio is same of the matrix i.e. n==m
static int [][] TransposeMatrix(int [][] arr , int r , int c){
    for(int i=0; i<r;i++){
        for(int j=i+1 ; j<c;j++){
            int temp = arr[i][j];
            arr[i][j] = arr [j][i];
            arr[j][i] =temp;
        }
    }
    return arr;
}

// Reverse the matrix
static int[][] RotateMatrix (int [][]arr , int r , int c){
    TransposeMatrix(arr, r, c);
    for (int i=0 ; i<r ; i++){
        int start =0 , end = c-1;
        while(start < end){
            int temp = arr[i][start];
            arr[i][start] = arr[i][end];
            arr[i][end] = temp;
            start++;
            end--;
        }
    }
    return arr;
}


public static void main(String[] args) {

    // We are supposing that the size of the matrix is same i.e. n==m
    
    Scanner sc = new Scanner(System.in);

    int n , m ;

    System.out.println("Enter the size of matrix :");
    n= sc.nextInt();
    m= sc.nextInt();

    int [][] arr = new int[n][m];

    System.out.println("Enter the Element of Matrix : ");

    InputArray(arr, n, m);

    System.out.println("Original Matrix : ");
    PrintArray(arr, n, m);

    int res [][] = RotateMatrix(arr, n, m);

    System.out.println("Rotated Matrix :");
    PrintArray(res, m, n);
}
}

