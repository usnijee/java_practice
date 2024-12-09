package generic.test.ex2;

public class Pair<A,B> {

    private A valueA;
    private B valueB;

    public void setFirst(A valueA) {
        this.valueA = valueA;
    }

    public void setSecond(B valueB) {
        this.valueB = valueB;
    }

    public A getFirst() {
        return valueA;
    }

    public B getSecond() {
        return valueB;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + valueA +
                ", second=" + valueB +
                '}';
    }
}
