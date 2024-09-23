package lab1.problemtwo;

public class TestComputerComponent {
    public static void main(String[] args) {
        ComputerComponent component1 = new ComputerComponent("Intel", ComponentType.RAM);
        ComputerComponent component2 = new ComputerComponent("AMD", ComponentType.STORAGE, 2023);

        System.out.println("Component 1:");
        System.out.println("Manufacturer: " + component1.getManufacturer());
        System.out.println("ID: " + component1.getId());
        System.out.println("Year Manufactured: " + component1.getYearManufactured());
        System.out.println("Component Type: " + component1.getComponentType());
        System.out.println("Warranty Years: " + ComputerComponent.WARRANTY_YEARS);

        System.out.println("\nComponent 2:");
        System.out.println("Manufacturer: " + component2.getManufacturer());
        System.out.println("ID: " + component2.getId());
        System.out.println("Year Manufactured: " + component2.getYearManufactured());
        System.out.println("Component Type: " + component2.getComponentType());
        System.out.println("Warranty Years: " + ComputerComponent.WARRANTY_YEARS);
    }
}
