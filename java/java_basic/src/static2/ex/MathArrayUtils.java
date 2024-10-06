package static2.ex;

public class MathArrayUtils {
    private static int sum;
    private static double average;
    private static int max ;
    private static int min ;

    public MathArrayUtils(){ // 객체 생성시 null 반환
        return;
    }

    public static int sum(int[] values){
        for(int i = 0 ; i < values.length; i++){
            sum += values[i];
        }
        return sum;
    }

    public static double average(int[] values){
        if (sum != 0){
            average = (double) sum / values.length;
        } else{
            System.out.println("sum이 선행되어야 합니다");
        }
        return average;
    }

    public static int min(int[] values){
        min = values[0];
        for (int i = 0 ; i < values.length ; i++){
            if (min > values[i]){
                min = values[i];
            }
        }
        return min;
    }

    public static int max(int[] values){
        max = values[0];
//        for(vale:values){
        for (int i = 0 ; i < values.length; i++){
            if (max < values[i]){
                max = values[i];
            }
        }
        return max;
    }
}
