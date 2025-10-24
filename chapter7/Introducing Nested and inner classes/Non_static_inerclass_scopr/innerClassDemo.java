class Outer {
    int Outer_x = 10;

    void meth() {
        Inner ins = new Inner();
        ins.Display();
    }

    class Inner {
        int y = 29;
        void Display() {
            System.out.println("Outer_x : " + Outer_x);
            System.out.println("y : " + y);
        }
    }
    void showy(){ 
     //  System.out.println(y);  // y cant resolve here
    }
}

public class innerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.meth();
    }
}
