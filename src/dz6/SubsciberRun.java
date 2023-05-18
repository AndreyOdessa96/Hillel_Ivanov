package dz6;

public class SubsciberRun {
    public static void main(String[] args) {
        Subscriber[] subscribers = SubscriberGen.generateSubArray();
        for (Subscriber s : subscribers){
            System.out.println(s);
        }
    }
}
