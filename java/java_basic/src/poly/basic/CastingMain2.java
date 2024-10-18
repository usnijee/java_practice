package poly.basic;

public class CastingMain2 {
    // 다운 캐스팅 : 부모타입을 자식 타입으로 변경하는 것
    // 다운 캐스팅 결과를 변수에 저장하는것 번거로움

    // 일시적 다운 캐스팅
    public static void main(String[] args) {
        Parent poly = new Child();
        // 단 자식의 기능은 호출 불가능
        // poly.childMethod();

        //일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child) poly).childMethod();

        // 그렇다면 다운캐스팅의 경우 poly의 형이 바뀌는것일까? No
        // poly에 저장되어 있는 기존의 Child 인스턴스의 참조값에 대해서 캐스팅이 일어나는 것
    }
}
