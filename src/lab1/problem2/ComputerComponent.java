package lab1.problemtwo;

public class ComputerComponent {
    public static final int WARRANTY_YEARS = 3;

    private final String manufacturer;
    private final int id;
    private final int yearManufactured;
    private static int componentCounter;
    private final ComponentType componentType;


    {
        id = componentCounter++;
    }

    public ComputerComponent(String manufacturer, ComponentType componentType) {
        this(manufacturer, componentType, 2024);
    }

    public ComputerComponent(String manufacturer, ComponentType componentType, int yearManufactured) {
        this.manufacturer = manufacturer;
        this.componentType = componentType;
        this.yearManufactured = yearManufactured;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getId() {
        return id;
    }

    public int getYearManufactured() {
        return yearManufactured;
    }

    public ComponentType getComponentType() {
        return componentType;
    }
}
