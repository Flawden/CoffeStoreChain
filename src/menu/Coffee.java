package menu;

import java.io.Serializable;

public class Coffee implements Serializable {

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
