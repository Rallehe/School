package ovningtre;

public class Chordate extends Animals implements ExtraDetails {
    private int tailLength;
    private String sound;
    private int canFly;

    public Chordate(String name, int tailLength, String sound, int canFly) {
        super(name);
        this.tailLength = tailLength;
        this.sound = sound;
        this.canFly = canFly;
    }

    @Override
    public String toString() {
        if (canFly()) {
            return name + ": stage = " + tailLength + sound() + "it can fly";
        } else {
            return name + ": tailLength = " + tailLength +  sound();
        }
    }

    @Override
    public boolean canFly() {
        if (canFly == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean canSwim() {
        return false;
    }

    @Override
    public String sound() {
        return ", sound: " + sound;
    }
}
