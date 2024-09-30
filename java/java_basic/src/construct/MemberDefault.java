package construct;

public class MemberDefault {
    String name;

    // 생성자가 따로 없음
    // 밑의 생성자는 기본 생성자를 직접 작성해본것 원래 java가 알아서 생성해줌
    MemberDefault() {
        System.out.println("생성자 호출");
    }
}
