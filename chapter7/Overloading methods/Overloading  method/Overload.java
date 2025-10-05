class OverloadDemo {
    void test() {
        System.out.println("No parameters");
    }

    void test(int a) {
        System.out.println("a : " + a);
    }

    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    double test(double a) {
        return a * a;
    }

    double test(double a, double b) {
        return a * b;
    }

}

public class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double value;
         value  = ob.test(11.3, 33.32);
         System.out.println(value);
         value = ob.test(22.445);
         System.out.println(value);
         ob.test();
         ob.test(12);
         ob.test(11, 13);

    }
}
