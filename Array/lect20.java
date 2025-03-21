package Array;

import java.util.Scanner;

public class lect20 {

    static void ArrayInput(int [][] arr , int r, int c){
        Scanner sc = new Scanner(System.in);
        for (int i=0 ; i<r ;i++){
            for (int j=0 ; j<c ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }

    static void PrintArray(int arr [][] ,int r , int c){
        for(int i=0 ; i<r ;i++){
            for (int j=0 ; j<c ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }



    static void multiplication(int [][] arr1 , int r1 , int c1 , int [][] arr2 , int r2 ,int c2){
        int res [][] = new int[r1][c2];

        if (c1 != r2 ){
            System.out.println("Multiplication not possible");
        }
        else{
            for(int i=0 ; i<r1;i++){//row of 1st matrix
                for(int j=0 ; j<c2 ; j++){//column of 2nd matrix
                    for(int k =0; k<r2;k++){
                        res[i][j] += arr1[i][k]*arr2[k][j];
                    }
                }
            }
        }
        PrintArray(res, r1, c2);
    }
    public static void main(String[] args) {
        int [][] arr = new int [2][3];
        int [][] arr2 = new int [3][2];

        System.out.println("Enter Element of 1st matrix");
        ArrayInput(arr , 2 , 3);
        System.out.println("Enter Element of 2nd Matrix");
        ArrayInput(arr2, 3 , 2);

        System.out.println("Multiplied Matrix is : ");
        multiplication(arr, 2, 3, arr2, 3, 2);

        
        }
}
