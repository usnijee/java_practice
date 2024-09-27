package ref;
/*
    참조형 변수에서 아직 가리키는 대상이 없다면 `null` 이라는 특별한 값을 넣어둘 수 있다. `null` 은 값이 존재하지 않
는, 없다는 뜻이다.
 */
public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data();
        System.out.println("2. data = " + data);
        data = null;
        System.out.println("3. data = " + data);
        /*
            최종적으로 data는 더이상 참조하는 대상이 없다 -> java에서는 GC(Garbage Collection)가 메모리에서
            필요없는 객체라고 인식하고 제거한다
         */
    }
}
