class Test {
    int a; // default access
    public int b; // public access
    private int c; // private access

    // methods to access c
    void setc(int i) {
        // set c's avalue
        c = i;
    }

    int getc() {
        // get c's value
        return c;
    }
}

public class AccessTest {
    public static void main(String[] args) {
        Test ob = new Test();

        ob.a = 10;
        ob.b = 20;
        //ob.c = 100;  // this will give you error

        ob.setc(100);
        System.out.println("a , b  and c: " + ob.a + " " + ob.b + " " + ob.getc());

    }
}