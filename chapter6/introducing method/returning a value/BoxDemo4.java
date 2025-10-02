class Box {
    double width;
    double height;
    double depth;

    double volume() {
        return width * depth * height;
    }

}

public class BoxDemo4 {
    public static void main(String[] args) {
        Box a1 = new Box();
        double vol;
        a1.depth = 20;
        a1.height = 10;
        a1.width = 30;

        vol = a1.volume();

        System.out.println("Volume of box: "+vol);

    }
}