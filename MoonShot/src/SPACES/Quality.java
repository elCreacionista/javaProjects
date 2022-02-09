package SPACES;

public enum Quality {

    GOOD, NICE, REGULAR, MODERATE,
    TOLERABLE, POOR, BAD, INTOLERABLE,
    inst1, inst2;


    public Quality getRandomQuality() {
        double rand = Math.random();
        if (rand < 0.1)
            return Quality.GOOD;
        if (rand < 0.2)
            return Quality.NICE;
        if (rand < 0.3)
            return Quality.REGULAR;
        if (rand < 0.4)
            return Quality.MODERATE;
        if (rand < 0.5)
            return Quality.TOLERABLE;
        if (rand < 0.6)
            return Quality.POOR;
        if (rand < 0.7)
            return Quality.BAD;
        if (rand < 0.8)
            return Quality.INTOLERABLE;
        return getRandomQuality();
    }

    public Quality getQuality(){
        return getRandomQuality();
    }

}
