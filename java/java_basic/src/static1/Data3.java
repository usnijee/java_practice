package static1;
/*
    staic 변수

    - static이 붙은 멤버변수는 '정적 변수', '클래스 변수'라고 한다.
    - 클래스 변수를 main 메소드에서 사용하기 위해서는 '클래스명.클래스변수' 형태로 접근해야한다.

    - 원리가 뭘까?
    static이 붙은 멤버변수인 '클래스 변수'(정적변수)는 다른 멤버변수와 달리 클래스의 객체가 생성될 때
    힙 영역이 아닌 메소드 영역의 static 영역에 생성되며 고정된다. 따라서, 클래스 변수는 다른 멤버변수처럼
    객체마다 관리되는 형태가 아닌 1개의 static 영역에서 관리하기에 하나의 클래스에 대한 여러 객체가 공유하는 변수
    처럼 여겨진다.

 */
public class Data3 {
    public String name;  // 인스턴스 변수
    public static int count;  // 클래스 변수

    public Data3(String name){
        this.name = name;
        count ++; // Data3.count++ 로 해야할 필요도 있음
    }
}
