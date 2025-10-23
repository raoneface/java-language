class test {
    int i, j;

    test(int a, int b) {
        i = a;
        j = b;

    }

    void meth(test ob) {
        ob.i = ob.i + 2;
        ob.j = ob.j + 3;
    }

}

public class PassObRef {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a + " " + b);
        test ob1 = new test(a, b);

        System.out.println("befoe obj reference calling ob1.a and ob1.b : " + ob1.i + " " + ob1.j);

        ob1.meth(ob1);

        System.out.println("befoe obj reference calling ob1.a and ob1.b : " + ob1.i + " " + ob1.j);
        

    }

}
