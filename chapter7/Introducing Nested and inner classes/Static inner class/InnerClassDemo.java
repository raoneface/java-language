class Outer {
    int outer_x = 100;
    static int c = 30;    
    void test() {
        Inner inner = new Inner();
        inner.display();
        System.out.println(c);
        System.out.println(inner.a);
    }
    class Inner{
        static int a = 10;
        void display(){
            System.out.println("display: outer_x = " + outer_x);
        }
    }
}
public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}
