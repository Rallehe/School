import java.util.Map;

public class IceCream {

    private Container container;
    private Map <Container, Integer> myIceCream;

    public IceCream(IceCream.Container container) {
        this.container = container;
    }

    public enum IceCreamScoop {
        VANILJ, CHOKLAD, JORDGUBB, PÄRON;

        @Override
        public String toString() {
            switch (this) {
                case VANILJ:
                    return "vanlij";

                case CHOKLAD:
                    return "choklad";

                case JORDGUBB:
                    return "jordgubb";

                case PÄRON:
                    return "päron";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum Container {
        RÅN, BÄGARE;

        @Override
        public String toString() {
            switch (this) {
                case RÅN:
                    return "rån";

                case BÄGARE:
                    return "bägare";
            }
            throw new IllegalArgumentException();
        }
    }
    public static void addScoop (IceCreamScoop scoop) {
        
    }
}
