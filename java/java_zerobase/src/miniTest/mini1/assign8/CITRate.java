package miniTest.mini1.assign8;

import java.util.Arrays;

public enum CITRate {
    LOWEST(0, 12_000_000, 12_000_000, 0.06, 0),
    LOW(12_000_000, 46_000_000, 34_000_000, 0.15, 1_080_000),
    MIDDLE_LOW(46_000_000, 88_000_000,42_000_000, 0.24, 5_220_000),
    MIDDLE(88_000_000, 150_000_000, 62_000_000,0.35, 14_900_000),
    MIDDLE_HIGH(150_000_000, 300_000_000, 150_000_000,0.38, 25_400_000),
    HIGH(300_000_000, 500_000_000, 200_000_000,0.4, 25_400_000),
    VERY_HIGH(500_000_000, 1_000_000_000, 500_000_000,0.42, 35_400_000),
    HIGHEST(1_000_000_000, Integer.MAX_VALUE, 0,0.45, 65_400_000);

    private final int minValue;
    private final int maxValue;
    private final int bracketAmount; // 소득세율구간세
    private final double taxRate;
    private final int pd;

    CITRate(int minValue, int maxValue, int bracketAmount, double taxRate, int pd) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.bracketAmount = bracketAmount;
        this.taxRate = taxRate;
        this.pd = pd;
    }

    // 소득 세율에 의한 세금 계산 메서드
    public static void calculateTaxByTaxRate(int income) {
        CITRate findRate = getRange(income);
        int sumSubBracketTax = 0; // income 구간의 하위 구간 세금 총합
        int sumBracketAmount = 0;
        int remainder = 0;
        int totalTax = 0;
        for (CITRate citRate : values()) {
            /**
             * 특정 소득에 해당하는 구간의 하위 구간은 소득세율구간세와 세율의 곱으로 계산 후
             * 차액에 대해 해당 구간의 세율 적용
             */
            if (citRate.ordinal() < findRate.ordinal()) {
                sumSubBracketTax += (int) (citRate.bracketAmount * citRate.taxRate);
                sumBracketAmount += citRate.bracketAmount;

                displayCalculatedResult(citRate.bracketAmount, citRate);
            }
        }
        remainder = income - sumBracketAmount; // 차액 (소득 - 하위구간 소득세율구간세 합)
        displayCalculatedResult(remainder, findRate);

        totalTax = (int) (sumSubBracketTax + remainder * findRate.taxRate);

        System.out.println();
        System.out.printf("[세율에 의한 세금]: %17d\n" , totalTax);

    }

    //
    public static void calculateTaxByPD(int income) {
        CITRate findRate = getRange(income);
        long totalTax = Math.round(income * findRate.taxRate) - findRate.pd; // 부동 소수점의 오류? 발생

        System.out.printf("[누진공제 계산에 의한 세금]: %10d\n" , totalTax);
    }

    private static void displayCalculatedResult(int expense, CITRate rate) {
        System.out.printf("%10d * %3d%% = %11d\n", expense,
                (int) (rate.taxRate * 100), (int) (expense * rate.taxRate));
    }

    private static CITRate getRange(int income) {
        // values : enum 상수의 배열화
        return Arrays.stream(values()).filter(citRate -> citRate
                .isInRange(income)).findFirst().get();
    }

    // 구간을 확인하는 메서드
    private boolean isInRange(int income) {
        if (this == HIGHEST) {
            return income > minValue;
        }
        return (income > minValue) && (income <= maxValue);
    }

    public double getTaxRate() {
        return taxRate;
    }

    public int getPd() {
        return pd;
    }
}
