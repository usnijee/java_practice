package lang.clazz;
/*
    클래스 생성하기
    - 인스턴스 생성
    - 메서드 호출
    - 필드 값 변경
 */

public class ClassCreateMain {

    public static void main(String[] args) throws Exception {
        Class helloClass = Hello.class;
//        Class helloClass1 = Class.forName("lang.clazz.Hello");

        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance(); // Hello 클래스의 class 클래스에서 getDeclaredConstructor()를 통해 생성자를 선택하고 이를 기반으로 인스턴스 생성
        String result = hello.hello();
    }
}
