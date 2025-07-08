
import java.util.*;

class Sample {

    String EName;
    int EId;
    double ESalary;
    Scanner s = new Scanner(System.in);

    public void setName() {
        System.out.println("Enter Your Name : ");
        EName = s.nextLine();
    }

    public void setId() {
        System.out.println("Enter Your ID : ");
        EId = s.nextInt();
    }

    public void setSalary() {
        System.out.println("Enter Your Salary : ");
        ESalary = s.nextDouble();
    }

    public void getName() {
        System.out.println("Name :" + EName);
    }

    public void getId() {
        System.out.println("Id :" + EId);
    }

    public void getSalary() {
        System.out.println("Salary :" + ESalary);
    }

}

class Demo13 {

    public static void main(String[] args) {
        Sample obj = new Sample();
        Sample obj1 = new Sample();
	
	System.out.println("Enter the Info of Emp 1 ");
        obj.setName();
        obj.setId();
        obj.setSalary();

	System.out.println("Enter the Info of Emp 1 ");
        obj1.setName();
        obj1.setId();
        obj1.setSalary();

        obj.getName();
        obj.getId();
        obj.getSalary();

	obj1.getName();
        obj1.getId();
        obj1.getSalary();
    }
}
