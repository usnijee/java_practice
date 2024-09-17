package cond;

public class Switch2 {
    public static void main(String[] args) {
        // java의 새로운 switch문
        int grade = 2;

        int coupon = switch (grade){
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("발급받은 쿠폰 " + coupon);
    }
    /*
    새로운 switch문의 특정
    1. ->을 통해 분기마다 지정된 value를 표현
    2. 반환된 값을 변수에 저장 가능
     */
}
