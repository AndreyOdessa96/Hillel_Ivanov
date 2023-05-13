package dz4;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(60, 6);
        double distanceOdessaKriveOzero = 178;
        double distanceKriveOzeroZhashkiv = 147;
        double distanceZhashkivKyiv = 150;
        double fuelPrice = 44.50;

        double fuelNeededOdessaKriveOzero = car.fuelDelta(distanceOdessaKriveOzero);
        double fuelNeededKriveOzeroZhashkiv = car.fuelDelta(distanceKriveOzeroZhashkiv);
        double fuelNeededZhashkivKyiv = car.fuelDelta(distanceZhashkivKyiv);

        System.out.println("Для подорожі з Одеси до Кривого Озера необхідно долити " + fuelNeededOdessaKriveOzero + " літрів палива.");
        car.fillTank();


        System.out.println("Для подорожі з Кривого Озера до Жашкова необхідно долити " + fuelNeededKriveOzeroZhashkiv + " літрів палива.");
        car.fillTank();


        System.out.println("Для подорожі з Жашкова до Києва необхідно долити " + fuelNeededZhashkivKyiv + " літрів палива.");
        car.fillTank();

        double remainingFuel = car.drive(distanceOdessaKriveOzero + distanceKriveOzeroZhashkiv + distanceZhashkivKyiv) - car.fuelConsumption / 100 * (distanceOdessaKriveOzero + distanceKriveOzeroZhashkiv + distanceZhashkivKyiv);
        System.out.println("Прибувши до Києва залишиться " + remainingFuel + " літрів палива.");

        double fuelCost = (fuelNeededOdessaKriveOzero + fuelNeededKriveOzeroZhashkiv + fuelNeededZhashkivKyiv) * fuelPrice;
        System.out.println("Загальна вартість поїздки: " + fuelCost + "грн");
    }
}