public class IceCream {
    private String flavour;
    private int scoops;
    public String getFlavour() {
        return flavour;
    }
    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }
    public int getScoops() {
        return scoops;
    }
    public void setScoops(int scoops) {
        this.scoops = scoops;
    }

    public String toString() {
        return "Icecream flavour = " + flavour + ", number of scoops = " + scoops;
    }
    public IceCream(String flavour, int scoops) {
        this.flavour = flavour;
        this.scoops = scoops;
    }
    public IceCream(int scoops) {
        this.scoops = scoops;
        this.flavour = "Chocolate";
    }
    
}
