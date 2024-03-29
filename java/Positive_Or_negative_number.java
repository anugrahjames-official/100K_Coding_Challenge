public class IfSample {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (num<0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Positive number");            
        }
}

}