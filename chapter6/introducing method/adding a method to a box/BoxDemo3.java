// package java-language.chapter6.introducing method.adding a method to a box;
class Box {
    double width;
    double height;
    double depth;

    void volume() {
        System.out.println("Volume is ");
        System.out.println(width * height * depth);
    }
}

public class BoxDemo3 {
    public static void main(String[] args) {
        Box a1 = new Box();
        Box a2 = new Box();

        a1.depth = 20;
        a1.height = 10;
        a1.width = 30;
        
        
        a2.depth = 123;
        a2.height= 12;
        a2.width = 12;

        a1.volume();
        System.out.println("method call");
        a2.volume();
        System.out.println("method call");
    }
}
