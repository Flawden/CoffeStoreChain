package stores;

import menu.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class OmskCoffeeStore extends CoffeStore implements Biscuits {

    BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

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
    public void additionalGoods() {sellBiscuits();}

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

    @Override
    public void sellBiscuits() {
        System.out.println("Не желаете немного печенья? (Да/Нет)");

        try {
            String answer = rd.readLine();
            if (answer.toLowerCase(Locale.ROOT) == "да") {
                System.out.println("Вот ваше печенье");
            } else if(answer.toLowerCase(Locale.ROOT) == "нет") {
                System.out.println("Ну на нет и суда нет.");
            } else {
                System.out.println("Я так понимаю это нет...Ладно");
            }

        } catch (IOException e) {
            System.out.println("Ошибка ввода");
        }
    }
}