package final1;
/*
    상수가 없는 경우
 */
public class ConstantMain1 {

    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 " + 1000);
        int currentUerCount = 999;
        process(currentUerCount++);
        process(currentUerCount++);
        process(currentUerCount++);
        process(currentUerCount++);
    }

    private static void process (int currentUerCount){
        System.out.println("참여자 수 : " + currentUerCount);
        if(currentUerCount > 1000){
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참가합니다.");
        }
    }
}

/*
    위 코드의 문제점
    1. 프로그램 최대 참여자 수를 바꾸려면 변경 포인트가 2개나 존재
    2. 매직넘버문제 --> 출력문에 프로그램 최대 참여자 수와 같은 설명이 없다면 1000이 뜻하는 게 무엇인지
    직관적으로 알기어렵다

    --> static final 변수로 관리하면 좋다
 */
