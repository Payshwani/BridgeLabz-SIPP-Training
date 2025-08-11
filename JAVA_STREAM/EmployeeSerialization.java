import java.io.*;
import java.util.*;

class Employee implements Serializable {
    int id; String name, dept; double salary;
    Employee(int id, String name, String dept, double salary) {
        this.id = id; this.name = name; this.dept = dept; this.salary = salary;
    }
    public String toString() { return id + ", " + name + ", " + dept + ", " + salary; }
}

public class EmployeeSerialization {
    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(
            new Employee(1,"Alice","HR",50000),
            new Employee(2,"Bob","IT",60000),
            new Employee(3,"Carol","Finance",70000)
        );
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.ser"))) {
            oos.writeObject(emps);
            System.out.println("Employees serialized.");
        } catch (IOException e) { e.printStackTrace(); }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employees.ser"))) {
            List<Employee> list = (List<Employee>) ois.readObject();
            System.out.println("Deserialized:");
            for (Employee e : list) System.out.println(e);
        } catch (IOException | ClassNotFoundException e) { e.printStackTrace(); }
    }
}
