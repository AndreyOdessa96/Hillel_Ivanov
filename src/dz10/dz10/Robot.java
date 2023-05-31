package dz10.dz10;

class Robot implements Participant {
    private int maxRunDistance;
    private int maxJumpHeight;

    public Robot(int maxRunDistance, int maxJumpHeight) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public boolean run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Robot runs " + distance + " meters");
            return true;
        } else {
            System.out.println("Robot fails to run " + distance + " meters");
            return false;
        }
    }

    public boolean jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println("Robot jumps " + height + " meters high");
            return true;
        } else {
            System.out.println("Robot fails to jump " + height + " meters high");
            return false;
        }
    }
}
