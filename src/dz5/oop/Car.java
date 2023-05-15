package dz5.oop;

public class Car {
        public void start() {
            startElectricity();
            startCommand();
            startFuelSystem();
        }

        private void startElectricity() {
            System.out.println("Запуск электричества");

        }

        private void startCommand() {
            System.out.println("Запуск команды");

        }

        private void startFuelSystem() {
            System.out.println("Запуск топлива");

        }
    }

