package dz10.dz10;

class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public boolean overcome(Participant participant) {
        return participant.jump(height);
    }
}