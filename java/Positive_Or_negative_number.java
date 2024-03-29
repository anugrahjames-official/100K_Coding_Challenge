import java.util.Scanner;

public class IfSample {
    
    // Changed: Moved the declaration and initialization of Scanner object inside the main method
    public static void main(String[] args) {
        // Scanner object declaration and initialization
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Positive number");            
        }
    }
}