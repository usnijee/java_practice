package poly.basic;
/*
    instanceof를 통해 인스턴스 타입 확인하기

    1. A instanceof B 에서,,
        true --> A가 B에 들어갈 수 있을 때 ,, (부모 - 부모 , 자식 - 부모)
        false --> A가 B에 들어갈 수 없을 때 ,, (부모 - 자식)
 */
public class CastingMain5 {

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
        if (parent instanceof Child){
            System.out.println("Child 인스턴스 맞음");
            // Child 클래스에 대한 인스턴스가 맞기에 --> 다운 캐스팅 가능
            Child child = (Child) parent;
            child.childMethod();
        }else {
            System.out.println("Child 인스턴스 아님,, 다운캐스팅 불가능");
        }
    }
}
