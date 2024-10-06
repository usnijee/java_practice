package static2;
/*
Static method (정적 메서드)

-> 정적 변수와 동일하게 불필요한 인스턴스 생성없이 바로 클래스명을 통해 메서드를 사용가능하다
-> 정적 메서드는 공용 기능
-> 정적 메서드는 인스턴스 변수(인스턴스 멤버변수),인스턴스 메서드를 사용할 수 없다
-> static이 붙은 정적변수, 정적 메소드만 사용 가능 하다
-> 접근 제어자만 허락한다면 클래스를 통해 모든 곳에서 static을 호출 가능
 */

public class DecoUtil2 {

    public static String deco(String str){
        String result = "*" + str + "*";
        return result;
    }
}
