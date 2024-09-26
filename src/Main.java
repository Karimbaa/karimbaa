public class Main {

    public static void moveSquare() {
        int size = 10;
        System.out.println("Moving in a square of size " + size);
        for (int i = 0; i < 4; i++) {
            int degrees = 90;
            System.out.println("* Move Forward " + size);
            System.out.println("* Turn Right " + degrees + " degrees");
        }
    }

    public static void moveRectangle() {
        int length = 20;
        int width = 10;
        System.out.println("Moving in a rectangle of " + length + " by " + width);
        for (int i = 0; i < 2; i++) {
            int degrees = 90;
            System.out.println("* Move Forward " + length);
            System.out.println("* Turn Right " + degrees + " degrees");
            System.out.println("* Move Forward " + width);
            System.out.println("* Turn Right " + degrees + " degrees");
        }
    }

    public static void moveCircle() {
        System.out.println("Moving in a circle");
        int degrees = 1;
        for (int i = 0; i < 360; i++) {
            int length = 1;
            System.out.println("* Move Forward " + length);
            System.out.println("* Turn Right " + degrees + " degrees");
        }
    }

    public static void squareDancing() {
        System.out.println("Square dancing - 3 squares of size 20");
        int size = 20;
        int degrees = 90;
        for (int i = 0; i < 3; i++) {
            System.out.println("* Move Forward " + size);
            System.out.println("Moving in a square of size " + size);
            for (int j = 0; j < 4; j++) {
                System.out.println("* Move Forward " + size);
                System.out.println("* Turn Right " + degrees + " degrees");
            }
        }
    }

    public static void cropCircle() {
        System.out.println("Crop circles - 4 circles");
        int length = 20;
        int degrees = 1;
        for (int i = 0; i < 4; i++) {
            System.out.println("* Move Forward " + length);
            System.out.println("Moving in a circle");
            for (int j = 0; j < 360; j++) {
                System.out.println("* Move Forward " + degrees);
                System.out.println("* Turn Right " + degrees + " degrees");
            }
        }
    }

    public static void move() {
        moveSquare();
        moveRectangle();
        moveCircle();
        squareDancing();
        cropCircle();
    }

    public static void main(String[] args) {
        move();
    }
}
