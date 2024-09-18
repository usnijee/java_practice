package loop;
// 문제: 1부터 5까지 숫자를 출력하는데, 숫자가 3일 때는 출력을 건너뛰어야 한다.
public class Continue1 {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 5){
            if (num == 3){
                num ++;
                continue;
            }
            System.out.println(num);
            num ++;

        }

    }
}
