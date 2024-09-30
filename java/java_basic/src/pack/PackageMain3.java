package pack;
/*
    같은 이름의 클래스가 다른 패키지에 각각 존재한다면
    하나의 클래스만 import가 가능하다. (자주 사용하는 클래스를 import 할 것!)
    나머지 클래스는 전체 경로를 적어주어야 한다
 */
import pack.a.User;

public class PackageMain3 {

    public static void main(String[] args) {
        User userA = new User();  // import 사용
        pack.b.User userB = new pack.b.User(); // 전체 경로 사용
    }

}
