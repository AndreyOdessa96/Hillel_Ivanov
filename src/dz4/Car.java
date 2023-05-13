package dz4;

public class Car {
    public final double tankVolume;
    public final double fuelConsumption;
    private double tankLevel;

    public Car(double tankVolume, double fuelConsumption) {
        this.tankVolume = tankVolume;
        this.fuelConsumption = fuelConsumption;
    }

    public double fillTank() {
        double result = tankVolume - tankLevel;
        tankLevel = tankVolume;
        return result;
    }

    public double drive(double n) {
        double spentFuel = fuelConsumption / 100 * n;
        tankLevel -= spentFuel;
        return tankLevel;
    }

    public double fuelDelta(double n) {
        double requiredFuel = fuelConsumption / 100 * n;
        return requiredFuel - tankLevel;
    }

    public double getTankLevel() {
        return tankLevel;
    }
}
