package generic.ex5;

import generic.animal.Animal;

public class WildcardEx {

    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    // 와일드 카드 '?' : 어떤 타입이든 전부 가능함을 의미 즉, ? : object -> 비제한 와일드카드
    // 와일드 카드 : 기존에 생성된 제너릭 타입을 일반 메서드에 사용하는 것
    static void printWildcardV1(Box<?> box) {
        System.out.println("? = " + box.get());
    }

    // 상한 와일드 카드 : 와일드 카드도 상한을 지정할 수 있다.
    //
    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }
}
