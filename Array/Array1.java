package Array;

import java.util.Scanner;

class Student{
    int rollno;
    String name;

    Student(int r,String Name){
        this.rollno = r;
        this.name = Name;
    }
}

public class Array1 {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Students : ");
        n = sc.nextInt();
        Student[] arr = new Student[n];

        for (int i =0 ; i<n ;i++){
            System.out.println("Enter the Roll Number of Student "+(i+1));
            int roll = sc.nextInt();
            System.out.println("Enter the name of Student "+(i+1));
            String name = sc.next();
            arr[i] = new Student(roll,name);
        }

        for(int i =0 ; i<n ;i++){
            System.out.println("Roll Number of Student "+(i+1)+" is "+arr[i].rollno+" and Name is "+arr[i].name);
        }
    }
}
