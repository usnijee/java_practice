package enumeration.ex2;
/*
    특정 클래스 타입으로 생성하여 참조값을 활용한다고 해도 결국 다른 객체 생성시 의미가 없어짐
 */
public class StringGradeEx2_2 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
//        ClassGrade newclassGrade = new ClassGrade(); // 새로운 객체 -> 새로운 참조값 = basic,gold,diamond와 상관없는 참조값
//        int result = discountService.discount(newclassGrade, price);
//        System.out.println("newclassGrade 등급의 할인 금액: " + result);

    }
}

/*
    결론> 타입 안전 열거형 패턴 (Type-Safe Enum Pattern)

    1. 클래스 내에서 객체를 생성하고 객체의 참조값을 상수화하여 사용
    2. private 생성자를 통해 클래스 외부에서의 새로운 객체 생성을 막아 오직 클래스 내의 상수만 사용하도록 설정

 */
