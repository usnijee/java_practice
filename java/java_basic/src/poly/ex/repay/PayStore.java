package poly.ex.repay;

public abstract class PayStore {

    public static Pay findPay(String option){
        if (option.equals("kakao")) {
            return new KakaoPay();       // 기능1. 결제수단 결정
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else {
            return new ExceptionPay();
        }
    }
}
