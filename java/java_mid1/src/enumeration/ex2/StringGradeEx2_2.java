package enumeration.ex2;
/*
    특정 클래스 타입으로 생성하여 참조값을 활용한다고 해도 결국 다른 객체 생성시 이미가 없어짐
 */
public class StringGradeEx2_2 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        ClassGrade newclassGrade = new ClassGrade();
        int result = discountService.discount(newclassGrade, price);
        System.out.println("newclassGrade 등급의 할인 금액: " + result);

    }
}
