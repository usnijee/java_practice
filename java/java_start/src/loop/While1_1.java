package loop;
/*
while문을 사용해서 1을 한 번씩 더해서 총 3번 더하는 코드를 만들어보자
 */

public class While1_1 {
    public static void main(String[] args) {
        int count = 0;
        while (count < 3){
            count ++;
            System.out.println(count);
        }
    }
}
