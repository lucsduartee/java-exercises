package computers;

// A classe FinalClass não pode ser herdada
public final class FinalClass {
    // o valor de MAX_STORAGE_CAPACITY não pode ser alterado
    public static final double MAX_STORAGE_CAPACITY = 2048.0;

    public final void log() {
        System.out.println("método nao pode ser polimorfado");
    }
}
