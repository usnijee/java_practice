package cond.ex;
/*
특정 금액을 미국 달러에서 한국 원으로 변환하는 프로그램을 작성하자. 환율은 1달러당 1300원이라고 가정하자. 다음
과 같은 기준을 따른다.
달러가 0미만이면: "잘못된 금액입니다."
달러가 0일 때: "환전할 금액이 없습니다."
달러가 0 초과일 때: "환전 금액은 (계산된 원화 금액)원입니다."

 */
public class ExchangeEx {
    public static void main(String[] args) {
        int dollar = 20;
        if (dollar < 0){
            System.out.println("잘못된 금액입니다.");
        }else if (dollar == 0){
            System.out.println("환전할 금액이 없습니다.");
        }else {
            System.out.println("환전 금액은 " + 1300*dollar+"원입니다.");
        }
    }
}
