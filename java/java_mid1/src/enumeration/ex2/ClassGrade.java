package enumeration.ex2;
/*
    타입 안전 열거형 패턴
 */
public class ClassGrade {

    public static final ClassGrade BASIC = new ClassGrade(); // x001
    public static final ClassGrade GOLD = new ClassGrade(); // x002
    public static final ClassGrade DIAMOND = new ClassGrade(); // x003

    //private 생성자 추가
    //private 생성자 --> ClassGrade 클래스 내외의 위치에서 객체를 생성하여 클래스로 접근
    private ClassGrade() {}
}

/*
    ClassGrade()를 통해 객체를 생성하고 해당 객체의 참조값을 상수화하여 사용
 */
