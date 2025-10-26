class A {
    void callme() {
        System.out.println("inside A's classme method");
    }

}

class B extends A {
    void callme() {
        System.out.println("inside B's classme method");

    }
}

class C extends B {
    void callme() {
        System.out.println("inside C's classme method");

    }
}

public class Dispatch {
    public static void main(String[] args) {
        A a = new A();
        a.callme();

        A b = new B();
        b.callme();

        A c = new C();
        c.callme();

        B e = new B();
        e.callme();

        B f = new C();
        f.callme();

        
        C i = new C();
        i.callme();
    }
}
