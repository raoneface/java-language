
class Box {
    double height;
    double width;
    double length;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        length = d;
    }

    Box() {
        width = 10;
        height = 15;
        length = 138;
    }

    Box(double len) {
        width = height = length = len;
    }

    double volume() {
        return width * height * length;
    }
}

public class OverloadCons {
    public static void main(String[] args) {
        Box a1 = new Box();
        Box a2 = new Box(11, 12, 12);
        Box a3 = new Box(12);

        double vol;
        vol = a1.volume();
        System.out.println("Volume of a1: " + vol);

        vol = a2.volume();
        System.out.println("Volume of a2: " + vol);

        vol = a3.volume();
        System.out.println("Volume of a3: " + vol);

    }
}
