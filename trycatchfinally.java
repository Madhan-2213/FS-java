import java.util.Scanner;

class Madhan extends Exception {
    Madhan() {
        super("Study");
    }

    Madhan(String m) {
        super(m);
    }
}

public class Main {
    static void validate(int age) throws Madhan {
        if (age < 18) {
            throw new Madhan("You must be at least 18 years old to register for the course.");
        } else {
            System.out.print("Valid age");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        
        int age = scanner.nextInt();
        
        try {
            validate(age);
        } catch (Madhan m) {
            System.out.println(m.getMessage()); // Print the custom error message
        } finally {
            scanner.close(); // Always close the scanner
        }
    }
}
