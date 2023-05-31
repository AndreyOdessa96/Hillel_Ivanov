package dz10.dz10;

class Cat implements Participant {
    private int maxRunDistance;
    private int maxJumpHeight;

    public Cat(int maxRunDistance, int maxJumpHeight) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public boolean run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Cat runs " + distance + " meters");
            return true;
        } else {
            System.out.println("Cat fails to run " + distance + " meters");
            return false;
        }
    }

    public boolean jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println("Cat jumps " + height + " meters high");
            return true;
        } else {
            System.out.println("Cat fails to jump " + height + " meters high");
            return false;
        }
    }
}
