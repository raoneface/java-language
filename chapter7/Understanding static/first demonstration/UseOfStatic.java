public class UseOfStatic {
    static int a = 20;

    static int b;

    static void meth(int x) {
        System.out.println("X : " + x);
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }

    static {
        b = a * 10;
    }

    public static void main(String[] args) {
        meth(34);
    }
}
