import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Enter two more numbers: ");
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();

        Sum s = new Sum();

        s.calculateSum(num1, num2);
        s.displaySum();

        s.calculateSum(num3, num4);
        s.displaySum();
    }
}