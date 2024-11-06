package computers;

public class Laptops extends ComputerDevice implements Chargeable {
    private double size;

    public Laptops(String brand, double storageCapacity, double size) {
        super(brand, storageCapacity);

        this.size = size;
    }

    @Override
    public void bootUp() {
        System.out.println("Inicializando com tamanho " + size + "... ");
    }

    @Override
    public void charge() {
        System.out.println("Carregando o laptop...");
    }

    @Override
    public int getBatteryLevel() {
        return 85;
    }
}
