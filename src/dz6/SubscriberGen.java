package dz6;

public class SubscriberGen {
    public static Subscriber[] generateSubArray() {
        Subscriber[] array = Subscriber[10];
        array[0] = new Subscriber(1, "Andrey", "Ivanov", "Odessa", "0680679520",
                54612, 100.0, 55, 20, 10.0);
        array[1] = new Subscriber(1, "Olga", "Petrova", "Kyiv", "0685679535",
                54631, 130.0, 50, 25, 10.0);
        array[2] = new Subscriber(1, "Masha", "Ivanov", "Kyiv", "0466795445",
                54651, 185.5, 50, 25, 10.0);
        array[3] = new Subscriber(1, "Masha", "Borsh", "Lviv", "0685679512",
                54651, 250.0, 60, 30, 10.0);
        array[4] = new Subscriber(1, "Alexandr", "Volkov", "Lviv", "0860679687",
                54431, 200.0, 60, 30, 10.0);
        array[5] = new Subscriber(1, "Stepan", "Stalin", "Odessa", "0612319524",
                54641, 100.0, 55, 20, 10.0);
        array[6] = new Subscriber(1, "Igor", "Levin", "Lviv", "0612379520",
                54531, 100.0, 60, 30, 10.0);
        array[7] = new Subscriber(1, "Andrey", "Ivanov", "Kharkiv", "060549518",
                54651, 350.0, 40, 35, 10.0);
        array[8] = new Subscriber(1, "Anton", "Petrov", "Odessa", "0645679520",
                54541, 150.6, 55, 20, 10.0);
        array[9] = new Subscriber(1, "Oleg", "Sidorov", "Kharkiv", "0645679520",
                54641, 200.0, 40, 35, 10.0);

        return array;
    }
}
