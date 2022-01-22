package stores;

import stores.CoffeStore;
import typeOfCoffee.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class KartalyCoffeeStore extends CoffeStore {

    @Override
    public void setCoffeeStoreName() {
        city = "Карталы";
    }

    @Override
    public void setFailChance() {
        failChance = 50;
    }

    @Override
    public void createCoffeList() {
        listOfCoffee.add(new Coffee("Кофе"));
    }

    @Override
    public void failSituation() {
        numOfSituation = rnd.nextInt(1, 5);

        switch (numOfSituation) {
            case 1: {
                System.out.println("Кажется ваш кофе еще не доставили. Сочувствую");
                break;
            }
            case 2: {
                System.out.println("Тут это... Как бы вам сказать... Ваш кофе был захвачен в плен группой террористов. Приносим свои извенения");
                break;
            }
            case 3: {
                System.out.println("Кажется с кофе облом. Его с голодухи выпил наш официант. Приносим свои извенения");
                break;
            }
            case 4: {
                System.out.println("Упс! Ваш кофе так долго стоял на полке, что обрел разум и убежал. Приносим свои извенения");
                break;
            }
            case 5: {
                System.out.println("Мы тут случайно вместо кофе сделали чай. Надеюсь вы не в обиде. Приятного аппетита!");
                break;
            }
        }
    }

}
