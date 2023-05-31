package dz10.dz10;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = new Participant[3];
        participants[0] = new Human(1000, 2);
        participants[1] = new Cat(500, 3);
        participants[2] = new Robot(2000, 1);

        Obstacle[] obstacles = new Obstacle[2];
        obstacles[0] = new RunningTrack(1000);
        obstacles[1] = new Wall(2);

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.overcome(participant)) break;
            }
        }
    }
}
