package enumeration.ex2;

public class ClassRefMain {

    public static void main(String[] args) {
        // getClass()를 통해 생성된 객체의 출처 확인 -> ClassGrade
        System.out.println("class BASIC = " + ClassGrade.BASIC.getClass());
        System.out.println("class GOLD = " + ClassGrade.GOLD.getClass());
        System.out.println("class DIAMOND = " + ClassGrade.DIAMOND.getClass());

        // 참조값 확인 -> 전부 다름 = 각자의 객체가 생성되었음을 알 수 있음
        System.out.println("ref BASIC = " + ClassGrade.BASIC);
        System.out.println("ref GOLD = " + ClassGrade.GOLD);
        System.out.println("ref DIAMOND = " + ClassGrade.DIAMOND);
    }
}
