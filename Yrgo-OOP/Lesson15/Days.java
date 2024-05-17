public enum Days {
    MÅN, TIS, ONS, TORS, FRE, LÖR, SÖN;

    @Override
    public String toString() {
<<<<<<< HEAD
        switch() {

            case MÅN:

            case TIS:

            case ONS:

            case TORS:

            case FRE:

            case LÖR:

            case SÖN:

        }
    }
}
=======
        switch (this) {
            case MÅN:
                return "Måndag";
            case TIS:
                return "Tisdag";
            case ONS:
                return "Onsdag";
            case TORS:
                return "Torsdag";
            case FRE:
                return "Fredag";
            case LÖR:
                return "Lördag";
            case SÖN:
                return "Söndag";
        }
        return null;
    }
}
>>>>>>> 0c83e9823f07548ebf6fec36ec1449c2bae361e7
