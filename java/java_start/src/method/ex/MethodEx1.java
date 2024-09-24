package method.ex;
/*
메소드를 활용하여 코드를 리팩토링 해보기
 */
public class MethodEx1 {

    public static void main(String[] args) {
        System.out.println("평균값: " + average(1,2,3));
        System.out.println("평균값: " + average(15,25,35));
    }

    public static double average(int a, int b, int c){
        int sum = a + b + c;
        return sum / 3.0;
    }

}


