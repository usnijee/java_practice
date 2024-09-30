package construct;
/*
    this는 언제 생략 가능할까?

    -> 매개변수와 멤버변수의 형태가 다른 경우 this 생략이 가능하다
    -> this를 일부러 사용해서 멤버변수와 매개변수의 구분을 뚜렷하게 했으나
    -> IDE가 발전하면서 색상을 통해 구분이 가능해졌다
 */
public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter;
    }
}

