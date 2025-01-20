package dataStructure.array.practice;

public class Practice1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum1= 0;
        int sum2 = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        double avg1 = 0;
        double avg2 = 0;

        for (int i : arr) {
            if (i % 2 == 0) {
                sum1 += i;
                cnt1++;
            } else {
                sum2 += i;
                cnt2++;
            }
        }
        avg1 = (double) (sum1 / cnt1);
        avg2 = (double) (sum2 / cnt2);

        System.out.println("짝수 평균: " + avg1);
        System.out.println("홀수 평균: " + avg2);
    }
}
