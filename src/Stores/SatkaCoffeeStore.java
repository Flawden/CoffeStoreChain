package Stores;

import Stores.CoffeStore;
import TypeOfCoffee.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SatkaCoffeeStore extends CoffeStore {

    @Override
    public void makeAmericano(Coffee americano) {
        super.makeAmericano(americano);
        System.out.println(americano.getName() + " готов к выдаче в кофе Сатки. Приятного аппетита!");
    }

    @Override
    public void makeCapuccino(Coffee capuccino) {
        super.makeCapuccino(capuccino);
        System.out.println(capuccino.getName() + " готов к выдаче в кофе Сатки. Приятного аппетита!");
    }

    @Override
    public void makeExpresso(Coffee expresso) {
        super.makeAmericano(expresso);
        System.out.println(expresso.getName() + " готов к выдаче в кофе Сатки. Приятного аппетита!");
    }

    @Override
    public void makeLatte(Coffee latte) {
        super.makeAmericano(latte);
        System.out.println(latte.getName() + " готов к выдаче в кофе Сатки. Приятного аппетита!");
    }

    public static void selectCoffee(CoffeStore coffeStore) {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        Coffee coffeType;
        int coffeeNum = 0;

        System.out.println("\nДобро пожаловать наше кофе. Мы умеем готовить следующие напитки: \n" +
                "1. Американо \n" +
                "2. Капучино \n" +
                "3. Эспрессо \n" +
                "4. Латто \n \n" +
                "Введите номер вашего заказа:");

        try {
            coffeeNum = Integer.parseInt(rd.readLine());
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        switch(coffeeNum) {
            case 1:
                System.out.println("Ваш заказ принят, ожидайте...");
                Americano americano = new Americano();
                coffeStore.makeAmericano(americano);
                break;

            case 2:
                System.out.println("Ваш заказ принят, ожидайте...");
                Cappuccino cappuccino = new Cappuccino();
                coffeStore.makeCapuccino(cappuccino);
                break;

            case 3:
                System.out.println("Ваш заказ принят, ожидайте...");
                Expresso expresso = new Expresso();
                coffeStore.makeExpresso(expresso);
                break;

            case 4:
                System.out.println("Ваш заказ принят, ожидайте...");
                Latte latte = new Latte();
                coffeStore.makeLatte(latte);
                break;

            default:
                break;
        }
    }

}