package dz10.dz10;

class RunningTrack implements Obstacle {
    private int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    public boolean overcome(Participant participant) {
        return participant.run(length);
    }
}

