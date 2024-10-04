package static1;

public class Data2 {
    public String name;

    public Data2(String name, Counter counter){
        this.name = name;
        counter.counter ++; // 객체 data1~3가 공통으로 참조하는 객체
    }
}
