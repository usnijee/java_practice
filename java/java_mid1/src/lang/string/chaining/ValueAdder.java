package lang.string.chaining;

public class ValueAdder {

    private int value;

    public ValueAdder add(int addValue) {
        this.value += addValue;
        return this;  // 메서드 체이닝 기법 --> 메서드의 반환값으로 자기자신(this)를 반환
    }

    public int getValue() {
        return value;
    }
}
