class Box {
    double width;
    double height;
    double depth;

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

public class OverloadCons2 {
    public static void main(String[] args) {
        Box MyBox1 = new Box(10, 20, 30);
        Box MyBox2 = new Box();
        Box MyBox3 = new Box(7);

        Box MyBox4 = new Box(MyBox1);

        double vol;

        vol = MyBox1.volume();
        System.out.println("Volume of MyBox1 " + vol);

        vol = MyBox2.volume();
        System.out.println("Volume of MyBox2 " + vol);

        vol = MyBox3.volume();
        System.out.println("Volume of MyBox3 " + vol);

        vol = MyBox4.volume();
        System.out.println("Volume of MyBox4 " + vol);

    }
}
