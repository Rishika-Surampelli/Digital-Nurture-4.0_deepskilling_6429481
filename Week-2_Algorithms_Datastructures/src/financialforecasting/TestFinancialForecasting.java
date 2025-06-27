package financialforecasting;

public class TestFinancialForecasting {
    public static void main(String[] args) {
        double currentValue = 10000.0;
        double growthRate = 0.08; // 8% growth rate
        int years = 5;

        System.out.println("-- Recursive Forecasting --");
        double predictedRecursive = ForecastingTool.predictValue(currentValue, growthRate, years);
        System.out.printf("Predicted value after %d years: ₹%.2f\n", years, predictedRecursive);

        System.out.println("\n-- Iterative Forecasting --");
        double predictedIterative = ForecastingTool.predictValueIterative(currentValue, growthRate, years);
        System.out.printf("Predicted value after %d years: ₹%.2f\n", years, predictedIterative);
    }
}
