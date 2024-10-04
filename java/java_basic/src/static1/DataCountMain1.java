package static1;
/*
특정 클래스를 통해서 생성된 객체의 수를 세는 단순한 프로그램이다.

--> 하지만 Data1.java와 밑의 코드를 실행하면 원하는 결과를 얻을 수 없다. 그 이유는 서로 다른 3개의 객체를 생성하였고 서로 다른 참조값을 갖기 때문이다
 */
public class DataCountMain1 {

    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("A count=" + data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("B count=" + data2.count);

        Data1 data3 = new Data1("C");
        System.out.println("C count=" + data3.count);

    }
}
