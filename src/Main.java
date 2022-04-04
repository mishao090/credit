public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int monthlyPayment = (int) service.calculate(10000000,   12,  9.99);
        System.out.println("ежемесячный платёж составляет: " + monthlyPayment + " рублей");

        int monthlyPayment12 = (int) service.calculate(10000000,   24,  9.99);
        System.out.println("ежемесячный платёж составляет: " + monthlyPayment12 + " рублей");

        int monthlyPayment36 = (int) service.calculate(10000000,   36,  9.99);
        System.out.println("ежемесячный платёж составляет: " + monthlyPayment36 + " рублей");
    }
}
