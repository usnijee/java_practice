package cond.ex;
/*
주어진 거리에 따라 가장 적합한 운송 수단을 선택하는 프로그램을 작성하자. 다음과 같은 기준을 따른다.
거리가 1km 이하이면: "도보"
거리가 10km 이하이면: "자전거"
거리가 100km 이하이면: "자동차"
거리가 100km 초과이면: "비행기"
 */

public class DistanceEx {
    public static void main(String[] args) {
        int distance = 15;
        String trans="";
        if (distance <= 1){
            trans = "도보";
        } else if ((distance > 1) && (distance <= 10)){
            trans = "자전거";
        } else if ((distance > 10) && (distance <= 100)){
            trans = "자동차";
        } else if (distance > 100){
            trans = "비행기";
        }
        System.out.println(trans + "를 이용하세요");
    }
}
