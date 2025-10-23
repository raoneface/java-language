class Test {
    int i;
    int j;

    Test(int a, int b) {
        i = a;
        j = b;
    }

    boolean checkobject(Test o) {
        if (o.i == i && o.j == j) {
            return true;
        } else {
            return false;
        }
    }
}

public class PassOb {
    public static void main(String[] args) {

        Test ob = new Test(12, 130);

        Test ob1 = new Test(12, 130);

        System.out.println(ob.checkobject(ob1));

        Test ob2 = new Test(12, 01);

        System.out.println(ob2.checkobject(ob));

    }
}