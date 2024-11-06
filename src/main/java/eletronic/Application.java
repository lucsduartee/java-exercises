package eletronic;

public class Application {
    public static void main(String[] args) {
        Television television = new Television("miau", "de tubo", 5);

        television.turnOn();
        television.turnOff();

        System.out.println("A televisão está ligada?");
        System.out.println(television);
    }
}
