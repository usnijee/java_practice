package poly.car0;
/*
    이 코드의 문제점 --> 자동차의 종류가 늘어날 수록 코드의 추가 및 변경사항이 계속해서 늘어난다
    why? --> 역할과 구현을 구분하지 않았기 때문이다
    만약,, 역할과 구분이 명확히 구분되어 있다면 클라이언트인 Driver 코드는 수정 및 변경사항이 없어야한다.
 */
public class Driver {

    private K3car k3Car;
    //추가
    private Model3Car model3Car;

    public void setK3car(K3car k3Car){
        this.k3Car = k3Car;
    }

    // Model3Car를 이용하기 위해 추가
    public void setModel3Car(Model3Car model3Car){
        this.model3Car = model3Car;
    }


    public void drive(){
        System.out.println("자동차를 운전합니다.");
        if(k3Car != null){
            k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.offEngine();
        }else if (model3Car != null){
            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.offEngine();
        }

    }
}
