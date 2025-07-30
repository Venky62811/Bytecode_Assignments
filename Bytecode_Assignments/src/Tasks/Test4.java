package Tasks;

class Shape {
    double length;
    double width;

    void setDimensions(double length, double width) {
        this.length = length;
        this.width = width;
    }
}


class Rectangle extends Shape {
    double getArea() {
        return length * width;
    }
}


public class Test4 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setDimensions(5.0, 3.0);
        System.out.println("Area of the rectangle: " + rect.getArea());
    }
}
