package RectangleAre;
public class RectangleArea {
    private double length;
    private double width;

    public RectangleArea(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

}