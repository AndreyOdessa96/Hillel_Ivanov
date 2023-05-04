package dz2;

//2 и более чисел
public class Average {
    public static void main(String[] args) {
        double sum = 0;

        for (String arg : args) {
            sum += Double.parseDouble(arg);
        }

        double average = sum / args.length;

        System.out.println("Среднее арифметическое: " + average);
    }
}

