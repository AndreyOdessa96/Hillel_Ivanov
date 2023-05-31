package dz10.dz10;

class Human implements Participant {
    private int maxRunDistance;
    private int maxJumpHeight;

    public Human(int maxRunDistance, int maxJumpHeight) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }
    public boolean run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Human runs " + distance + " meters");
            return true;
        } else {
            System.out.println("Human fails to run " + distance + " meters");
            return false;
        }
    }
    public boolean jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println("Human jumps " + height + " meters high");
            return true;
        } else {
            System.out.println("Human fails to jump " + height + " meters high");
            return false;
        }
    }
}
