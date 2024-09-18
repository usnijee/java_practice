package cond.ex;
/*
String grade 라는 문자열을 만들고, 학점에 따라 성취도를 출력하는 프로그램을 작성하자. 각 학점은 다음과 같은
성취도를 나타낸다.
"A": "탁월한 성과입니다!"
"B": "좋은 성과입니다!"
"C": "준수한 성과입니다!"
"D": "향상이 필요합니다."
"F": "불합격입니다."
나머지: "잘못된 학점입니다."

--> 일반 C와 동일한 switch문으로 해도 되나 java의 새로운 switch문으로 해볼 것
 */
public class GradeSwitchEx {
    public static void main(String[] args) {
        String grade = "D";
        String result = switch (grade){
            case "A" -> "탁월한 성과입니다!";
            case "B" -> "좋은 성과입니다!";
            case "C" -> "준수한 성과입니다!";
            case "D" -> "향상이 필요합니다.";
            case "F" -> "불합격입니다.";
            default -> "잘못된 학점입니다.";
        };
        System.out.println(result);

    }
}
