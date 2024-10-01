package lab1.problem3;

public class Temperature {
    private double temperature;
    private char scale;

    public Temperature() {
        this.temperature = 0.0;
        this.scale = 'C';
    }

    public Temperature(double temperature) {
        this.temperature = temperature;
        this.scale = 'C';
    }

    public Temperature(char scale) {
        this.temperature = 0.0;
        this.scale = scale;
    }

    public Temperature(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = scale;
    }

    public double getCelsius() {
        if (scale == 'C') {
            return temperature;
        } else {
            return (5.0 / 9) * (temperature - 32);
        }
    }

    public double getFahrenheit() {
        if (scale == 'F') {
            return temperature;
        } else {
            return (9.0 / 5) * temperature + 32;
        }
    }

    public char getScale() {
        return scale;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setBoth(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = scale;
    }

    public String toString() {
        return temperature + "°" + scale;
    }
}
