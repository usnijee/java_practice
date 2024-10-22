package poly.ex.pay0;

public abstract class SelectOption {

    //결제 수단 추가시 변하는 부분
    public static PayMethod findPay(String option){
        if (option.equals("kakao")){
            return new KakoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else {
            return new DefaultPay();
        }
    }

}
