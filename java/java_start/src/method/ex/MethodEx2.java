package method.ex;
/*
    특정 숫자만큼 같은 메시지를 반복 출력하는 기능의 코드를 리팩토링 하기
 */
public class MethodEx2 {
    public static void main(String[] args) {
        message("Hello, world!", 3);
        message("love ya", 5);
        message("i don't know what you think", 2);

    }

    public static void message(String message, int num){
        for (int i = 0 ; i < num ; i++){
            System.out.println(message);
        }
    }
}
