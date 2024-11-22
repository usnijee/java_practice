package enumeration.ex2;
/*
    타입 안전 열거형 패턴
 */
public class ClassGrade {

    public static final ClassGrade BASIC = new ClassGrade(); // x001
    public static final ClassGrade GOLD = new ClassGrade(); // x002
    public static final ClassGrade DIAMOND = new ClassGrade(); // x003

    //private 생성자 추가
    //private 생성자 --> ClassGrade 클래스 내 이외의 위치에서 객체를 생성하여 클래스로 접근이 불가능
    // 생성자가 존재할 경우 객체 생성시 생성자에 먼저 접근하기 때문 ,, 근데 생성자가 private
    private ClassGrade() {}
}

/*
    1. ClassGrade()를 통해 객체를 생성하고 해당 객체의 참조값을 상수화하여 사용
    2. 생성자를 private로 생성하여 클래스 외부에서 새로운 객체 생성을 막고 오직 클래스 내부에서 생성한 객체만 사용하도록 설정
 */
