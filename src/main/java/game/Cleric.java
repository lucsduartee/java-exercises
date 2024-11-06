package game;

public class Cleric {
    private String magic;

    public String getMagic() {
        return magic;
    }

    public void setMagic(String magic) {
        this.magic = magic;
    }

    public void heal() {
        System.out.println("curando basicamente");
    }

    public void heal(String potion) {
        System.out.println("Curando com poçao +" + potion);
    }
    public void heal(String spell, int potion) {
        System.out.println("curando com feitiço +" + spell + "<->" + "+potion");
    }
}
