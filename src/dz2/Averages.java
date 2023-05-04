package dz2;
// для двух чисел
public class Averages {
    public static class Main {
        public static void main(String[] args) {

            double sum1 = Double.parseDouble(args[0]);
            double sum2 = Double.parseDouble(args[1]);

            double average = (sum1 + sum2) / 2;

            System.out.println("Среднее арифметическое: " + average);
        }
    }
}
