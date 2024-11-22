package lang.wrapper;

public class WrapperVsPrimitive {

    public static void main(String[] args) {
        int iterations = 1_000_000_000; // 반복 횟수 설정,, 10억
        long startTime, endTime;

        //기본형 long 사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations ; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " +sumPrimitive);
        System.out.println("기본 자료형 long 실행 시간: " + (endTime - startTime) + "ms"); // 0.2초 걸림

        // 래퍼 클래스 Long 사용
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations ; i++) {
            sumWrapper += i; // 오토 박싱이 발생
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumWrapper = " + sumWrapper);
        System.out.println("래퍼 클래스 Long 실행 시간: " + (endTime - startTime) + "ms"); // 2초 걸림
    }
}
/*
    기본형 vs 래퍼형 ,, 뭐를 사용해야할까?

    위의 예시에서 기본형이 래퍼형보다 약 10배 빠른 것을 알 수 있다. why?
    - 기본형은 메모리상에서 딱 4bytes만 사용한다
    - 래퍼형은 '객체'이기에 객체 내부의 기본형 4bytes 에다가 객체의 메타데이터까지 추가로 8~16bytes를 사용하기에 메모리를 더 많이 사용

    그래서 어떤것을 사용해야할까?
    - 10억번 반복했을 때 위와 같기에 1회를 기준으로는 거의 차이가 없다고 봐도 무방
    - CPU 연산을 아주 많이 수행하는 경우는 기본형을 사용하여 최적화를 해볼 것
    - CPU 연산이 많이 필요하지 않다면 --> 유지보수하기 더 좋은 것을 선택해야한다
 */
