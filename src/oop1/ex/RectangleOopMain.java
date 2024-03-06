package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.width = 5;
        rec.height = 8;

        int area = rec.calculateArea(rec.width, rec.height);
        System.out.println("넓이: " + area);

        int perimeter = rec.calculatePerimeter(rec.width, rec.height);
        System.out.println("둘레 길이: " + perimeter);

        boolean square = rec.isSquare(rec.width, rec.height);
        System.out.println("정사각형 여부: " + square);
    }
}
