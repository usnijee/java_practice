package loop.ex;
/*
처음 10개의 자연수를 출력하는 프로그램을 작성해 보세요. 이때, count 라는 변수를 사용해야 합니다.
while문, for문 2가지 버전의 정답을 만들어야 합니다.
 */
public class loopEx1 {
    public static void main(String[] args) {
//        int count = 0;
//        for (int i = 1; i <= 10 ; i++){
//            count = i;
//            System.out.println(count);
//        }
        int count = 1;
        while (count <= 10){
            System.out.println(count);
            count++;
        }
    }
}
