package cond;
/*
    if-else if는 아는 내용이기에 생략한다
    switch는 복습을 위함
 */
/*
    당신은 회원 등급에 따라 다른 쿠폰을 발급하는 프로그램을 작성해야 한다.
    이 프로그램은 int grade 라는 변수를 사용하며, 회원 등급( grade )에 따라 다음의 쿠폰을 발급해야 한다.
    1등급: 쿠폰 1000
    2등급: 쿠폰 2000
    3등급: 쿠폰 3000
    위의 등급이 아닐 경우: 쿠폰 500
 */
// 먼저 if문으로 풀어보기
//public class Switch1 {
//    public static void main(String[] args) {
//        int grade = 3;
//        int coupon;
//        if (grade == 1){coupon = 1000;}
//        else if (grade == 2){coupon = 2000;}
//        else if (grade == 3){coupon = 3000;}
//        else{coupon = 500;}
//        System.out.println("발급받은 쿠폰 " + coupon);
//
//    }
//}
public class Switch1 {
    public static void main(String[] args) {
        int grade = 3;
        int coupon;
        switch (grade){
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
                break;
        }
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
/*
    switch문 정리

    switch(조건식) {
        case value1:
        //조건식이 value1일때 실행되는 코드
        break;

        case value2:
        //조건식이 value2일때 실행되는 코드
        break;

        case value3:
        //조건식이 value3일때 실행되는 코드
        break;

        즉, switch문은 if문과 달리 조건식이 value인지 값이 같은지 확인하는 연산만 가능
        if문은 특정 조건에 만족하는 조건식을 자유롭게 적을 수 있음
        즉, switch문은 사용x여도 되나 if문을 더 간결하게 작성하는 경우가 존재
 */
