package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain2 {

    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        // 하한 와일드 카드 : Animal 포함 상위 타입 전달 가능
        // super 키워드를 사용하여 하한을 표현
        writeBox(objBox);
        writeBox(animalBox);
//        writeBox(dogBox);  Animal보다 상위 클래스의 객체만 가능
//        writeBox(catBox);
    }

    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이" , 100));
    }
}
