package com.company;

public class MainShapeController {
    public static void main(String[] args) {

        int triangle;
        triangle = ShapeController.getTrianglePerimeter(3, 6, 6 );
        System.out.println("Triangle's perimeter: " + triangle);

        int rectangle;
        rectangle = ShapeController.getRectanglePerimeter(4, 7);
        System.out.println("Rectangle's perimeter: " + rectangle);

        System.out.println(" ");

        Triangle t1 = new Triangle();
        ShapeController.modifyTriangle(t1, 5, 5, 15 );
        ShapeController.modifyTriangle(t1, 15, 10, 20 );
        System.out.println("Modified triangle: " + (t1.lengthOne+ t1.lengthTwo + t1.lengthThree));

        Rectangle r1 = new Rectangle();
        ShapeController.modifyRectangle(r1, 8, 9);
        ShapeController.modifyRectangle(r1, 9, 10);
        System.out.println("Modified rectangle: " +(r1.width + r1.height));

    }
}
