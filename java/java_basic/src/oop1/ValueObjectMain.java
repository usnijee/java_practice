package oop1;

public class ValueObjectMain {

    public static void main(String[] args) {
        ValueObject valueObject = new ValueObject(); // 객체 생성 -> valueObject에 객체의 참조값 저장
        valueObject.add();
        valueObject.add();
        valueObject.add();
        System.out.println("최종 숫자 = " + valueObject.value);
    }
}
