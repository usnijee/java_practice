package access;

public class SpeakerMain {

    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        // 필드에 직접 접근-----------------> 접근제어자의 필요성이 나오는 부분
        // 본래 스피커의 볼륨은 100으로 제한되어 있어야하나, 접근제어자가 없어 유저가 볼륨의 값을 임의로 변경 가능 --> 제한이 필요
        // Speaker 클래스의 volume을 private int volume으로 제한해보자 ---> 유저가 volume으로 직접접근이 불가능함을 알 수 있다
//        System.out.println("volume 필드 직접 접근 수정");
//        speaker.volume = 200;
//        speaker.showVolume();
    }
}
