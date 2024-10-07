# 접근 제어자 
"좋은 프로그램은 무한한 자유도가 주어지는 프로그램이 아니라 적절한 제약을 제공하는 프로그램이다"

### 1. 접근 제어자를 사용하는 이유

* 접근제어자(Access modifier)
  * public, private, default, protected
  * 해당 클래스외부에서 클래스 내의 필드나 메서드에 접근하는 것을 허용하거나 제한할 수 있음 

### 2. 접근 제어자 종류
* private : 모든 외부 호출 x
* default(package-private) : 같은 패키지 내의 호출 o 나머지는 x 
* protected : 같은 패키지안에서 호출 o . 패키지가 달라도 상속 관계의 호출 o 
* public : 모든 외부 호출 허용 