package Stores;

import TypeOfCoffee.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ChelyabinskCoffeeStore extends CoffeStore {

    @Override
    public void makeAmericano(Coffee americano) {
        super.makeAmericano(americano);
        System.out.println(americano.getName() + " готов к выдаче. Приятного аппетита! \n" +
                "А про лицо я пошутил. Я же на работе.");
    }

    @Override
    public void makeCapuccino(Coffee capuccino) {
        super.makeCapuccino(capuccino);
        System.out.println(capuccino.getName() + " готов к выдаче. Приятного аппетита! \n" +
                "Берегите себя!");
    }

    @Override
    public void makeExpresso(Coffee expresso) {
        super.makeAmericano(expresso);
        System.out.println(expresso.getName() + " готов к выдаче. Приятного аппетита! \n" +
                "Берегите себя!");
    }

    @Override
    public void makeLatte(Coffee latte) {
        super.makeAmericano(latte);
        System.out.println(latte.getName() + " готов к выдаче. Приятного аппетита! \n" +
                "Берегите себя!");
    }

    public static void selectCoffee(CoffeStore coffeStore) {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int coffeeNum = 0;

        System.out.println("\nЗдравстрвуйте, вы в Челябинске.  " +
                "Кофе будете? Выбирайте: \n" +
                "1. Американо \n" +
                "2. Капучино \n" +
                "3. Латто \n \n" +
                "Введите номер вашего заказа:");

        try {
            coffeeNum = Integer.parseInt(rd.readLine());
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        switch(coffeeNum) {
            case 1:
                System.out.println("Принял, ожидайте...");
                Americano americano = new Americano();
                coffeStore.makeAmericano(americano);
                break;

            case 2:
                System.out.println("Принял, ожидайте...");
                Cappuccino cappuccino = new Cappuccino();
                coffeStore.makeCapuccino(cappuccino);
                break;

            case 3:
                System.out.println("Принял, ожидайте...");
                Latte latte = new Latte();
                coffeStore.makeLatte(latte);
                break;

            default:
                break;
        }
    }

}
