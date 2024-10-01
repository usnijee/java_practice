package access.ex;

public class CounterMain {
    public static void main(String[] args) {

        MaxCounter maxCounter = new MaxCounter(5);
        maxCounter.increment();
        maxCounter.increment();
        maxCounter.increment();
        int k = maxCounter.getCount();
        System.out.println("k = " + k);
    }
}
