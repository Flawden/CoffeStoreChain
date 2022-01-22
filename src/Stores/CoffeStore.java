package stores;

import menu.Coffee;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public abstract class CoffeStore {

    Random rnd = new Random();
    protected String city;
    int failChance;
    int numOfSituation = 0;

    ArrayList<Coffee> listOfCoffee = new ArrayList<Coffee>();

            //Установить имя города.
            public abstract void setCoffeeStoreName();

            //Создать непредвиденные обстоятельства
            public abstract void failSituation();

            //Установить шанс непредвиденных обстоятельств
            public abstract void setFailChance();

            //Дополнительные продукты к кофе
            public abstract void additionalGoods();

            //Получить список коффе, для заполнения
            public abstract void createCoffeList();

            public final void coffeeStoreStart() {
                setCoffeeStoreName();
                setFailChance();
                createCoffeList();
                greetingCoffee();
                Coffee cofee = selectCoffee();
                additionalGoods();
                waitYourCoffee(cofee);
            }

            public final void greetingCoffee() {
                System.out.println("Здравствуйте! Вы в кофе города " + city + "\n" +
                        "Введите номер напитка:");
                outputCoffeeList();
            }

            private final ArrayList<Coffee> makeCoffeList(ArrayList<String> coffeeList) {

                for(String i : coffeeList) {
                    listOfCoffee.add(new Coffee(i));
                }

                return listOfCoffee;
            }

            private final void outputCoffeeList() {
                int counter = 1;

                for(Coffee i: listOfCoffee) {
                    System.out.println(counter + ". " + i);
                    counter++;
                }
            }

            private final void makeCoffee(Coffee coffee) throws InterruptedException {

                Random rnd = new Random();
                    Thread.sleep(rnd.nextInt(1000, 4000));
            }

            private final Coffee selectCoffee() {
                BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
                Coffee chooseYourDesteny = null;
                while (true) {
                    try {
                        chooseYourDesteny = listOfCoffee.get(Integer.parseInt(rd.readLine()) - 1);
                        break;
                    } catch (Exception e) {
                        System.out.println("Данной позиции не существует. Попробуйте еще раз.");
                    }
                }
                return chooseYourDesteny;

            }

            private final void waitYourCoffee(Coffee coffee) {
                try {
                    System.out.println("Ваш " + coffee + " скоро будет готов. Ожидайте");
                    Thread.sleep(rnd.nextInt(1000, 4000));
                    if (rnd.nextInt(1, 100/failChance) == 1) {
                        failSituation();
                    }
                    else {
                        System.out.println("Ваш " + coffee + " готов. Приятного аппетита!");
                    }
                } catch (InterruptedException e) {
                    System.out.println("Ваш официант споткнулся и уронил ваш кофе. Приносим свои извинения");
                }
            }

}

