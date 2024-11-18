package lang.object.equals;

/*
    동일성(identity) vs 동등성(equality)

    동일성(==) : 물리적으로 객체가 동일한 메모리 값을 참조함을 의미
    동등성(equals) : 논리적으로 동등함을 나타냄

    ex. 객체의 메모리 참조값은 다르네 id-100은 논리적으로 동일한 대상임

    UserV1 user1 = new UserV1("id-100");
    UserV1 user2 = new UserV1("id-100");
 */
public class EqualsMainV1 {

    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2)); //false
        System.out.println("equality = " + (user1.equals(user2))); // false

        // equals는 기본적으로 동일성(==) 기반
        // 따라서 오버라이딩을 통해 equals를 재정의 할 필요가 있음
    }
}
