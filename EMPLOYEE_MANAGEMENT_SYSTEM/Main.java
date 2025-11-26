import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Employee> list = new ArrayList<>();

    public static void main(String[] args) {

        while(true) {
            System.out.println("\n1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Delete Employee");
            System.out.println("5. Update Employee");
            System.out.println("6. Sort by Name");
            System.out.println("7. Sort by Salary");
            System.out.println("8. Save to File");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch(choice) {

                case 1:
                    addEmployee();
                    break;

                case 2:
                    viewEmployees();
                    break;

                case 3:
                    searchEmployee();
                    break;

                case 4:
                    deleteEmployee();
                    break;

                case 5:
                    updateEmployee();
                    break;

                case 6:
                    sortByName();
                    break;

                case 7:
                    sortBySalary();
                    break;

                case 8:
                    saveToFile();
                    break;

                case 9:
                    System.out.println("Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // ---------------- METHODS ----------------
   
   
    //Case 1: Add Employees
    public static void addEmployee() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        list.add(new Employee(id, name, salary));
        Collections.sort(list, Comparator.comparingInt(Employee::getId));

        System.out.println("Employee Added Successfully!");
    }

    //Case 2: View Employees
    public static void viewEmployees() {
        if(list.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        System.out.println("---- Employee List ----");
        for(Employee e : list) {
            System.out.println(e);
        }
    }

    //Case 3: Search Employees
    public static void searchEmployee() {
        System.out.print("Enter ID to search: ");
        int search = sc.nextInt();

        for(Employee e : list) {
            if(e.getId() == search) {
                System.out.println("Employee Found: " + e);
                return;
            }
        }
        System.out.println("Employee Not Found!");
    }

    //Case 4: Delete Employees
    public static void deleteEmployee() {
        System.out.print("Enter ID to delete: ");
        int deleteId = sc.nextInt();

        for(Employee e : list) {
            if(e.getId() == deleteId) {
                list.remove(e);
                System.out.println("Employee Deleted Successfully!");
                return;
            }
        }

        System.out.println("Employee Not Found!");
    }

    //Case 5: Update Employees
    public static void updateEmployee() {
        System.out.print("Enter ID to update: ");
        int updateId = sc.nextInt();
        sc.nextLine();

        for(Employee emp : list) {
            if(emp.getId() == updateId) {

                System.out.print("Enter new Name: ");
                String newName = sc.nextLine();
                emp.setName(newName);

                System.out.print("Enter new Salary: ");
                double newSalary = sc.nextDouble();
                emp.setSalary(newSalary);

                System.out.println("Employee Updated Successfully!");
                return;
            }
        }

        System.out.println("Employee Not Found!");
    }
    
    //Case 6: Sort Employees by Name
    public static void sortByName() {
        Collections.sort(list, Comparator.comparing(Employee::getName));
        System.out.println("Sorted by Name successfully!");
    }
     
    //Case 7: Sort Employees by Salary
    public static void sortBySalary() {
        Collections.sort(list, Comparator.comparingDouble(Employee::getSalary));
        System.out.println("Sorted by Salary successfully!");
    }

    //Case 8: Save to File
    public static void saveToFile() {
        try {
            FileWriter fw = new FileWriter("employees.txt");

            for(Employee e : list) {
                fw.write(
                    e.getId() + "," +
                    e.getName() + "," +
                    e.getSalary() + "\n"
                );
            }

            fw.close();
            System.out.println("Employee data saved to employees.txt");

        } catch (Exception ex) {
            System.out.println("Error saving file: " + ex.getMessage());
        }
    }
}
