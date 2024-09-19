package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; // 지역변수,, {}안에서만 생존
        if (true){
            int x = 20; // 지역변수, if문안에서만 생존
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } // x 생존 종료
        System.out.println("if m = " + m);
//        System.out.println("if x = " + x); // 사용 불가능
    } // m 생존 종료
}
/*
지역변수
지역 변수는 본인의 코드 블록 안에서만 생존한다. 그리고 자신의 코드 블록 안에서는 얼마든지 접근할 수 있
다. 하지만 자신의 코드 블록을 벗어나면 제거되기 때문에 접근할 수 없다

이렇게 변수의 접근 가능한 범위를 스코프(Scope)라 한다. 참고로 Scope를 번역하면 범위라는 뜻이다.
int m 은 main{} 전체에서 접근할 수 있기 때문에 스코프가 넓고, int x 는 if{} 코드 블록 안에서만 접근할 수
있기 때문에 스코프가 좁다.
 */
