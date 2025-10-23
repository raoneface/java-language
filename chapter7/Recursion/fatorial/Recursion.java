class Factorial {

    int fact(int x) {
        if (x == 1) {
            return 1;
        } else {
            return  x * fact(x-1) ;
        }
    }
}

public class Recursion {
    public static void main(String[] args) {
        Factorial f1 = new Factorial();
        System.out.println(f1.fact(5));
    }
}
