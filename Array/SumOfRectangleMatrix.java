package Array;

import java.util.Scanner;

public class SumOfRectangleMatrix {
    
static void InputArray(int [][] arr , int r , int c){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the elements of the matrix : ");
    for(int i = 0 ; i < r ; i++){
        for(int j = 0 ; j < c ; j++){
            arr[i][j] = sc.nextInt();
        }
    }
}

static void PrintArray(int [][] arr , int r , int c){
    System.out.println("The matrix is : ");
    for(int i = 0 ; i < r ; i++){
        for(int j = 0 ; j < c ; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
}

static int SumOfRectangleArray(int [][] arr , int r , int c , int x1 , int y1 , int x2 , int y2){
    int sum =0; 
    for(int i=x1 ; i<= x2 ; i++){
        for(int j=y1 ; j<=y2 ; j++){
            sum += arr[i][j];
        }
    }
    return sum;
}

static void  PrefixSum2DRowWise(int [][]Matrix){
    int r = Matrix.length;
    int c = Matrix[0].length;//We are assuming that the matrix is having altest one row.

    for (int i=0 ; i<r ; i++){
        for (int j=1 ; j<c ; j++){
            Matrix[i][j] += Matrix[i][j-1] ;
        }
    }
}

static int SumOfRectangleArray2(int [][] arr , int r , int c , int x1 , int y1 , int x2 , int y2){
int sum = 0;
    PrefixSum2DRowWise(arr);

    for(int i =x1 ; i<=x2 ; i++){
        if(y1 >=1 && y2 >=1){
            sum += arr[i][y2] - arr[i][y1-1];
        }
        else if(y1 >=1 && y2 <1 ){
            sum += arr[i][y2];
        }
        else if (y1 <1 && y2>=1 ){
            sum += arr[i][y2];
        }
        else{
            sum += arr[i][0];
        }
    }
    return sum;
}

static void PrefixSum2DColwise(int [][] Matrix ){ jhhjbhjgcdsa
    int r = Matrix .length;
    int c = Matrix[0].length;

    PrefixSum2DRowWise(Matrix);

    for (int j =0 ; j< c ; j++){
        for (int i=1 ; i<r ;i++){
            Matrix[i][j] += Matrix[i-1][j];
        }
    }
}

static int SumOfRectangleArray3(int [][] arr , int r , int c , int x1 , int y1 , int x2 , int y2){
    int sum =0 ; 

    PrefixSum2DColwise(arr);

    if(x1 > 0 && y1 > 0){
        sum = arr[x2][y2] - arr[x1-1][y2] - arr[x2][y1-1] + arr[x1-1][y1-1];
    }
    else if (x1 > 0 && y1 <= 0 ){
        sum = arr[x2][y2] - arr[x1-1][y2];
    }
    else if (x1 <= 0 && y1 > 0 ){
        sum = arr[x2][y2] - arr[x2][y1-1];
    }
    else{
        sum = arr[x2][y2];
    }
    return sum;
}

    public static void main(String[] args) {
        int r,c ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of the matrix :");
        r = sc.nextInt();
        c = sc.nextInt();

        int [][] arr = new int [r][c];
        InputArray(arr , r , c);

        PrintArray(arr , r , c);

        System.out.println("Enter the coordinates of the rectangle : ");
        int x1 , x2 , y1 ,y2;
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        int sum = SumOfRectangleArray3(arr, r, c, x1, y1, x2, y2);

        System.out.println("The Sum of the rectangle array is : "+ sum);
    }
}
