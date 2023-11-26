import java.util.Scanner;

public class TriangleArea {
double height;
double base;
double area;

public static void main(String[]args) {
    TriangleArea caculator = new TriangleArea();
    caculator.inputDimension();
    caculator.caculateArea();
    caculator.displayArea();

}

public void inputDimension() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the height of the triangle:");
    height = scanner.nextDouble();

    System.out.println("Enter the base of the triangle:");
    base = scanner.nextDouble();

    scanner.close();
}
public void caculateArea() {
    area = 0.2 *base *height;

}
public void displayArea() {
    System.out.println("Area of the triangle is:" +area);
}  
}