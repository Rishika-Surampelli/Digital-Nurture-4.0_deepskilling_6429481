package employeemanagement;

public class EmployeeManager {
    private Employee[] employees;
    private int size;

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    public void addEmployee(Employee emp) {
        if (size < employees.length) {
            employees[size++] = emp;
            System.out.println("Employee added: " + emp);
        } else {
            System.out.println("Cannot add more employees. Capacity full.");
        }
    }

    public void searchEmployee(String empId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(empId)) {
                System.out.println("Employee found: " + employees[i]);
                return;
            }
        }
        System.out.println("Employee not found with ID: " + empId);
    }

    public void traverseEmployees() {
        System.out.println("All Employees:");
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public void deleteEmployee(String empId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(empId)) {
                // Shift remaining
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--size] = null;
                System.out.println("Employee deleted with ID: " + empId);
                return;
            }
        }
        System.out.println("Employee not found with ID: " + empId);
    }
}
