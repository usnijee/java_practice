package lang.wrapper;

public class AutoboxingMain2 {

    public static void main(String[] args) {
        //Primitive -> Wrapper ,, boxing
        int value = 7;
//        Integer boxedValue = Integer.valueOf(value);
        Integer boxedValue = value; // 오토 박싱(Auto boxing)

        //Wrapper -> Primitive ,, unboxing
//        int unboxedValue = boxedValue.intValue();
        int unboxedValue = boxedValue; // 오토 언박싱(Auto unboxing)

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
    /*
        사용을 편하게 하기위해,

        1. 오토 박싱
     */
}
