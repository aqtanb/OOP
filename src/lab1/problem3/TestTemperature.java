package lab1.problem3;

public class TestTemperature {
    public static void main(String[] args) {
        Temperature temp1 = new Temperature();
        System.out.println("Temperature in Celsius: " + temp1.getCelsius());
        System.out.println("Temperature in Fahrenheit: " + temp1.getFahrenheit());
        System.out.println("Scale: " + temp1.getScale());
        System.out.println();

        Temperature temp2 = new Temperature(100);
        System.out.println("Temperature in Celsius: " + temp2.getCelsius());
        System.out.println("Temperature in Fahrenheit: " + temp2.getFahrenheit());
        System.out.println("Scale: " + temp2.getScale());
        System.out.println();

        Temperature temp3 = new Temperature('F');
        System.out.println("Temperature in Celsius: " + temp3.getCelsius());
        System.out.println("Temperature in Fahrenheit: " + temp3.getFahrenheit());
        System.out.println("Scale: " + temp3.getScale());
        System.out.println();

        Temperature temp4 = new Temperature(100, 'F');
        System.out.println("Temperature in Celsius: " + temp4.getCelsius());
        System.out.println("Temperature in Fahrenheit: " + temp4.getFahrenheit());
        System.out.println("Scale: " + temp4.getScale());
        System.out.println();

        temp4.setTemperature(0);
        System.out.println("Temperature in Celsius: " + temp4.getCelsius());
        System.out.println("Temperature in Fahrenheit: " + temp4.getFahrenheit());
        System.out.println("Scale: " + temp4.getScale());
        System.out.println();

        temp4.setScale('C');
        System.out.println("Temperature in Celsius: " + temp4.getCelsius());
        System.out.println("Temperature in Fahrenheit: " + temp4.getFahrenheit());
        System.out.println("Scale: " + temp4.getScale());
        System.out.println();

        temp4.setBoth(100, 'C');
        System.out.println("Temperature in Celsius: " + temp4.getCelsius());
        System.out.println("Temperature in Fahrenheit: " + temp4.getFahrenheit());
        System.out.println("Scale: " + temp4.getScale());
    }
}
