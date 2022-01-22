package stores;

import stores.CoffeStore;
import typeOfCoffee.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class StPetersburgCoffeeStore extends CoffeStore {

    @Override
    public void setFailChance() {
        failChance = 3;
    }

    @Override
    public void setCoffeeStoreName() {
        city = "Санкт-Петербург";
    }

    @Override
    public void createCoffeList() {
        listOfCoffee.add(new Coffee("Cappuccino"));
        listOfCoffee.add(new Coffee("Macchiato "));
        listOfCoffee.add(new Coffee("Caffellatte"));
        listOfCoffee.add(new Coffee("Flat white"));
        listOfCoffee.add(new Coffee("Сà phê sữa đá"));
        listOfCoffee.add(new Coffee("Café bombón"));
        listOfCoffee.add(new Coffee("Wiener Espresso"));
        listOfCoffee.add(new Coffee("Wiener Melange"));
        listOfCoffee.add(new Coffee("Сaffè mocha"));
        listOfCoffee.add(new Coffee("Frappé"));
    }

    @Override
    public void failSituation() {
        numOfSituation = rnd.nextInt(1, 2);

        switch (numOfSituation) {
            case 1: {
                System.out.println("Кажется ваш кофе еще не доставили. Приносим свои извенения");
                break;
            }
            case 2: {
                System.out.println("Кажется ваш кофе оказался чаем. Приносим свои извенения");
                break;
            }
        }
    }
}