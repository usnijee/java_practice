package lang.string.test;

public class TestString11 {

    public static void main(String[] args) {
        String str = "Hello Java";
//        StringBuilder str2 = new StringBuilder(str);
//        str2.reverse();
        String str2 = new StringBuilder(str).reverse().toString(); // 메서드 체이닝으로 한 번에 가능
        System.out.println(str2);
    }
}
