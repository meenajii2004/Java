package Array;

import java.util.Scanner;

public class PascalTriangle {

    static void PrintMatrix(int [][] arr){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int [][] PascalTriangle(int n){
        int [][] res = new int [n][];
        for(int i=0 ;i <n ; i++){
            res[i]= new int[i+1];
            res[i][0] = 1;
            res[i][i] = 1;
            for (int j=0 ; j<i ;j++){
                if(i>1 && j>0 ){
                    res[i][j] = res[i-1][j-1]+ res[i-1][j];
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n ;

        System.out.println("Enter the number for the Pascal Triangle : ");
        n = sc.nextInt();

        int [][] res = PascalTriangle(n);

        PrintMatrix(res);
    }
}