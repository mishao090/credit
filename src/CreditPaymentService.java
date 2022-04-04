public class CreditPaymentService {

    double loanAmount;
    int month;
    double yearPercent;

    public double calculate(double loanAmount, int month, double yearPercent) {
        double monthlyPercentage = yearPercent / 100 / 12;
        return loanAmount * (monthlyPercentage + monthlyPercentage / (Math.pow(1 + monthlyPercentage, month) - 1));
    }

}
