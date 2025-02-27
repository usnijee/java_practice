package lecture.java.condition;

public class Con1 {

    public static void main(String[] args) {

//      1. 조건문 - if
        System.out.println("== if ==");
        int waterTemperature = 99;

        if (waterTemperature >= 100) {
            System.out.println("물이 끓습니다.");
        } else {
            System.out.println("물을 끓이는 중입니다");
        }

        int score = 90;
        char grade = 0;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        System.out.println("grade = " + grade);

//      2. 조건문 - switch
        System.out.println("== switch ==");
        String fruit = "apple";

        switch (fruit) {
            case "apple":
                System.out.println(fruit + "은 5000원 입니다.");
                break;
            case "blueberry":
                System.out.println(fruit + "은 10000원 입니다.");
            default:
                System.out.println("해당 과일이 없습니다");
                break;
        }


//      Q1. number의 값이 홀수인지 짝수인지 판단하는 코드를 작성하세요.
        int number = 5;
        if (number % 2 == 0) {
            System.out.println("짝수 입니다");
        } else {
            System.out.println("홀수 입니다");
        }


//      Q2. 아래 주석은 위의 실습에서 진행한 score에 따라 grade를 출력하는 코드이다.
//        이를 switch 조건문 기반으로 바꿔보세요.
//        int score = 90;
//        char grade = 0;
//        if (score >= 90) {
//            grade = 'A';
//        } else if (score >= 80) {
//            grade = 'B';
//        } else if (score >= 70) {
//            grade = 'C';
//        } else {
//            grade = 'F';
//        }
//        System.out.println("grade = " + grade);

        int scores = 76;
        char grades = 0;

        switch (scores / 10) { // scores만 사용하면 모든 범위를 switch로만 표현이 불가능 -> 10으로 나누었을 때 몫을 구하면 int형이기에 소수점 제외 정수만 남게되어 점수 분기가 가능하다
            case 9:
                grades = 'A';
                break;
            case 8:
                grades = 'B';
                break;
            case 7:
                grades = 'C';
                break;
            default:
                grades = 'F';
                break;
        }

        System.out.println(grades);


    }

}
