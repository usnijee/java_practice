package generic.ex3;


public class AnimalHospitalV2<T> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        // 클래스 내의 메서드를 정의하는 시점에서는 T의 타입을 알 수 없다. 오로지 최상위인 Object의 기능만 사용 가능하다

//        System.out.println("동물 이름: " + animal.getName());
//        System.out.println("동물 크기: " + animal.getSize());
//        animal.sound();
    }

    public T bigger(T target) {
//        return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}
