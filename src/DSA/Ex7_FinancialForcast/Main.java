package DSA.Ex7_FinancialForcast;

public class Main {

    public static void main(String args[]) {
        double presentValue = 64000;
        double growthRate = 0.20;
        int years = 5;
        double result = Forecast.futureValue(presentValue, growthRate, years);

        System.out.println("Present Value : " + presentValue);
        System.out.println("Growth Rate   : " + (growthRate * 100) + "%");
        System.out.println("Years         : " + years);
        System.out.println("Future Value  : " + result);
    }
}
