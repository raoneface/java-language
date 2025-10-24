class Box {
    double width;
    double height;
    double depth;

    // construct clone of an object
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

class BoxWeight extends Box {
    double weight; // weight of box

    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5, 33, 44);
        Box plainBox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("volume of weightbox is " + vol);
        System.out.println("Weight of weightbox is " + weightbox.weight);

        System.out.println();

        // 
        plainBox = weightbox;

        vol = plainBox.volume();
        System.out.println("Volume of plainbox is " + vol);

 //       System.out.println("Weight of plainbox is " + plainBox.weight);   this will give an error 

    }
}