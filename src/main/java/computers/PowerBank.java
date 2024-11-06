package computers;

public class PowerBank implements Chargeable {
    @Override
    public void charge() {
        System.out.println("carregando o powerbank...");
    }

    @Override
    public int getBatteryLevel() {
        return 89;
    }
}
