// initialization of one object to another

class Box {
    double width;
    double length;
    double height;

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        length = ob.length;
    }

    // constructure used all dimention specified
    Box(double w, double l, double h) {
        width = w;
        length = l;
        height = h;
    }

    // all length are equal
    Box(double len) {
        width = height = length = len;
    }

    double volume() {
        return width * length * height;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        double vol;
        Box b1 = new Box(10, 10, 10);
        vol = b1.volume();
        System.out.println(vol);

        Box b2 = new Box(b1);
        vol = b2.volume();
        System.out.println(vol);

        Box b3 = new Box(11);
        vol = b3.volume();
        System.out.println(vol);
        
        Box b4 = new Box(b3);
        System.out.println(b4.volume());
    }
}
