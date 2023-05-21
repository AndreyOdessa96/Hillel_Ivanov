package dz6;

import java.util.ArrayList;
import java.util.List;

class SubscriberServiceImpl implements SubscriberService {
    private final List<Subscriber> subscribers;

    public SubscriberServiceImpl(List<Subscriber> subscribers) {
        this.subscribers = subscribers;
    }

    @Override
    public List<Subscriber> getSubscribersWithCityCallDurationExceeding(int duration) {
        List<Subscriber> result = new ArrayList<>();
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getCityCallDuration() > duration) {
                result.add(subscriber);
            }
        }
        return result;
    }

    @Override
    public List<Subscriber> getSubscribersWithInterCityCallUsage() {
        List<Subscriber> result = new ArrayList<>();
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getInterCityCallDuration() > 0) {
                result.add(subscriber);
            }
        }
        return result;
    }

    @Override
    public List<Subscriber> getSubscribersWithLastNameStartingWith(char letter) {
        List<Subscriber> result = new ArrayList<>();
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getLastName().charAt(0) == letter) {
                result.add(subscriber);
            }
        }
        return result;
    }

    @Override
    public double getTotalInternetTrafficForCity(String city) {
        double totalInternetTraffic = 0;
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getCity().equals(city)) {
                totalInternetTraffic += subscriber.getInternetTraffic();
            }
        }
        return totalInternetTraffic;
    }

    @Override
    public int getNumberOfSubscribersWithNegativeBalance() {
        int count = 0;
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getBalance() < 0) {
                count++;
            }
        }
        return count;
    }
}