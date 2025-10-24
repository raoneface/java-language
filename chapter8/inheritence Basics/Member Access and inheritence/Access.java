class A {
    int i;
    private int j; // private member cant inheritent

    void set(int x, int y) {
        i = x;
        j = y;
    }
}

class B extends A {
    int total;

    void sum() {
        total = i + j;
        System.out.println(total);
    }
}

public class Access {
    public static void main(String[] args) {
        B childObj = new B();
        childObj.set(23, 32);
        System.out.println("Sum : ");
        childObj.sum();
    }
}
