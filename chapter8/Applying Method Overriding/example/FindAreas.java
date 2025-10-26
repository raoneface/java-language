class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("Area for figure is undefined.");
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);

    }

    double area() {
        System.out.println("Inside area of Rectangle");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside area of Triangle");
        return dim1 * dim2 / 2;
    }
}

public class FindAreas {
    public static void main(String[] args) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(10, 010);
        Triangle t = new Triangle(4, 3);

        Figure figref;
        figref = f;
        System.out.println("Area of " + figref.area());
        
        figref = r;
        System.out.println("Area of " + figref.area());
        
        
        figref = t;
        System.out.println("Area of " + figref.area());

    }
}
