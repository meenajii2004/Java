package Array;

import java.util.Scanner;

public class SpiralMatrix {
    
    static void InputArray(int [ ][] arr , int r , int c ){
        Scanner sc = new Scanner(System.in);
        for (int i=0 ; i<r ;i++){
        for (int j=0 ; j<c ; j++){
            arr[i][j]= sc.nextInt();
        }
    }
}

    static void PrintArray(int [][] arr , int r , int c ){
        for (int i =0 ; i<r;i++){
            for (int j=0 ; j<c ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
    }
    }

    static void SpiralMatrixprint (int [][] arr , int r,int c){
        int toprow =0 , bottomrow = r-1 , firstcol = 0 , lastcol = c-1;
        int totalElements = 0;

        while(totalElements <r*c){
            //for first row 
            for (int j= firstcol ; j <= lastcol  && totalElements < r*c ; j++){
                System.out.print(arr[toprow][j] + " ");
                totalElements++;
            }
            toprow++;

            //for last column
            for(int i=toprow ; i<=bottomrow && totalElements < r*c ; i++){
                System.out.print(arr[i][lastcol] + " ");
                totalElements++;
            }
            lastcol--;

            //for last row
            for(int j =lastcol ;j>=firstcol && totalElements < r*c ;j--){
                System.out.print(arr[bottomrow][j] + " ");
                totalElements++;
            }
            bottomrow--;

            //for first column 
            for(int i = bottomrow ; i>=toprow && totalElements < r*c ; i--){
                System.out.print(arr[i][firstcol] + " ");
                totalElements++;
            }
            firstcol++;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of the matrix: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [][] matrix = new int [rows][cols];

        System.out.println("Enter the Elements of the matrix :");
        InputArray(matrix,rows,cols);

        System.out.println("Input Matrix is :");
        PrintArray(matrix,rows,cols);

        System.out.println("Sprial Matrix is :");
        SpiralMatrixprint(matrix , rows , cols);


    }
}
