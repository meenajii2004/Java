import java.util.*;

class Demo12
{
	public static void main(String []args){
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice ");
		a = sc.nextInt();
		System.out.println("Enter First Value");
		b = sc.nextInt();
		System.out.println("Enter Second Value");
		c = sc.nextInt();

		switch(a)
			{
				case 1 : System.out.println(c+b);
					 break;
				case 2 : System.out.println(c-b);
					 break;
				case 3 : System.out.println(c/b);
					 break;
				case 4 : System.out.println(c*b);
					 break;
		}
	}
}