package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {
    // 이 패키지는 a 패키지와 다르기에 a 패키지의 default class를 사용할 수 없다
    PublicClass publicClass = new PublicClass();

//    DefaultClass1 class1   --> default class는 다른 패키지에서 사용 불가능
}
