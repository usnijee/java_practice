package final1;
/*
    1. final -> 키워드 이름 그대로 '끝'이라는 뜻으로, final 이 붙은 변수는 최초 1회 값 할당 이후 값을 변경할 수 없음
    2. 변수 뿐만아니라 method, class에도 사용 가능
 */
public class FinalLocalMain {

    public static void main(String[] args) {
        //final 지역 변수1
        final int data1;
        data1 = 10;
//        data1 = 20; --> 컴파일 오류 : final 변수의 값 재할당 불가능

        method(10);
//        cursor();  --> 컴파일 오류 : main()은 static 메소드이기에 static 메소드만 참조 가능
    }

    static void method(final int parameter){
//        parameter = 20;  --> 컴파일 오류 : fianl 변수의 값 재할당 불가능
    }

    void cursor(){
        System.out.println("이 메소드 사용 가능~?");
    }
}
