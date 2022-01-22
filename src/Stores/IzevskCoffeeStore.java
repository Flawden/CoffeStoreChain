package stores;

import stores.CoffeStore;
import typeOfCoffee.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IzevskCoffeeStore extends CoffeStore {

    @Override
    public void setCoffeeStoreName() {
        city = "Ижевск";
    }

    @Override
    public void setFailChance() {
        failChance = 20;
    }

    @Override
    public void createCoffeList() {
        listOfCoffee.add(new Coffee("Капучино"));
        listOfCoffee.add(new Coffee("Макиато"));
        listOfCoffee.add(new Coffee("Латте"));
    }

    @Override
    public void failSituation() {
        numOfSituation = rnd.nextInt(1, 2);

        switch (numOfSituation) {
            case 1: {
                System.out.println("Кажется ваш кофе еще не доставили. Мне жаль");
                break;
            }
            case 2: {
                System.out.println("Ваш кофе был похищен злостной группой боевых ежей. Мне жаль");
                break;
            }
        }
    }
}
