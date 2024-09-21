package array;
/*
    향상된 for문
    = for-each문
    = 향상된 for문은 배열의 인덱스를 사용하지 않고, 종료 조건을 주지 않아도 된다.
      단순히 해당 배열을 처음부터 끝까지 탐색한다. 즉, 배열을 처음부터 끝까지 탐색하려면 향상된 for문을 사용하면 좋다
 */
public class EnhancedFor1 {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        //일반 for문
        for (int i = 0; i < numbers.length; i++){
            int number = numbers[i];
            System.out.println(number);
        }

        //향상된 for문, for-each문
        //실무에서 사용 많이하는 for문
        for (int number : numbers){
            System.out.println(number);
        }

    }
}
