package pack.a;

public class User {
    // 기본 생성자 User()
    // public을 해주어야 동일 경로가 아닌 곳(다른 패키지)에서 호출이 가능
    public User(){
        System.out.println("패키지 pack.a 회원 생성");
    }
}
