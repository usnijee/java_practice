package method;

public class MethodReturn1 {
    public static void main(String[] args) {

        boolean result = odd(2);
        System.out.println(result);
    }

    public static boolean odd(int i){  // 반환형태가 void가 아니면 모든 경우의 수에 대해서 반드시 반환값이 존재해야한다
        if (i % 2 == 1) {
            return true;
        }else {
            return false;
        }
    }
}
