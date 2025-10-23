class A {
    int i, j;

    void showij() {
        System.out.println("i and j " + i + " " + j);
    }
}

class B extends A {
    int k;

    void showk() {
        System.out.println("k : " + k);
    }

    void sum() {
        System.out.println("i+j+k: " + (i + j + k));
    }
}

public class SimpleInheritence {
    public static void main(String[] args) {
        A superob = new A();
        B subob = new B();

        superob.i = 20;
        superob.j = 10;

        System.out.println("Content of superobj ");
        superob.showij();
        System.out.println();

        subob.i = 7;
        subob.j = 14;
        subob.k = 15;

        System.out.println("Content of subob: ");
        subob.showij();
        subob.showk();

        System.out.println();

        System.out.println("sum of i, j and k ");

           subob.sum();
    }
}