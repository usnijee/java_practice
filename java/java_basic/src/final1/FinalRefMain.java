package final1;

public class FinalRefMain {

    public static void main(String[] args) {
        final Data data = new Data();
//        data = new Data(); --> final로 인해 참조값이 고정됨 --> 새로운 객체의 참조값 저장 불가능

        // 참조 대상의 값은 변경 가능
        data.value = 10;
        data.value = 20;
        System.out.println(data.value);

    }
}
