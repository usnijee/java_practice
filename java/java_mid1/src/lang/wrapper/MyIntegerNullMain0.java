package lang.wrapper;

public class MyIntegerNullMain0 {

    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};
        System.out.println(findValue(intArr,-1)); //-1
        System.out.println(findValue(intArr,0)); //0
        System.out.println(findValue(intArr,1)); //1
        System.out.println(findValue(intArr,100)); //-1
    }

    private static int findValue(int[] intArr, int target) {
        for (int value : intArr) {
            if (value == target) {
                return value;
            }
        }
        return -1; // int는 기본형으로 무조건 값이 있어야한다.
    }
}
/*
    문제점
    기본형을 사용하면 반환값이 반드시 존재해야 하기에 null 사용이 불가
 */