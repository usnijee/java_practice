package generic.ex3;
/**
 * 타입 매개변수 제한
 * generic 타입에 extends를 도입하면 ...?
 * <T extends Animal> : Animal과 Animal 자식들의 타입만 T로 사용 가능함을 의미
 */

import generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {

        System.out.println("동물 이름: " + animal.getName()); // 컴파일 오류가 더이상 발생하지 않는다
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public T bigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
