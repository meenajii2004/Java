import java.util.Scanner;

public class lect7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number .");
        int n = sc.nextInt();
        int i =1;
        int k =1;
        
        while (i<=n) {
            System.out.println(i);
            i++;
        }

        for(int j = 0 ; j<=n ; j++){
            System.out.println(j);
        }

        do {
            System.out.println(k);
            k++;
        } while (k<=n);
        
        
            }
        
}
