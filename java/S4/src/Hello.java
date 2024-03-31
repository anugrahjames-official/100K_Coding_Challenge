Public class Hello {
    static int num1 = 10;
    int num2 = 20;
 public static void main(String[] args) {
  Hello h=new Hello();
  Hello h1=new Hello();
  System.out.println(num1);
  h.hello();
 }
 h.num2=30;
 h.num1=50;
 h1.num2=40;
 h1.num1=60;

  System.out.println(h.num2);
 }