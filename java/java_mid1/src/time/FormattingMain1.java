package time;
/*
    DateTimeFormatter : 날짜 객체를 원한느 형태의 문자로 변경
    ofPattern(특정 문자열)을 통해 특정 포맷 지정 가능 (yyyy:년도, MM:월, dd:일)
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class FormattingMain1 {

    public static void main(String[] args) {
        // 포맷팅 : 날짜 -> 문자

        LocalDate date = LocalDate.of(2024,12,31);
        System.out.println("date = " + date);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd"); //

        String formattedDate = date.format(formatter);
        System.out.println("날짜와 시간 포맷팅: " + formattedDate);

        //파싱 : 문자 -> 날짜
        String input = "2024.12.31";
        LocalDate parsedDate = LocalDate.parse(input, formatter);
        System.out.println("문자열 파싱 날짜와 시간: " + parsedDate);
    }
}
