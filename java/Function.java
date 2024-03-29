import java.util.Scanner;
public class Function {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers: ");
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int result = sum(num1, num2);
        System.out.println("Sum = " + result);
    }

    static int sum(int num1, int num2) {
        int added = num1 + num2;
        return added;
    }
}