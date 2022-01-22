package stores;

import menu.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class ChelyabinskCoffeeStore extends CoffeStore implements Biscuits{

    BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

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
    public void additionalGoods() {
        sellBiscuits();
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