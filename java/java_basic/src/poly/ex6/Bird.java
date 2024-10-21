package poly.ex6;

public class Bird extends AbstractAnimal implements Fly{
    @Override
    public void fly() {
        System.out.println("푸드덛 푸드덛");
    }

    @Override
    public void sound() {
        System.out.println("피옹~");
    }
}
