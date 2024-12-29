
public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle (5.0, 3.0);

        Circle circle = new Circle (1.0);

        //Calculate the area of the rectangle, and store the result in a variable
        double areaOfRectangle = ShapeMetricCalculator.calculateRectangleArea(rectangle);

        //Calculate the area of the rectangle, and store the result in a variable
        double areaOfCircle = ShapeMetricCalculator.calculateCircleArea(circle);

        System.out.println("Area of Rectangle:"+ areaOfRectangle);
        System.out.println("Area of Circle:"+ areaOfCircle);

    }

    }
