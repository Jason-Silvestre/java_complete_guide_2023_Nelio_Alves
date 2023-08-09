import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Name: ");
        student.name = sc.nextLine();

        System.out.println("First Quarter's Grade: ");
        student.firstQuartersGrade = sc.nextDouble();
        System.out.println("Second Quarter's Grade: ");
        student.secondQuartersGrade = sc.nextDouble();
        System.out.println("Third Quarter's  Grade: ");
        student.thirdQuartersGrade = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", student.finalQuartersGrade());

        if (student.finalQuartersGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.println(String.format("MISSING %.2f", student.missingPoints()) + " POINTS");
        } else {
            System.out.println("PASS");
        }
    }
}