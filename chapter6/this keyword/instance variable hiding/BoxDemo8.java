
class Box {

    double width;
    double height;
    double length;

    Box(double width, double height, double length) {
        System.out.println("Constructing Box");
        this.height = height;
        this.width = width;
        this.length = length;
    }

    double volume() {
        return width * height * length;
    }
}

public class BoxDemo8 {
    public static void main(String[] args) {
        Box a1 = new Box(100, 23, 23);
        double volume;
        volume = a1.volume();
        System.out.println("Volume of Box : " + volume);
    }

}
