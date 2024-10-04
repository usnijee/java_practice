package static1;
/*
    static 변수 사용 방법
    1. Data3.count  --> 클래스를 통해 접근
    2. data1.count  --> 인스턴스를 통해 접근 (이것도 가능하다 다만 비추천 --> 인스턴스 변수와 헷갈릴수 있다)
 */
public class DataCountMain3 {

    public static void main(String[] args) {

        Data3 data1 = new Data3("A");
        System.out.println("A count=" + Data3.count); // static 변수 사용방법

        Data3 data2 = new Data3("B");
        System.out.println("B count=" + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count=" + Data3.count);
    }
}
