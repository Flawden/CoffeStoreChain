package stores;

import menu.*;

public class SatkaCoffeeStore extends CoffeStore {

    @Override
    public void setFailChance() {
        failChance = 20;
    }

    @Override
    public void setCoffeeStoreName() {
        city = "Сатка";
    }

    @Override
    public void createCoffeList() {
        listOfCoffee.add(new Coffee("Капучино"));
        listOfCoffee.add(new Coffee("Макиато "));
        listOfCoffee.add(new Coffee("Вьетнамский кофе"));
        listOfCoffee.add(new Coffee("Кафе бомбон"));
        listOfCoffee.add(new Coffee("Кофе по-венски "));
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
                System.out.println("Кажется ваш кофе оказался чаем. Приносим свои извенения");
                break;
            }
        }
    }
}