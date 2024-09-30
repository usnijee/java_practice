package pack;

import pack.a.User; // pack.a.User와 같이 전체 경로를 적어서 사용하는 것은 매우 불편 -> import를 사용
import pack.a.*;   // *은 패키지 하위의 모든 클래스를 사용함을 의미
public class PackageMain2 {

    public static void main(String[] args) {
        Data data = new Data();
        User user = new User();
    }
}
