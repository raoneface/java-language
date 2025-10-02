class Box {

    double width;
    double height;
    double length;

    Box(double w, double l, double h) {
        System.out.println("Constructing Box");
        width = w;
        height = h;
        length = l;
    }

    double volume() {
        return width * height * length;
    }
}

public class BoxDemo7 {
    public static void main(String[] args) {
        Box a1 = new Box(100, 23, 23);
        double volume;
        volume = a1.volume();
        System.out.println("Volume of Box : " + volume);
    }

}
