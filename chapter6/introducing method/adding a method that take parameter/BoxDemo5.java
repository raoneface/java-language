class Box {
    double width;
    double height;
    double length;

    double volume() {
        return width * height * length;
    }

    void setdim(double l, double w, double h) {
        width = w;
        height = h;
        length = l;
    }
}

public class BoxDemo5 {
    public static void main(String[] args) {
        Box a1 = new Box();
        double volume;
        a1.setdim(10, 22, 33);
        volume = a1.volume();
        System.out.println("Volume of Box: "+ volume);

    }
}
