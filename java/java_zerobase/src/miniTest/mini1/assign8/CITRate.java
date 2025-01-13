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
    private final int bracketAmount;
    private final double taxRate;
    private final int pd;

    CITRate(int minValue, int maxValue, int bracketAmount, double taxRate, int pd) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.bracketAmount = bracketAmount;
        this.taxRate = taxRate;
        this.pd = pd;
    }

    public static void calculateTax(int income) {
        CITRate findRate = getRange(income);
        int sumTax = 0;
        int sumBracket = 0;
        int remainder = 0;
        int totalTax = 0;
        for (CITRate citRate : values()) {
            if (citRate.ordinal() < findRate.ordinal()) {
                sumTax += (int) (citRate.bracketAmount * citRate.taxRate);
                sumBracket += citRate.bracketAmount;
                System.out.printf("%10d * %3d%% = %10d", citRate.bracketAmount, (int) (citRate.taxRate * 100), (int)(citRate.bracketAmount * citRate.taxRate));
                System.out.println();
            }
        }
        remainder = income - sumBracket;
        System.out.printf("%10d * %3d%% = %10d", remainder, (int)(findRate.taxRate * 100), (int)(remainder * findRate.taxRate));
        totalTax = (int) (sumTax + (income - sumTax) * findRate.taxRate);

    }

    public static CITRate getRange(int income) {
        // values : enum 상수의 배열화
        return Arrays.stream(values()).filter(citRate -> citRate
                .isInRange(income)).findFirst().get();
    }

    // 구간을 확인하는 메서드
    public boolean isInRange(int income) {
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
