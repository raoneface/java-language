class A {
    int i;
}
class B extends A {
    int i;

    B(int a , int b){
        super.i = a;
        i = b;
    }
    void show(){
        System.out.println("i in superclas: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}
public class UseSuper {
    public static void main(String[] args) {
        B subob = new B(1,2);

        subob.show();
    }
}
