package enumeration.ex2;
/*
    타입 안전 열거형 패턴
 */
public class ClassGrade {

    public static final ClassGrade BASIC = new ClassGrade(); // x001
    public static final ClassGrade GOLD = new ClassGrade(); // x002
    public static final ClassGrade DIAMOND = new ClassGrade(); // x003
}

/*
    ClassGrade()를 통해 객체를 생성하고 해당 객체의 참조값을 상수화하여 사용
 */
