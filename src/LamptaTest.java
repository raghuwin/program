import java.util.ArrayList;
import java.util.Collections;

public class LamptaTest {

    public static void main(String arg[]){
        new Thread(() -> System.out.println("Its from runnable")).start();
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Employee one = new Employee("Raghu");
        Employee two = new Employee("Anbu");
        Employee three = new Employee("Zax");
        employees.add(one);
        employees.add(two);
        employees.add(three);

        Collections.sort(employees, (Employee e1 , Employee e2) -> e1.getName().compareTo(e2.getName()));
        for(Employee emp: employees) {
            System.out.println(emp.getName());
        }

        //FunctionalInterfaceTest functionalTest = new FunctionalInterfaceTest(){() -> System.out.println("Test")};
        Runnable run = new Runnable() {
            @Override
            public void run() {

            }
        };

        System.out.println(run.getClass().getName());
        Runnable run2 = () -> System.out.println("test");
        System.out.println(run2.getClass().getName());

        Runnable run3 = new Runnable() {
            @Override
            public void run() {

            }
        };
        System.out.println(run3.getClass().getName());

        Runnable run4 = () -> System.out.println("test");
        System.out.println(run4.getClass().getName());

        Runnable run5 = new Runnable() {
            @Override
            public void run() {

            }
        };
        System.out.println(run5.getClass().getName());

        FunctionalInterfaceTest test = () -> {
            System.out.println("test");
        };
        test.noString();
        System.out.println(test.getClass().getName());

        new FunctionalInterfaceTest.Test();

        FunctionalInterfaceTest test1 = new FunctionalInterfaceTest() {
            @Override
            public void noString() {
                System.out.println("Test   1");
            }
        };
        test1.noString();
        //Runnable run1 = new Runnable(){() -> System.out.println("test")};
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
