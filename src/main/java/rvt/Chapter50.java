package rvt;

public class Chapter50 {
    public static void main(String[] args) {
        Box box = new Box(2.5, 5.0, 6.0);

        System.out.println("Area: " + box.area() + " volume: " + box.volume());
        // System.out.println("topArea: " + box.topArea()); // does not compile

    }
}

class Box {
    private double width, height, lenght;

    Box(double width, double height, double lenght) {
        this.width = width;
        this.height = height;
        this.lenght = lenght;
    }

    Box(double side) {
        this.width = side;
        this.height = side;
        this.lenght = side;
    }

    Box(Box oldBox) {
        this.width = oldBox.width;
        this.height = oldBox.height;
        this.lenght = oldBox.lenght;
    }

    double width() {
        return width;
    }

    double height() {
        return height;
    }

    double lenght() {
        return lenght;
    }

    double volume() {
        return width * height * lenght;
    }

    private double topArea() {
        return width * height;
    }

    private double faceArea() {
        return width * height;
    }

    private double sideArea() {
        return width * height;
    }

    double area() {
        return 2 * topArea() + 2 * faceArea() + 2 * sideArea();
    }

    Box biggerBox(Box oldBox) {
        return new Box(1.25 * oldBox.width, 1.25 * oldBox.height, 1.25 * oldBox.lenght);
    }

    Box smallerBox(Box oldBox) {
        return new Box(0.75 * oldBox.width, 0.75 * oldBox.height, 0.75 * oldBox.lenght);
    }

    boolean nests(Box outsideBox) {
        return width < outsideBox.width && height < outsideBox.height && lenght < outsideBox.lenght;
    }
}