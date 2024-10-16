package extends1.super1;

public class Child extends Parent {

    // 부모 클래스와 동일한 변수명인 value를 사용
    public String value = "child";

    // override를 통해 부모 클래스의 메서드와 동일한 명의 메서드를 재정의
    @Override
    public void hello(){
        System.out.println("Child.hello");
    }

    public void call(){
        System.out.println("this value = " + this.value);
        System.out.println("super value = " + super.value);

        this.hello();
        super.hello();
    }
}
