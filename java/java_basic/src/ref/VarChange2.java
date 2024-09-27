package ref;
/*
    클래스에서의 변수 대입은 어떻게 될까
 */
public class VarChange2 {

    public static void main(String[] args) {
        Data dataA = new Data(); // 객체 생성 및 선언
        dataA.value = 10;
        Data dataB = dataA; // 위에서 생성된 객체의 메모리 주소값(참조값)이 복제되어 dataB에 저장
                            // 즉, dataB도 동일한 객체를 가리키게 됨
                            // 따라서, dataA에서 객체의 메소드에 접근하기위해 .를 통해 접근하여 값을 저장하면
                            // dataB도 동일한 객체를 가리키기에 동일한 속성값을 갖게됨
        System.out.println("dataA의 참조값 = " + dataA);
        System.out.println("dataB의 참조값 = " + dataB);
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        //dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20" );
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        //dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30" );
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);
    }
}
