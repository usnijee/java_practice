package extends1.super2;
/*
    상속관계에서 반드시 자식 클래스는 부모 클래스의 생성자를 호출해야한다
    단, 부모 클래스의 생성자가 기본 생성자인 경우(기본 생성자 : 매개변수가 없는 생성자) 생략 가능
    기본 생성자가 아닌경우 --> super(매개변수)를 통해 부모 클래스의 생성자를 호출해주어야 한다
 */
public class ClassA {

    public ClassA(){
        System.out.println("ClassA 생성자");



    }
}
