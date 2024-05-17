public final class Computer implements Comparable <Computer>{
    private String name;
    private Integer ghz;
    private Integer ram;
    private Integer harddrive;

    public Computer(String name, Integer ghz, int ram, int harddrive) {
        this.name = name;
        this.ghz = ghz;
        this.ram = ram;
        this.harddrive = harddrive;
    }

    public String getName() {
        return name;
    }
    
    public int getGHz() {
        return ghz;
    }

    public int getRam() {
        return ram;
    }
    
    public int getHarddrive() {
        return harddrive;
    }
    
    @Override
    public int compareTo(Computer o) {
        if (o.ram.equals(ram)) {
            return o.harddrive.compareTo(harddrive);
        }
        return o.ram.compareTo(ram);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ghz;
        result = prime * result + ram;
        result = prime * result + harddrive;
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
        Computer other = (Computer) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (ghz != other.ghz)
            return false;
        if (ram != other.ram)
            return false;
        if (harddrive != other.harddrive)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Your computer: " + name + " have a processor speed of " + ghz + "GHz and " + ram +"mb of ram and a harddrive with " + harddrive + "mb";
    }

}