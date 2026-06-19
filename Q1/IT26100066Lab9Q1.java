import java.util.Scanner;

public class IT26100066Lab9Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value a: ");
        double a = input.nextDouble();
        System.out.print("Enter value b: ");
        double b = input.nextDouble();
        System.out.print("Enter value c: ");
        double c = input.nextDouble();

        System.out.println();

        double root1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        double root2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        System.out.println("Roots are real and different :");
        System.out.printf("Root 1: %.2f%n", root1);
        System.out.printf("Root 2: %.2f%n", root2);
    }
}