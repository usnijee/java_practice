package loop;
//do-while 문은 while 문과 비슷하지만, 조건에 상관없이 무조건 한 번은 코드를 실행한다.
/*do-while문 구조

    do {
     // 코드
    } while (조건식);

 */
// 즉, do-while문은 최초 코드 1회 실행 후 조건 검사를 진행 , 조건에 맞지 않으면 반복문을 빠져나옴
public class DoWhile1 {
    public static void main(String[] args) {
        int i = 10;
        do{
            System.out.println("현재 숫자는:" + i);
            i++;
        } while(i<3);

    }
}
