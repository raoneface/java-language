class Test {
    void meth(int a, int b) {
        a = a + 6;
        b = b - 6;
    }
}

public class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test();

        int a = 15, b = 20;

        System.out.println("a and b befor call " + a + " " + b);
        
        ob.meth(a, b);
        
        System.out.println("a and b befor call " + a + " " + b);
        

    }
}
