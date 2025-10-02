class box {
    int height;
    int width;
    int length;
}

public class Boxdemo1 {
    public static void main(String[] args) {
        box a1 = new box();
        double volume;
        a1.height = 20;
        a1.width = 30;
        a1.length = 10;
        volume = a1.height * a1.width * a1.length;
        System.out.println("Volume of box :" + volume);

        box a2 = new box();

        a2.height = 10;
        a2.width = 110;
        a2.length = 30;
        volume = a2.height * a2.width * a2.length;
        System.out.println("Volume of Box :" + volume);
    }
}