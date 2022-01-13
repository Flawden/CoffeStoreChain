package Stores;

import Stores.CoffeStore;
import TypeOfCoffee.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IzevskCoffeeStore extends CoffeStore {

    @Override
    public void makeCapuccino(Coffee capuccino) {
        super.makeCapuccino(capuccino);
        System.out.println(capuccino.getName() + " готов к выдаче в кофе Ижевска. Приятного аппетита!");
    }

    @Override
    public void makeExpresso(Coffee expresso) {
        super.makeAmericano(expresso);
        System.out.println(expresso.getName() + " готов к выдаче в кофе Ижевска. Приятного аппетита!");
    }

    public static void selectCoffee(CoffeStore coffeStore) {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        Coffee coffeType;
        int coffeeNum = 0;

        System.out.println("\nДобро пожаловать наше кофе. Мы умеем готовить следующие напитки: \n" +
                "1. Капучино \n" +
                "2. Эспрессо \n" +
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
                Cappuccino cappuccino = new Cappuccino();
                coffeStore.makeCapuccino(cappuccino);
                break;

            case 2:
                System.out.println("Ваш заказ принят, ожидайте...");
                Expresso expresso = new Expresso();
                coffeStore.makeExpresso(expresso);
                break;

            default:
                break;
        }
    }

}
