public class IceCreamScoop {
    private String flavor;
    private float size;

    public IceCreamScoop(String flavor, float size) {
        this.flavor = flavor;
        this.size = size;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((flavor == null) ? 0 : flavor.hashCode());
        result = prime * result + Float.floatToIntBits(size);
        return result;
    }

    @Override //TODO: Check if it works as intended
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        IceCreamScoop other = (IceCreamScoop) obj;
        if (flavor == null) {
            if (other.flavor != null)
                return false;
        } else if (!flavor.equals(other.flavor))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "IceCreamScoop [flavor=" + flavor + ", size=" + size + "]";
    }
}
