class Outer {
    int Outer_x = 10;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        void display() {
            System.out.println("Display : Outer_x : " + Outer_x);
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        Outer Outer = new Outer();
        Outer.test();
    }
}
