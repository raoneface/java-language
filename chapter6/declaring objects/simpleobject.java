// package declaration removed or corrected
class box1 {
    int height;
    int width;
    int length;
}

public class simpleobject {
    public static void main(String[] args) {
        // declaration reference to objects
        box1 a1;
        // allocating a box1 object
        a1 = new box1();

        double vol;
        a1.height = 20;
        a1.length = 30;
        a1.width = 20;
        vol = a1.height * a1.length * a1.width;

        System.out.println("volume of a1 " + vol);
        System.out.println("line tracking1");
        box1 a2; // declarating reference to the object 
        a2 = a1;

        System.out.println(a2.height);
        System.out.println(a2.width);
        System.out.println(a2.length);

        System.out.println("line tracking2");
        
        a1.height = 5;
        a1.length = 5;
        a1.width = 5;


        System.out.println(a2.height);
        // System.out.println(a2.height);
        // System.out.println(a2.width);
        // System.out.println("fuck");
        System.out.println("line tracking 3");
        System.out.println(a1.width);
        // System.out.println(a1.length);
        // System.out.println(a1.length);
        a2.height = 5;
        a2.length = 10;
        a2.width = 10;

    }
}
