package review.exception.basic.unchecked;

import review.exception.basic.checked.Service;

public class UncheckedCatchMain {

    public static void main(String[] args) {
        review.exception.basic.checked.Service service = new Service();
        service.callCatch();
        System.out.println("정상 종료");
    }
}
