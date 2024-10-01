package access.a;

public class PublicClassInnerMain {
    PublicClass publicClass = new PublicClass();
    DefaultClass1 class1 = new DefaultClass1(); // 같은 패키지 안의 default class는 사용 가능하다
    DefaultClass2 class2 = new DefaultClass2();
}
