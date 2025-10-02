class Box {

    double width;
    double height;
    double length;

    Box() {
        System.out.println("Constructing Box");
        width = 10;
        height = 20;
        length = 30;
    }

    double volume() {
        return width * height * length;
    }
}

public class Boxdemo6 {
    public static void main(String[] args) {
        Box a1 = new Box();
        double volume;
        volume = a1.volume();
        System.out.println("Volume of Box : " + volume);
    }

}
