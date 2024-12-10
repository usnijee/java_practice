package generic.ex4;
/**
 *  제네릭 타입과 제네릭 메서드의 타입 매개변수가 t로 동일한 경우
 *  제네릭 메서드가 더 높은 우선순위를 갖는다
 *
 *  이러한 모호한 표현은 좋지않기에 타입을 다르게 해주어야 한다
 */

import generic.animal.Animal;

public class ComplexBox2<T extends Animal> { // 제너릭 타입

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    // printAndReturn은 상한이 없기에 T는 Object타입 취급
    public <T> T printAndReturn(T t) {
        System.out.println("animal.className: " + animal.getClass().getName());
        System.out.println("t.className: " + t.getClass().getName());
        return t;
    }
}
