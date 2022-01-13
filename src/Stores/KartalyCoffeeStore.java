package Stores;

import Stores.CoffeStore;
import TypeOfCoffee.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class KartalyCoffeeStore extends CoffeStore {

    @Override
    public void makeAmericano(Coffee americano) {

        super.makeAmericano(americano);
        Random rnd = new Random();
        int chance = rnd.nextInt(1, 5);
        if (chance == 1) {
            System.out.println("Этот ваш, американо или как там его...готов к выдаче в Карталинском кофе. Приятного аппетита!");
        }
        else if(chance == 2) {
            System.out.println("Ой! Кажется ваш американо оказался экспрессо. Приносим свои извинения!");
        }
        else if(chance == 3) {
            System.out.println("Емае! Кажется весь наш американо выпил наш программист. Приносим свои извинения!");
        }
        else if(chance == 4) {
            System.out.println("Не поверишь! Кажется ваш американо был похищен инопланетянами. Приносим свои извинения!");
        }
        else if(chance == 5) {
            System.out.println("Зря я не смотрел на сроки! Кажется ваш американо обрел сознание и убежал. Приносим свои извинения!");
        }

    }

    public static void selectCoffee(CoffeStore coffeStore) {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        Coffee coffeType;
        int coffeeNum = 0;

        System.out.println("\nЗдрасьте. Пить будешь?: \n" +
                "1. Да \n" +
                "2. Нет \n" +

                "Вводи номер заказа:");

        try {
            coffeeNum = Integer.parseInt(rd.readLine());
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        switch(coffeeNum) {
            case 1:
                System.out.println("Ага, ожидай пока...");
                Americano americano = new Americano();
                coffeStore.makeAmericano(americano);
                break;

            case 2:
                System.out.println("Зачем тогда вообще приходил? Странный какой-то...");
                break;


            default:
                break;
        }
    }

}
