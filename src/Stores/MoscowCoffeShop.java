package stores;

import menu.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class MoscowCoffeShop extends CoffeStore implements Biscuits{

    BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public void setFailChance() {
        failChance = 5;
    }

    @Override
    public void setCoffeeStoreName() {
        city = "Москва";
    }

    @Override
    public void createCoffeList() {
        listOfCoffee.add(new Coffee("Капучино"));
        listOfCoffee.add(new Coffee("Макиато"));
        listOfCoffee.add(new Coffee("Латте"));
        listOfCoffee.add(new Coffee("Flat white"));
        listOfCoffee.add(new Coffee("Вьетнамский кофе"));
        listOfCoffee.add(new Coffee("Кафе бомбон"));
        listOfCoffee.add(new Coffee("Кофе по-венски"));
        listOfCoffee.add(new Coffee("Меланж"));
        listOfCoffee.add(new Coffee("Мокка"));
        listOfCoffee.add(new Coffee("Фраппе"));
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
                System.out.println("Кажется ваш кофе еще не доставили. Нам очень жаль");
                break;
            }
            case 2: {
                System.out.println("Приносим извенения, наш уставший программист выпил весь кофе");
                break;
            }
            case 3: {
                System.out.println("Приносим извенения, но наш магазин закрылся на карантин");
                break;
            }
        }
    }

    @Override
    public void sellBiscuits() {
        System.out.println("Не желаете немного печенья? (Да/Нет)");

        try {
            String answer = rd.readLine().toLowerCase();
            if (answer.equals("да")) {
                System.out.println("Вот ваше печенье");
            }
            else if(answer.equals("нет")) {
                System.out.println("Ну на нет и суда нет.");
            }
            else {
                System.out.println("Я так понимаю это нет...Ладно");
            }

        } catch (IOException e) {
            System.out.println("Ошибка ввода");
        }
    }
}
