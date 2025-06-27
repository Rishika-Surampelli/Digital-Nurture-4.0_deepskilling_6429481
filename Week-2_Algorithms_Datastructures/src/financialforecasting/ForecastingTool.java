package financialforecasting;

public class ForecastingTool {

    // Recursive method to predict future value
    public static double predictValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return predictValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    // Optimized version using loop (optional comparison)
    public static double predictValueIterative(double currentValue, double growthRate, int years) {
        for (int i = 0; i < years; i++) {
            currentValue *= (1 + growthRate);
        }
        return currentValue;
    }
}
