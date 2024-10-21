package poly.ex6;
/*
    하나의 클래스, 여러 인터페이스를 상속 및 구현할 시 extend부터 나와야한다
 */
public abstract class AbstractAnimal {

    public abstract void sound();

    public void move(){
        System.out.println("둠칫둠칫 이동중");
    }
}
