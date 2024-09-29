package oop1;
/*
    캡슐화
        - MusicPlayer를 보면 음악 플레이어를 구성하기 위한 속성과 기능이 마치 하나의 캡슐에 쌓여있는 것 같다.
        - 속성과 기능을 하나로 묶어서 필요한 기능을 메서드를 통해 외부에 제공하는 것을 캡슐화라고 함
 */
public class MusicPlayerMain4 {

    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer(); // 마치 실제로 음악플레이어를 만들고

        musicPlayer.on(); // 음악플레이어의 버튼을 눌러 원하는 기능을 조작하는 느낌 -> 객체속에 기능이 탑재되어 가능 (객체 지향)
        musicPlayer.volumeUp();
        musicPlayer.volumeUp();
        musicPlayer.volumeDown();
        musicPlayer.showStatus();
        musicPlayer.off();

    }
}
