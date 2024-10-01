package access.a;
/*
    접근 제어자 사용 - 제어자 규칙
    1. 클래스 -> public, default 접근제어자만 가능
    2. public 클래스는 파일명과 반드시 일치해야함
        2-1. 하나의 .java에는 반드시 하나의 public 클래스 가능
        2-2. 하나의 .java에 default 클래스는 무한으로 생성 가능
            2-2-1. default 클래스는 동일한 패키지안에서만 공유 가능

 */
// 하나의 자바 파일 안에는 1개의 public 클래스가 존재하고 해당 클래스는 파일명과 동일해야한다
public class PublicClass {
    public static void main(String[] args) {

        PublicClass publicClass = new PublicClass();
        DefaultClass1 defaultClass1 = new DefaultClass1(); // default 클래스는 무한정 생성 가능
        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}

class DefaultClass1{

}

class DefaultClass2{

}
