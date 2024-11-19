package lang.immutable.address;
/*
    불변객체 : 객체 내의 필드(변수, 메서드등)을 불변하도록 설정된 객체 -->
    1. final을 사용하면 된다
    2. final을 사용하지 않더라도 setter를 삭제하면 된다
 */
public class ImmutableAddress {

    private final String value;

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
