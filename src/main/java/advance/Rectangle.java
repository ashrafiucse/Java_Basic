package advance;

public class Rectangle {
    public double height;
    public double width;
    Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }
    public double calculateRectangleArea() {
        return height*width;
    }
    Rectangle() {

    }
    public void getWidth(double width) {
        this.width = width;
    }
    public void getHeight(double height) {
        this.height = height;
    }
    public double rectanglePerimeter() {
        return 2*height*width;
    }
}
