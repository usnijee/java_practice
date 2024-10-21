package poly.ex6;

import java.sql.SQLOutput;

public class Chicken extends AbstractAnimal implements Fly{
    @Override
    public void sound() {
        System.out.println("꼬기오오오옥!");
    }

    @Override
    public void fly() {
        System.out.println("푸드덕 푸드덕");
    }
}
