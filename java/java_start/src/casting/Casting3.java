package casting;

public class Casting3 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최고값
        long maxIntOver = 2147483649L; // int 최고값 + 초과값 ,, 리터럴 필요
        int intValue = 0;

        intValue = (int) maxIntValue ; //형변환 --> maxIntValue는 int로 표현가능한 최대값 즉, int로 표현가능하기에 형변환 안해도 가능
        System.out.println("maxIntValue  = " + intValue);

        intValue = (int) maxIntOver ; // int의 범위가 넘어간 대상을 int로 형변환하게 되면 어떻게 될까 -> 오버플로우 발생
        System.out.println("maxIntOver  = " + intValue); //-2147483648
        // 오버플로우가 발생했을 시 나오는 값은 뭘 의미할까?
        // --> int의 최댓값 2147483647에서 1을 올린 값인 2147483648을 대입한 결과 -2147483648이 출력됨
        // --> 시계라고 생각하자 최댓값에서 1을 더했더니 최소값이 나왔고 이는 24시에서 0시 1초가 된격이다
        // --> 근데 이 오버플로우가 어떻게 나타난건지는 중요한게 아님 , 그냥 오버플로우가 발생하면 안됌
        // 즉, 오버플로우 자체가 발생하지 않도록 해야함 --> (int)가 아닌 long타입으로 바꾸자
    }
}
