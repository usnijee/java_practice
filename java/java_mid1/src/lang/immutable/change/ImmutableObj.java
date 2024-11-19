package lang.immutable.change;

public class ImmutableObj {

    private final int value; // 불변 객체 -> 필드 final로 고정

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue) {
        int result = value + addValue;
        return new ImmutableObj(result); // 새로운 객체를 만들어서 해당 객체를 반환
    }

    public int getValue() {
        return value;
    }
}
