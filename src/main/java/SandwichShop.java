import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sandwish size (1 for regular, 2 for large): ");
        int size = scanner.nextInt();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        double basePrice = 0.0;

        if (size == 1) {
            basePrice = 5.45;
        } else if (size == 2) {
            basePrice = 8.95;
        } else {
            System.out.println("Invalid size selected.");
            return;
        }

        double finalPrice = basePrice;

        if (age <= 17) {
            finalPrice = basePrice * 0.90;
        } else if (age >= 65) {
            finalPrice = basePrice * 0.80;
        }

        System.out.printf("Total cost of the sandwish: $%.2f%n", finalPrice);
    }
}
