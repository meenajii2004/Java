package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BucketSort {
    
    static void InputArray(float [] arr , int r ){
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<r;i++){
                arr[i] = sc.nextFloat();
        }
    }

    static void PrintArray(float [] arr , int r ){
        for(int i=0 ; i< r ;i++){
                System.out.print(arr[i] + " ");
            }
        }

    static void BucketSorting(float[] arr) {
        int n = arr.length;

        // Find the maximum value in the array
        float max = Float.MIN_VALUE;
        for (float num : arr) {
            if (num > max) {
                max = num;
            }
        }

        // Normalize the array elements to the range [0, 1]
        float[] normalizedArr = new float[n];
        for (int i = 0; i < n; i++) {
            normalizedArr[i] = arr[i] / max;
        }

        ArrayList<Float>[] bucket = new ArrayList[n];

        // Initialize buckets
        for (int i = 0; i < n; i++) {
            bucket[i] = new ArrayList<>();
        }

        // Add elements to buckets
        for (int i = 0; i < n; i++) {
            int BucketIndex = (int) (normalizedArr[i] * n);
            if (BucketIndex == n) BucketIndex = n - 1;
            bucket[BucketIndex].add(arr[i]); // Add original value to bucket
        }

        // Sort each bucket
        for (int i = 0; i < bucket.length; i++) {
            Collections.sort(bucket[i]);
        }

        // Merge all buckets
        int index = 0;
        for (int i = 0; i < bucket.length; i++) {
            for (float num : bucket[i]) {
                arr[index++] = num;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        float [] arr = new float[n];

        System.out.println("Enter the element of the array : ");
        InputArray(arr, n);

        BucketSorting(arr);

        System.out.println("Sorted Array :");
        PrintArray(arr, n);

    }
}
