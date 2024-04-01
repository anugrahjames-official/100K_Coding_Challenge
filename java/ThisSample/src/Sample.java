package ThisSample.src;

public class Sample {
    int a=100, b=200;
    Sample(int a, int b) {
        This.a=a; This.b=b;
        System.out.println(This.a + " " + This.b);
    }
}