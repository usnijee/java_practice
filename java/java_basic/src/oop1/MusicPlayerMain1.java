package oop1;
/*
    절차 지향 프로그래밍 vs 객체 지향 프로그래밍

    1. 절차 지향 프로그래밍
        - 실행 순서를 중요하게 여기는 방식
        - 프로그램의 흐름을 순차적으로 따르며 처리하는 방식, "어떻게"를 중심으로 프로그래밍

    2. 객체 지향 프로그래밍
        - 객체를 중요하게 생각하는 방식
        - '무엇을'을 중심으로 프로그래밍

    3. 절차지향과 객체지향의 차이점
        - 절차 지향 : 데이터와 데이터를 처리하는 방식이 분리되어 있다
        - 객체 지향 : 데이터와 해당 데이터에 대한 행동(메소드)가 하나의 '객체'안에 포함됨
 */
public class MusicPlayerMain1 {

    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        //음악 플레이어 켜기
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다");

        //볼륨 증가
        volume ++;
        System.out.println("음악 플레이어 볼륨:" + volume);

        //볼륨 증가
        volume ++;
        System.out.println("음악 플레이어 볼륨:" + volume);

        //볼륨 감소
        volume --;
        System.out.println("음악 플레이어 볼륨:" + volume);

        //음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if (isOn){
            System.out.println("음악 플레이어 ON, 볼륨:" + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
        //음악 플레이어 끄기
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다");

    }
}
