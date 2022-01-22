package menu;

public class Coffee {

    private final String name;

    public Coffee(String name) {
        this.name = name;
    }

    public String getName() {return name;}

    @Override
    public String toString() {
        return this.name;
    }
}
