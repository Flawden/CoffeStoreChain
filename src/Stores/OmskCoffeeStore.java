package stores;

import stores.CoffeStore;
import typeOfCoffee.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OmskCoffeeStore extends CoffeStore {

    @Override
    public void setFailChance() {
        failChance = 15;
    }

    @Override
    public void setCoffeeStoreName() {
        city = "Омск";
    }

    @Override
    public void createCoffeList() {
        listOfCoffee.add(new Coffee("Flat white"));
        listOfCoffee.add(new Coffee("Вьетнамский кофе"));
        listOfCoffee.add(new Coffee("Кафе бомбон"));
        listOfCoffee.add(new Coffee("Кофе по-венски "));
        listOfCoffee.add(new Coffee("Меланж"));
        listOfCoffee.add(new Coffee("Мокка"));
        listOfCoffee.add(new Coffee("Фраппе"));
    }

    @Override
    public void failSituation() {
        numOfSituation = rnd.nextInt(1, 2);

        switch (numOfSituation) {
            case 1: {
                System.out.println("Ваш кофе был отравлен за попытку покинуть город Омск.");
                break;
            }
            case 2: {
                System.out.println("Наше кофе было захвачено группой злобных голубей. Нам жаль");
                break;
            }
        }
    }
}