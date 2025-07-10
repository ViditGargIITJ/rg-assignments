import java.util.ArrayList;
import java.util.Scanner;
public class Employee {
    private int id;
    private String name;
    private String department;

    // Constructor
    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // To display employee details
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Dept: " + department;
    }
}


class EmployeeCRUD {
    ArrayList<Employee> employees = new ArrayList<>();

    // Create
    public void addEmployee(Employee emp) {
        employees.add(emp);
        System.out.println("Employee added.");
    }

    // Read
    public void displayAllEmployees() {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

    // Update
    public void updateEmployee(int id, String newName, String newDept) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                emp.setName(newName);
                emp.setDepartment(newDept);
                System.out.println("Employee updated.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    // Delete
    public void deleteEmployee(int id) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                employees.remove(emp);
                System.out.println("Employee removed.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }


    public static void main(String[] args) {
        EmployeeCRUD crud = new EmployeeCRUD();

        Employee e1 = new Employee(101, "Alice", "HR");
        Employee e2 = new Employee(102, "Bob", "Finance");

        crud.addEmployee(e1);
        crud.addEmployee(e2);

        System.out.println("\nAll Employees:");
        crud.displayAllEmployees();

        System.out.println("\nUpdating Bob's department to Marketing...");
        crud.updateEmployee(102, "Bob", "Marketing");

        System.out.println("\nAll Employees After Update:");
        crud.displayAllEmployees();

        System.out.println("\nDeleting Employee with ID 101...");
        crud.deleteEmployee(101);

        System.out.println("\nAll Employees After Deletion:");
        crud.displayAllEmployees();
    }
}
