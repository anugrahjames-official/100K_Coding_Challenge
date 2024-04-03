package SuperSample.src;

public class B extends A {
    B() {
        System.out.println("It's from Constructor of B");
    }
    B(int a) {
        super()
        System.out.println("It's Argument Constructor from Class B");
    }
    int a,c;
    void display() {
        System.out.println("It's from Class B");
        a=20;
        super.a=10;
        c=a+super.a;
        super.display();
    }
    public static void main(String[] args) {
        B b = new B(10);
        b.display();
    }
}
