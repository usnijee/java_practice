package access;

public class BankAccount {
    // alt + insert : generate 단축키
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    //public 메서드 : deposit
    public void deposit(int amount){
        if(isAmountVaid(amount)){
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    public void withdraw(int amount){
        if (isAmountVaid(amount) & (balance - amount > 0)){
            balance -= amount;
        } else {
            System.out.println("잔액이 부족합니다");
        }
    }

    public int getBalance(){
        return balance;
    }

    private boolean isAmountVaid(int amount){
        // 금액이 맞는 금액인지 검증하는 메소드
        return amount > 0;
    }
}
