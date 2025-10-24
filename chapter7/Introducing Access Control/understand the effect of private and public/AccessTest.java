class Test {
    int a;
    public int b;
    private int c;

    void set(int newvalue) {
        c = newvalue;
    }

    int newvalue() {
        return c;
    }

}

public class AccessTest {
    public static void main(String[] args) {
        Test ob = new Test();
        ob.a = 10;
        ob.b = 20;
        // ob.c = 40; This will give error
        ob.set(12);
        System.out.println("a , b and c:  " + ob.a + " " + ob.b + " " + ob.newvalue());
    }
}