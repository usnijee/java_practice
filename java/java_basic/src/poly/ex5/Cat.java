package poly.ex5;

public class Cat implements InterfaceAnimal{ // 인터페이스의 경우 implements(구현)을 사용한다
    @Override
    public void sound(){
        System.out.println("냐옹");
    }

    @Override
    public void move(){
        System.out.println("캣츠종이 움직임");
    }
}
