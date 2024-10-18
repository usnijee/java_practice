package poly.basic;
/*
    instanceof를 통해 인스턴스 타입 확인하기

    1. A instanceof B 에서,,
        true --> A가 B에 들어갈 수 있을 때 ,, (부모 - 부모 , 자식 - 부모)
        false --> A가 B에 들어갈 수 없을 때 ,, (부모 - 자식)

    2. java 16부터는 instanceof와 변수선언이 동시에 가능함
 */
public class CastingMain6 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child(); // 다형적 참조
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent){
        parent.parentMethod();
        if (parent instanceof Child child){  // java16부터는 instanceof와 변수선언을 동시에 할 수있다
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        }else {
            System.out.println("Child 인스턴스 아님,, 다운캐스팅 불가능");
        }
    }
}
