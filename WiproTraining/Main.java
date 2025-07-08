class Base
{
    void show(){
        System.out.println("Base class method");
    }

    int sum(int a , int b ){
        return a+b;
    }
}
public class Main extends Base 
{
    public static void main(String[] args) {
        Base b = new Base();
        b.show();
        System.out.println(b.sum(2,5));
    }
}
