class A {
    int i, j;
    void showij() {
        System.out.println("i and j : " + i + " " + j);
    }
}
class B extends A {
    int k;
    void showk() {
        System.out.println("K : " + k);
    }
    void sum() {
        System.out.println("i+j+k : " + (i + j + k));
    }
}
public class SimpleInheritence {
    public static void main(String[] args) {
        A Superob = new A();
        B Childob = new B();
        Superob.i = 10;
        Superob.j = 20;
        System.out.println("Contents of superOb : ");
        Superob.showij();
        System.out.println();
        Childob.i = 20;
        Childob.j = 30;
        Childob.k = 40;
        System.out.println("Content of Childob : ");
        Childob.showij();
        Childob.showk();
        System.out.println("Sum of i, j and k in Childob");
        Childob.sum();
        System.out.println("---------------------------------");
    }
}