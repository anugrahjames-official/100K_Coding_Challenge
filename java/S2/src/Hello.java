public class Hello {
    public static void main(String[] args) {
        
        Sample obj1 = new Sample();
        Sample obj2 = new Sample();
        
        obj1.a = 10;
        obj1.b = 20;
        obj2.a = 100;
        obj2.b = 200;

        obj1.display();
        obj2.display();
    }
}