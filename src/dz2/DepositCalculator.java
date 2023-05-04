package dz2;

public class DepositCalculator {
    public static void main(String[] args) {
        double sum = Double.parseDouble(args[0]);
        double percent = Double.parseDouble(args[1]) / 100;
        int years = Integer.parseInt(args[2]);

        double profit = 0;
        double balance = sum;

        for (int i = 1; i <= years; i++) {
            for (int j = 1; j <= 12; j++) {
                profit = balance * (percent / 12);
                balance += profit;
            }
            System.out.printf("Год %d Баланс: %.2f грн, Прибыль: %.2f грн%n", i, balance, balance - sum);
        }
    }
}
