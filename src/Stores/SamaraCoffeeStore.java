package stores;

import menu.*;

public class SamaraCoffeeStore extends CoffeStore {

    @Override
    public void setCoffeeStoreName() {
        city = "Самара";
    }

    @Override
    public void setFailChance() {
        failChance = 20;
    }

    @Override
    public void createCoffeList() {
        listOfCoffee.add(new Coffee("Капучино"));
        listOfCoffee.add(new Coffee("Макиато "));
        listOfCoffee.add(new Coffee("Латте"));
        listOfCoffee.add(new Coffee("Меланж"));
        listOfCoffee.add(new Coffee("Мокка"));
        listOfCoffee.add(new Coffee("Фраппе"));
    }

    @Override
    public void additionalGoods() {}

    @Override
    public void failSituation() {
        numOfSituation = rnd.nextInt(1, 2);

        switch (numOfSituation) {
            case 1: {
                System.out.println("Кажется ваш кофе еще не доставили. Приносим свои извенения");
                break;
            }
            case 2: {
                System.out.println("Вы стали нашим 1000 посетителем. Кофе достается вам бесплатно!");
                break;
            }
        }
    }
}