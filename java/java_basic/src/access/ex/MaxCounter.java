package access.ex;

public class MaxCounter {
    // 접근 제어자를 고려해서 클래스를 만들어 볼 것.
    // 캡슐화 !

    // 멤버변수는 특수한 경우가 아니면 private을 통해 유저가 수정할 수 없도록 보호해야함
    private int count = 0;
    private int max;
    public MaxCounter(int max){ // 생성자 -> 초기값 설정
        this.max = max;
    }

    // 클래스내의 메서드는 main에서 사용해야하기에 public으로 접근 가능해야함
    public void increment(){
        if (count < max){
            count ++;
        }else {
            System.out.println("최댓값 초과 불가능");
        }

    }

    public int getCount(){
        return count;
    }
}
