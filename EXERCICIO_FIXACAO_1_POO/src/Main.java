import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangule rectangule;
        rectangule = new Rectangule();

        System.out.println("Enter the reactangule's width: ");
        rectangule.width = sc.nextDouble();
        System.out.println("Enter the reactangule's height: ");
        rectangule.height = sc.nextDouble();

        double reactanguleArea = rectangule.area();
        double reactangulePerimeter = rectangule.perimeter();
        double reactanguleDiagonal = rectangule.diagonal();

        System.out.printf("First reactangule's area: %.2f%n", reactanguleArea);
        System.out.printf("First reactangule's perimeter: %.2f%n", reactangulePerimeter);
        System.out.printf("First reactangule's digonal: %.2f%n", reactanguleDiagonal);
    }
}