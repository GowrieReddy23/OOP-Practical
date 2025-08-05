package Lab2;
import java.util.Scanner;

public class Stringmethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Character at index 2: " + input.charAt(2));
        System.out.println("Length of the string: " + input.length());
        System.out.println("Uppercase: " + input.toUpperCase());
        System.out.println("Lowercase: " + input.toLowerCase());
        System.out.println("Substring (2 to 5): " + input.substring(2, 5));
        System.out.println("Contains 'test': " + input.contains("test"));

        scanner.close();
    }
}