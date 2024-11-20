package lang.string.builder;

public class LoopStringMain {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis(); // 현재 밀리세컨드 시간을 구하기

        String result = "";
        for (int i = 0 ; i < 100000; i++) {
            result += "Hello Java ";
            // result += new StringBuilder().append(result).append("Hello Java").toString(); 형태로 최적화 진행
            // 즉, 반복문의 횟수만큼 toString()에 의해 String객체가 생성되는 격.. 최적화 x
        }
        long endTime = System.currentTimeMillis();

        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime) + "ms"); // time = 3054ms ,, 상당히 느림
    }
}

/*
    String 최적화
    - 대부분은 문자열 리터럴 상수 + 연산으로 최적화 가능
    ex. String str = "Hello, " + "World !";

    - 문자열 리터럴이 아닌 String 변수 최적화의 경우
    ex. String result = str1 + str2;
    --> String result = new StringBuilder().append(str1).append(str2).toString() 으로 내부에서 최적화 진행

    - 반복문, 조건문의 경우 --> String 최적화가 어려움 ,, 직접적으로 StringBuilder를 사용하기
    ex. 위의 LoopStringMain이 대표적인 예시

 */
