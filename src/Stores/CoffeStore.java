package stores;

import menu.Coffee;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public abstract class CoffeStore implements Serializable {

    protected Random rnd = new Random();
    protected String city;
    protected int failChance;
    protected int numOfSituation = 0;
    protected int buiscuitPrice = 0;
    protected int sellBiscuitsCounter = 0;
    protected int sellBiscuitsTotal = 0;
    protected int zReport = 0;

    ArrayList<Coffee> listOfCoffee = new ArrayList<Coffee>();
    ArrayList<Integer> coffeSalesCounter = new ArrayList<Integer>();
    ArrayList<Integer> coffePriceList = new ArrayList<Integer>();
    ArrayList<Integer> coffeSalesList = new ArrayList<Integer>();

    {
        setCoffeeStoreName();
        setFailChance();
        createCoffeList();
        createCoffeSales();
    }

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
                greetingCoffee();
                Coffee cofee = selectCoffee();
                additionalGoods();
                waitYourCoffee(cofee);
                showReport();
            }

            public final void greetingCoffee() {
                System.out.println("Здравствуйте! Вы в кофе города " + city + "\n" +
                        "Введите номер напитка:");
                outputCoffeeList();
            }

            private final void createCoffeSales() {
                for (int i = 0; i < listOfCoffee.size(); i++) {
                    coffeSalesCounter.add(0);
                    coffeSalesList.add(0);
                }
            }

            private final void outputCoffeeList() {
                int counter = 1;

                for(Coffee i: listOfCoffee) {
                    System.out.println(counter + ". " + i + " " + coffePriceList.get(counter - 1) + " руб");
                    counter++;
                }
            }

            private final Coffee selectCoffee() {
                BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
                Coffee chooseYourDesteny = null;
                int choise = -1;
                while (true) {
                    try {
                        choise = Integer.parseInt(rd.readLine()) - 1;
                        chooseYourDesteny = listOfCoffee.get(choise);
                        coffeSalesCounter.set(choise, coffeSalesCounter.get(choise) + 1);
                        coffeSalesList.set(choise, coffeSalesList.get(choise) + coffePriceList.get(choise));
                        break;
                    } catch (Exception e) {
                        System.out.println("Данной позиции не существует. Попробуйте еще раз.");
                    }
                }
                return chooseYourDesteny;

            }

            private final void waitYourCoffee(Coffee coffee) {
                try {
                    System.out.println("Your " + coffee + " will be ready soon. Please wait.");
                    Thread.sleep(rnd.nextInt(1000, 4000));
                    if (rnd.nextInt(1, 100/failChance) == 1) {
                        failSituation();
                    }
                    else {
                        System.out.println("Your " + coffee + " is ready. Bon appetit!");
                    }
                } catch (InterruptedException e) {
                    System.out.println("Your waiter tripped and dropped your coffee. We apologize");
                }
            }

            public final void showReport() {
                System.out.println();
                for(int i = 0; i < listOfCoffee.size(); i++) {
                    System.out.println("Total " + listOfCoffee.get(i) + " sold: " + coffeSalesCounter.get(i) + " items," +
                            " for the amount " + coffeSalesList.get(i));
                    zReport+= coffeSalesList.get(i);
                }

                if (Arrays.toString(this.getClass().getInterfaces()).equals("[interface menu.Biscuits]")) {
                    zReport += sellBiscuitsTotal;
                    System.out.println("\nCookies were sold: " + sellBiscuitsCounter + ", for the amount " + sellBiscuitsTotal);
                    System.out.println("Total revenue: " + zReport);
                }
                else {
                    System.out.println("Total revenue: " + zReport);
                }

            }

}

