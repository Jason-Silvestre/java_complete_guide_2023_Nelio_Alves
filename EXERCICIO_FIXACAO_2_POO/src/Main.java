import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Enter the employee's name: ");
        employee.name = sc.nextLine();

        System.out.println("Enter the employee's gross salary: ");
        employee.grossSalary = sc.nextDouble();

        System.out.println("Enter the employee's Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + employee);
        System.out.println();
        System.out.print("Which percentage to increase salary? ");

        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("");
        System.out.println("Updated data: " + employee);
        sc.close();
    }
}