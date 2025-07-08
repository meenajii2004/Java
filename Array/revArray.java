package Array;

import java.util.*;

class Student {

    int rollno;
    String name;

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;

    }
}

public class revArray {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the student ");
        n = sc.nextInt();

        Student[] arr = new Student[n];

        for(int i=0 ; i<n;i++){
            System.out.println("Enter the roll no of the student "+(i+1));
            int roll = sc.nextInt();
            System.out.println("Enter the Name of Student "+(i+1)); 
            String name = sc.next();
            arr[i] =new Student(roll,name);
        }

        for(int i=0 ; i<n ;i++){
            System.out.println("Name of the student "+(i+1)+" is " +arr[i].name +" and Roll Number is " +arr[i].rollno );
        }

    }

}
