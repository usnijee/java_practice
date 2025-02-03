package lecture.dataStructure.linear.practice.practice1_3;

public class Practice3 {
    public static void solution(int[] data) {
        int[] balloon = new int[data.length];

        for (int i = 0; i < data.length; i++) {
            balloon[i] = i + 1;
        }

        int p1 = 0;
        int start = 0;

        for (int i = 0; i < data.length; i++) {
            if (i == 0) {

            }
            if (data[i] > 0) {
                start = i + data[i];
            }
        }


    }

    public static void main(String[] args) {
        int[] balloon = {3, 2, 1, -3, -1};
        solution(balloon);

        System.out.println();
        balloon = new int[]{3, 2, -1, -2};
        solution(balloon);
    }

    StringBuilder sb = new StringBuilder();
}
