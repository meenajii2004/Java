import java.util.*;

public class ArrayDemo 
{
    public static void main(String[] args) {
        int a[] = new int[5];
        int sum=0 , mul =1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integers:");
        
        for(int i=0 ; i<5 ; i++){
            a[i] = sc.nextInt();
        }

        for(int i=0 ; i<5 ; i++){
            sum += a[i];
            mul *= a[i];
        }
        System.out.println("Sum of arrray elements: "+sum);
        System.out.println("Multiplication of array elements:"+mul);
        
    }
}
