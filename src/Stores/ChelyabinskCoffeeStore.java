package stores;

import typeOfCoffee.*;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ChelyabinskCoffeeStore extends CoffeStore {


    @Override
    public void setCoffeeStoreName() {
        city = "Челябинск";
    }

    @Override
    public void setFailChance() {
        failChance = 10;
    }

    @Override
    public void createCoffeList() {
        listOfCoffee.add(new Coffee("Капучино"));
        listOfCoffee.add(new Coffee("Макиато"));
        listOfCoffee.add(new Coffee("Латте"));
        listOfCoffee.add(new Coffee("Flat white"));
        listOfCoffee.add(new Coffee("Вьетнамский кофе"));
    }

    @Override
    public void failSituation() {
        numOfSituation = rnd.nextInt(1, 3);

        switch (numOfSituation) {
            case 1: {
                System.out.println("Кажется ваш кофе еще не доставили. Приносим свои извинения");
                break;
            }
            case 2: {
                System.out.println("Прошу прощения, но вашего напитка не оказалось в наличии");
                break;
            }
            case 3: {
                System.out.println("Кажется ваш официант убежал с вашими деньгами.");
                break;
            }
        }
    }
}