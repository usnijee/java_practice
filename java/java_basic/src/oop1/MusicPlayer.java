package oop1;
/*
    객체 지향 프로그래밍

    속성(데이터)와 기능(메서드)를 하나의 클래스에 만들기
 */
public class MusicPlayer {

    int volume = 0;
    boolean isOn = false;

    void on(){
        isOn = true; // 같은 클래스내의 멤버변수 isOn의 상태를 새로 저장함
        System.out.println("음악 플레이어를 시작합니다");
    }

    void off(){
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }

    void volumeUp(){
        volume++;
        System.out.println("음악 플레이어 볼륨:" + volume);
    }

    void volumeDown(){
        volume--;
        System.out.println("음악 플레이어 볼륨:" + volume);
    }

    void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
