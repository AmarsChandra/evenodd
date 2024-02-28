import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1 to 1000): ");
        int number = scanner.nextInt();

        if (number >= 1 && number <= 1000) {
            if (number % 2 != 0) {
                System.out.println("This is an odd number");
            } else {
                System.out.println("This is an even number");
            }
        } else {
            System.out.println("Pick a number between 1 and 1000");
        }
    }
}
