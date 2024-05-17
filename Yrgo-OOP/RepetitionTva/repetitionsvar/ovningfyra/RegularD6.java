package repetitionsvar.ovningfyra;

import java.util.concurrent.ThreadLocalRandom;

public class RegularD6 implements GameDie{

    public int roll() {
        int die = ThreadLocalRandom.current().nextInt(6) + 1;
        return die;
    }

    @Override
    public String getDescription() {
        return "en sexsidig tärning";
    }

}
