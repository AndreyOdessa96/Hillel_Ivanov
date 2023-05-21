package dz6;

import java.util.List;

interface SubscriberService {
    List<Subscriber> getSubscribersWithCityCallDurationExceeding(int duration);
    List<Subscriber> getSubscribersWithInterCityCallUsage();
    List<Subscriber> getSubscribersWithLastNameStartingWith(char letter);
    double getTotalInternetTrafficForCity(String city);
    int getNumberOfSubscribersWithNegativeBalance();
}
