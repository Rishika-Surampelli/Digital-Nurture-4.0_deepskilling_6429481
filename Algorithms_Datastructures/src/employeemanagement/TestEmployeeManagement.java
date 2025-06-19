package employeemanagement;

public class TestEmployeeManagement {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        manager.addEmployee(new Employee("E001", "Ravi", "Manager", 75000));
        manager.addEmployee(new Employee("E002", "Anita", "Developer", 55000));
        manager.addEmployee(new Employee("E003", "Suman", "Tester", 45000));

        System.out.println("\n-- Traversing Employees --");
        manager.traverseEmployees();

        System.out.println("\n-- Searching for E002 --");
        manager.searchEmployee("E002");

        System.out.println("\n-- Deleting E001 --");
        manager.deleteEmployee("E001");

        System.out.println("\n-- Final List --");
        manager.traverseEmployees();
    }
}
