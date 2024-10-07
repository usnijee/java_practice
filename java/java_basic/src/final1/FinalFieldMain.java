package final1;

public class FinalFieldMain {

    public static void main(String[] args) {
        //final 필드 - 생성자 초기화
        System.out.println("생성자 초기화를 통해 final 변수 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        //final 필드 - 필드 초기화
        // FieldInit 클래스의 final 변수가 이미 10으로 초기화가 되어 있기에 인스턴스의 생성여부와 상관없이 10으로 고정
        System.out.println("필드 초기화를 통해 final 변수 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        //상수
        // static final을 사용 --> 고정된 값을 공유하는 변수
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);
    }

}

/*
    필드 초기화의 경우를 보면 -> 클래스의 멤버변수가 이미 final이기에 10으로 고정된 상태
                          -> 이때, 해당 클래스에 대한 객체를 3개를 생성해도 value변수는 3개의 인스턴스 전부 10
                          -> 즉, 이미 동일한 값이 고정된 상태라면 3개의 인스턴스를 생성하는 것은 메모리 낭비!!
                          -> 이런 경우에 static final 변수를 사용하면 공유가능한 고정값을 사용할 수 있다!!
                          -> static variable의 경우 메소드의 static 영역에 생성되기에
 */
