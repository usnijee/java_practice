package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println("value1 = " + data.value1); // value1의 값은 멤버변수의 복제값인데 0으로 자동 초기화 됨
        System.out.println("value2 = " + data.value2);
    }
}
