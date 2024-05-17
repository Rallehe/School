package ovningtre;

public class Arthropod extends Animals implements ExtraDetails{
    private String stage;
    private String sound;
    private int canFly;

    public Arthropod(String name, String stage, String sound, int canFly) {
    super(name);
    this.stage = stage;
    this.sound = sound;
    this.canFly = canFly;
    }

    @Override
    public String toString() {
        if (canFly()) {
            return name + ": stage = " + stage + sound() + ", it can fly";
        } else {
            return name + ": stage = " + stage + sound();
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
