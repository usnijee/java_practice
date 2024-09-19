package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0;  // temp의 scope를 main()으로 확장한 경우
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);;

    }
}

/*
    scope는 왜 필요할까?
    - 위의 코드는 안좋은 코드이다
    1. 비효율적인 메모리 사용
     -> temp는 if문안에서만 작동하는데 scope를 if문 안이 아닌 main() 전체로 확대하면
     if문이 끝났음에도 main()이 종료되기 전까지 temp는 메모리에서 살아남게되고 이는 비효율적인 메모리 사용으로
     이어진다. 위 코드는 단순하지만 코드가 복잡하다면 상당한 메모리 손실이 발생

    2. 코드의 복잡성 증가
     -> if문을 나오면 더이상 사용하지 않는 즉, 더 이상 고려할 필요가 없는 temp를 scope를 위의 코드처럼 설정하면
     복잡성이 증가하고 유지보수가 힘들다. 협업할때도 신경쓰일 대상이 하나 늘어난 격이다.

 */

/*
    변수의 스코프 관점에서 카운터 변수 i 를 비교해보자.
    while(i < 20)문 -> 변수 i를 while문 내로 socpe를 한정지어서 선언할 수 없기에 불가피하게 while문 밖으로 scope를
    넓혀서 변수를 선언해야함
    for (int i = 0 ; i < 20 ; i ++) -> for문은 for문안으로 i를 선언할 수 있다.

    결론 > for문이 while문보다 스코프 범위를 제한할 수 있고 메모리 사용과 유지보수 관점에서 더 좋다
 */