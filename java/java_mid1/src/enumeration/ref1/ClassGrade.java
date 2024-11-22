package enumeration.ref1;
/*
    Enum 리펙토링1. 할인율은 등급에 따라 판단됨 -> 회원 등급 클래스가 할인율을 관리하도록 리팩토링
 */
public class ClassGrade {

    public static final ClassGrade BASIC = new ClassGrade(10); // x001
    public static final ClassGrade GOLD = new ClassGrade(20); // x002
    public static final ClassGrade DIAMOND = new ClassGrade(30); // x003

    // 할인율 추가
    // 중간에 변경 불가 즉, 불변성질을 위해 final로 생성
    private final int discountPercent;

    private ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent; // ref1. private 생성자에 파라미터로 할인율을 받도록 변경
    }

    public int getDiscountPercent() { // ref2. 할인율을 조회하는 메서드 추가
        return discountPercent;
    }
}

