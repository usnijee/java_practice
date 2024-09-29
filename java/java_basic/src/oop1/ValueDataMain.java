package oop1;
/*
    클래스 -> 멤버변수 뿐만 아니라 메서드도 포함 가능
 */
public class ValueDataMain {

    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        add(valueData);
        add(valueData);
        add(valueData);
        System.out.println("최종숫자 = " + valueData.value);
    }

    static void add(ValueData valueData){
        valueData.value ++;
        System.out.println("숫자 증가 value=" + valueData.value);
    }
}
