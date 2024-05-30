package advance;

public class test {
    public static void main(String[] args) {
        Rectangle room1 = new Rectangle(10,20);
        double area = room1.calculateRectangleArea();
        System.out.println(area);
        Rectangle room2 = new Rectangle();
        room2.getWidth(100);
        room2.getHeight(50);
        double perimeter = room2.rectanglePerimeter();
        System.out.println(perimeter);
    }
}
