package com.company;

public class ShapeController {

    public static int getTrianglePerimeter ( int a, int b, int c) {
        int perimeterofTriangle = a + b + c;
        return perimeterofTriangle;
    }

    public static int getRectanglePerimeter ( int x, int y) {
        int perimeterofRectangle = (x + y) *2;
        return perimeterofRectangle;
    }

    public static void modifyTriangle (Triangle anotherTriangle, int a, int b, int c) {
        anotherTriangle.lengthOne = a;
        anotherTriangle.lengthTwo = b;
        anotherTriangle.lengthThree = c;
    }

    public static void modifyRectangle (Rectangle anotherRectangle, int x, int y) {
        anotherRectangle.width = x;
        anotherRectangle.height = y;
    }


}
