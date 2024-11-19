package lang.immutable.change;
/*
    불변객체을 바라보는 관점

    1. 불변객체로 의심되는 클래스의 필드를 확인 -> 불변 객체임을 파악
    2. 불변객체를 확인하였음에도 불구하고 해당 객체의 필드를 변경하려는 시도가 있다? --> 분명히 새로운 객체로 받을 것임을 의심
 */
public class ImmutableMain {

    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        ImmutableObj obj2 = obj1.add(20);

        //계산 이후에도 기존값(obj1의 value)와 신규값 모두 확인 가능
        System.out.println("obj1 = " + obj1.getValue());
        System.out.println("obj2 = " + obj2.getValue());
    }
}
