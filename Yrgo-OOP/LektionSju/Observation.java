public class Observation {
    private int id = 8645;
    private int hour, min;
    private double temp, windspeed, winddir, degrees;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id += 1;
    }
    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public int getMin() {
        return min;
    }
    public void setMin(int min) {
        this.min = min;
    }
    public double getTemp() {
        return temp;
    }
    public void setTemp(double temp) {
        this.temp = temp;
    }
    public double getWindspeed() {
        return windspeed;
    }
    public void setWindspeed(double windspeed) {
        this.windspeed = windspeed;
    }
    public double getWinddir() {
        return winddir;
    }
    public void setWinddir(double winddir) {
        this.winddir = winddir;
    }
    public double getDegrees() {
        return degrees;
    }
    public void setDegrees(double degrees) {
        this.degrees = degrees;
    }
    public String degreesToString() {
        if (degrees >= 348.75 && degrees <= 360 || degrees <= 11.25 && degrees >= 0) {
            return "norr";
        } else if (degrees >= 11.26 && degrees <= 33.74) {
            return "nord nord öst";
        } else if (degrees >= 33.75 && degrees <= 56.25) {
            return "nord öst";
        } else if (degrees >= 56.26 && degrees <=  78.74) {
            return "öst nord öst";
        } else if (degrees >= 78.75 && degrees <= 101.25) {
            return "öst";
        } else if (degrees >= 101.26 && degrees <= 123.74) {
            return "öst syd öst";
        } else if (degrees >= 123.25 && degrees <= 146.25) {
            return "syd öst";
        } else if (degrees >= 146.26 && degrees <= 168.74) {
            return "syd syd öst";
        } else if (degrees >= 168.75 && degrees <= 191.25) {
            return "syd";
        } else if (degrees >= 191.26 && degrees <= 213.74) {
            return "syd syd väst";
        } else if (degrees >= 213.75 && degrees <= 236.25) {
            return "syd väst";
        } else if (degrees >= 236.26 && degrees <= 258.74) {
            return "väst syd väst";
        } else if (degrees >= 258.75 && degrees <= 281.25) {
            return "väst";
        } else if (degrees >= 281.26 && degrees <= 303.74) {
            return "väst nord väst";
        } else if (degrees >= 303.75 && degrees <= 326.25) {
            return "nord väst";
        } else if (degrees >= 326.26 && degrees <= 348.74) {
            return "nord nord väst";
        } else {
            return "invalid direction";
        }
    }
    
}