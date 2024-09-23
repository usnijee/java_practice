package method;
/*
    반환값이 없는 메서드 만들어보기
 */
public class Method2 {
    public static void main(String[] args) {
        printHeader(); // 매서드 호출
        System.out.println("프로그램이 동작합니다.");
        printFooter();
    }
    public static void printHeader() { // 매서드 선언
        System.out.println("= 프로그램을 시작합니다 =");
        return; // void의 경우 생략 가능
    }
    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다 =");
    }
}
