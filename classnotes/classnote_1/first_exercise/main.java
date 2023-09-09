import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine();

        Employee[] employees = new Employee[numEmployees];

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee " + (i + 1));
            System.out.print("Enter employee ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();

            System.out.print("Enter gross salary: ");
            double grossSalary = scanner.nextDouble();
            scanner.nextLine();

            employees[i] = new Employee(id, name, grossSalary);

            System.out.println();
        }

        System.out.println("Payroll Information:");
        for (Employee employee : employees) {
            employee.calculateAndDisplayPayroll();
            System.out.println();
        }

        scanner.close();
    }
}