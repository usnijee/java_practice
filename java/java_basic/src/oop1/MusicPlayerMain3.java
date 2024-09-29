package oop1;
/*
    메소드를 사용하여 재사용성이 크거나 중복되는 부분을 대체하기위해 모듈화를 진행

    모듈화의 장점

        - 중복 제거 : 로직 중복이 제거됨, 같은 로직이 필요하면 해당 매소드를 여러번 호출하면 됨
        - 변경 영향 범위 : 기능을 수정할 때 해당 메소드 내부만 변경하면 된다.
        - 메서드 이름 추가 : 메서드 이름을 통해 코드를 더 쉽게 이해 가능

    --> 하지만, 절차 지향 프로그래밍의 한계가 존재
        - 음악 플레이어 데이터 : MusicPlayerData에 존재
        - 음악 플레이어 데이터 기능 : MusicPlayerMain3에 존재
        즉, 데이터와 기능이 분리되어 있어서,
            - 관리 포인트가 2곳임
            -
 */
public class MusicPlayerMain3 {

    public static void main(String[] args) {

        MusicPlayerData data = new MusicPlayerData(); // 객체 생성 및 변수에 참조값 저장

        // 음악 플레이어 켜기
        on(data);

        //볼륨 증가
        volumeUp(data);

        //볼륨 증가
        volumeUp(data);

        //볼륨 감소
        volumeDown(data);

        //음악 플레이어 상태
        showStatus(data);

        //음악 플레이어 끄기
        off(data);
    }

    static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    static void off(MusicPlayerData data){
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }

    static void volumeUp(MusicPlayerData data){
        data.volume++;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }

    static void volumeDown(MusicPlayerData data){
        data.volume--;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }

    static void showStatus(MusicPlayerData data){
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
