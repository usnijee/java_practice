package oop1.ex;

public class RectangleOopMain {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(); // 클래스 객체 생성
        rectangle.width = 8;
        rectangle.height = 8;

        // 넓이 구하기
        rectangle.calculateArea();

        // 둘레 길이 구하기
        rectangle.calculatePerimeter();

        // 정사각형 여부 구하기
        rectangle.isSquare();
    }
}
