package lecture.loop;

public class Loop1 {
    public static void main(String[] args) {

//      1. 반복문 - for
        System.out.println("== for ==");
//      1-1. 기본 사용 방법
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            if (i == 2) { // i가2일때 skip
                continue;
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            if (i == 2) { // i가2일때 skip
                break;
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//      1-2. for each
        int[] nums = {1, 2, 3, 4, 5};
        for (int num : nums) {
            System.out.println(num);
        }


//      2. 반복문 - while
        System.out.println("== while ==");
//      2-1. while
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            break;
        }


////      2-2. do-while
        // do while은 일단 do!하고 조건문 확인
        System.out.println("== do-while ==");
        boolean knock = false;
        do {
            System.out.println("knock");
        } while (knock);

        
//      Q1. 아래와 같은 출력 결과를 반복문과 조건문을 이용하여 출력해보세요.
//      *
//      ***
//      *****
//      *******
        for (int j = 0; j < 8; j++) {
            if (j % 2 == 0) { // 짝수 -> continue로 다음 index로 넘어감
                continue;
            }
            for (int k = 0; k < j; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


//      Q2. 반복문을 실행할 때마다 물 온도를 1도씩 올리고 100도가 되면 종료한다.
//          추가로, 10도, 20도, ... 10도 간격으로 물 온도를 출력하시오.
        int waterTemperature = 0;

        while (true) {
            waterTemperature++;
            if (waterTemperature % 10 == 0) {
                System.out.println(waterTemperature);
            }
            if (waterTemperature == 100) {
                break;
            }
        }


    }
}
