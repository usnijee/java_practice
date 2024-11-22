package enumeration.ref3;
/*
    Enum에 상수가 추가되어도 main() 코드의 변화없이 모든 grade에 대한 정보 출력하기
    Grade.values()을 통해 모든 상수를 배열화 할 수 있다.
 */
public class EnumRefMain3_4 {
    public static void main(String[] args) {
        int price = 10000;
        Grade[] grades = Grade.values();
        for (Grade grade : grades) {
            printDiscount(grade,price);
        }
    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + "등급의 할인 금액: " + grade.discount(price));
    }
}
