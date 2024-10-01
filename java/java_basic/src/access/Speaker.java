package access;
/*
    접근 제어자(Access modifier) -> 접근 제어자를 사용하면 해당 클래스 왜부에서 특정 필드나 메서드에 접근하는 것을 제한 가능
 */
public class Speaker {

    private int volume;

    Speaker(int volume){ // 생성자
        this.volume = volume;
    }

    void volumeUp(){
        if(volume >= 100){
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("음량을 10 감소합니다");
    }

    void showVolume() {
        System.out.println("현재 음량:" + volume);
    }
}
