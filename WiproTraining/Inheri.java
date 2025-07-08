interface B{
    public void display();
}

interface C{
    public void show();
}

class A implements B, C
{
    
    void print() {
        System.out.println("Class A");
    }
    
    public void display() {
        System.out.println("Display from interface B");
    }

    public void show() {
        System.out.println("Show from interface C");
    }

}


public class Inheri extends A {
    public static void main(String[] args) {
        Inheri obj = new Inheri();
        obj.print();
        obj.display();
        obj.show();
    }

}

