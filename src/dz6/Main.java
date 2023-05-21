package dz6;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Subscriber> subscribers = new ArrayList<>();
        subscribers.add(new Subscriber(1, "Andrey", "Ivanov", "Odessa", "0680639520", 54657, 100.0, 40, 10, 5.0));
        subscribers.add(new Subscriber(2, "Oleg", "Boyko", "Kiev", "0973562250", 67890, -50.0, 30, 5, 7.5));
        subscribers.add(new Subscriber(3, "Masha", "Levin", "Lviv", "0683565472", 13579, 200.0, 120, 20, 10.0));
        subscribers.add(new Subscriber(4, "Irina", "Luchkina", "New York", "070657895", 12345, 100.0, 10, 10, 15.0));
        subscribers.add(new Subscriber(5, "Olga", "Shevchenko", "Burgas", "0982263955", 15345, 150.0, 50, 10, 3.0));
        subscribers.add(new Subscriber(6, "Alena", "Ivanov", "Kharkiv", "0678216574", 17345, 174.0, 7, 10, 6.0));
        subscribers.add(new Subscriber(7, "Igor", "Intorov", "Odessa", "0680683560", 54657, 153.0, 60, 10, 5.0));
        subscribers.add(new Subscriber(8, "Anna", "Kolodkin", "New York", "0980983655", 12345, 100.85, 160, 10, 15.0));
        subscribers.add(new Subscriber(9, "Andrey", "Boyko", "Lviv", "0758946575", 13579, -170.0, 12, 10, 10.0));
        subscribers.add(new Subscriber(10, "Masha", "Ivoron", "New York", "0685239475", 12345, 100.0, 165, 10, 15.0));

        SubscriberService service = new SubscriberServiceImpl(subscribers);

        List<Subscriber> cityCallDurationExceeding = service.getSubscribersWithCityCallDurationExceeding(60);
        System.out.println("Абоненты с продолжительностью городского звонка более 60 минут: ");
        cityCallDurationExceeding.forEach(System.out::println);

        List<Subscriber> interCityCallUsage = service.getSubscribersWithInterCityCallUsage();
        System.out.println("Абоненты с использованием междугородной связи: ");
        interCityCallUsage.forEach(System.out::println);

        List<Subscriber> lastNameStartingWithS = service.getSubscribersWithLastNameStartingWith('I');
        System.out.println("Подписчики с менем начинающейся с 'I'");
        lastNameStartingWithS.forEach(System.out::println);

        double totalInternetTraffic = service.getTotalInternetTrafficForCity("Odessa");
        System.out.println("Общий трафик: " + totalInternetTraffic + " gb");

        int numberOfSubscribersWithNegativeBalance = service.getNumberOfSubscribersWithNegativeBalance();
        System.out.println("Количество подписчиков с отрицательным балансом: " + numberOfSubscribersWithNegativeBalance);
    }
}