package method.ex;

/*
    다음은 입금, 출금을 나타내는 코드이다.
    입금(deposit)과, 출금(withdraw)을 메서드로 만들어서 리펙토링 해보자
 */
public class MethodEx3 {

    public static void main(String[] args) {
        int balance = 10000;

        balance = deposit(balance,1000);
        balance = withdraw(balance,2000);
        System.out.println("최종 잔액 : " + balance + "원");

    }

    public static int deposit(int balance, int depositAmount ){
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int withdrawAmount){
        if (balance >= withdrawAmount){
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else{
            System.out.println("출금이 불가능합니다.");
        }
        return balance;
    }
}
/*
메서드 추출(Extract Method)
    리펙토링 결과를 보면 main() 은 세세한 코드가 아니라 전체 구조를 한눈에 볼 수 있게 되었다.
    - 입금과 출금 부분이 메서드로 명확하게 분리 -> 변경 사항이 발생하면 관련된 메서드만 수정하면 된다.
    - 특정 메서드로 수정 범위가 한정되기 때문에 더 유지보수 하기 좋다.
    - 메서드를 재사용하는 목적이 아니어도 괜찮다.
    - 메서드를 적절하게 사용해서 분류하면 구조적으로 읽기 쉽고 유지보수 하기 좋은 코드를 만들 수 있다.
    - 메서드의 이름 덕분에 프로그램을 더 읽기 좋게 만들 수 있다.
 */