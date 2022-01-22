package stores;

import menu.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;


public class StPetersburgCoffeeStore extends CoffeStore implements Biscuits{

    BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

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
    public void additionalGoods() {sellBiscuits();}

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

    @Override
    public void sellBiscuits() {
        System.out.println("Не хотели бы вы немного печенья к вашему кофе? (Да/Нет)");

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