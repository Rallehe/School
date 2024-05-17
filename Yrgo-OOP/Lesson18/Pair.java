public class Pair <E extends Comparable<E>> implements Comparable<Pair<E>>{
    private E val1;
    private E val2;

    public Pair(E val1, E val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public E getVal1() {
        return val1;
    }

    public E getVal2() {
        return val2;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((val1 == null) ? 0 : val1.hashCode());
        result = prime * result + ((val2 == null) ? 0 : val2.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pair<?> other = (Pair<?>) obj;
        if (val1 == null) {
            if (other.val1 != null)
                return false;
        } else if (!val1.equals(other.val1))
            return false;
        if (val2 == null) {
            if (other.val2 != null)
                return false;
        } else if (!val2.equals(other.val2))
            return false;
        return true;
    }

    @Override
    public int compareTo(Pair<E> o) {
        int res = val1.compareTo(o.getVal1());
        if(res == 0) {
            return val2.compareTo(o.val2);
        }
        return res;
    }

    @Override
    public String toString() {
        return "Pair [val1=" + val1 + ", val2=" + val2 + "]";
    }
    
}
