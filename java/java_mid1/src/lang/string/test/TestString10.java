package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] parts = fruits.split(",");
        for (String s : parts) {
            System.out.println(s);
        }
//        String joinedString = String.join("->",parts[0],parts[1],parts[2]);
        String joinedString = String.join("->", parts); // String.join은 배열을 그대로 파라미터로 받을 수 있다.
        System.out.println(joinedString);

    }
}
