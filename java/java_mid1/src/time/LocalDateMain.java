package time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2013,11,21);
        System.out.println("오늘 날짜 = " + nowDate);
        System.out.println("지정 날짜 = " + ofDate);

        //계산(불변 클래스)
//        ofDate.plusDays(10); // LocalDate 클래스는 불변 클래스이기에 반환값을 따로 받아주어야한다
        ofDate = ofDate.plusDays(10);
        System.out.println("지정 시간 + 10d = " + ofDate);
    }
}
