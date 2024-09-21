package array;
/*
    향상된 for문을 사용하지 못하는 경우
    -> 단순히 배열의 값을 순차적으로 참조하는 것이 아닌 배열의 인덱스를 직접 사용해야하는 경우
 */
public class EnhancedFor2 {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        //for-each문을 사용할 수 없는 경우, 증가하는 index 값 필요
        for(int i = 0; i < numbers.length; ++i) {
            System.out.println("number" + i + "번의 결과는: " + numbers[i]);
        }

    }
}
