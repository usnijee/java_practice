package lang.wrapper;

public class AutoboxingMain1 {

    public static void main(String[] args) {
        //Primitive -> Wrapper ,, boxing
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);

        //Wrapper -> Primitive ,, unboxing
        int unboxedValue = boxedValue.intValue();

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);

        /*
            기본형 -> 참조형, 참조형 -> 기본형으로 변환해야하는 경우가 잦아짐 ---> Auto Boxing 도입
         */
    }
}
