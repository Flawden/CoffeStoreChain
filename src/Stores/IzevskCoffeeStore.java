package stores;

import menu.*;

public class IzevskCoffeeStore extends CoffeStore {

    @Override
    public void setCoffeeStoreName() {
        city = "Izhevsk";
    }

    @Override
    public void setFailChance() {
        failChance = 20;
    }

    @Override
    public void createCoffeList() {
        listOfCoffee.add(new Coffee("Cappuccino"));
        coffePriceList.add(20);
        listOfCoffee.add(new Coffee("Macchiato"));
        coffePriceList.add(15);
        listOfCoffee.add(new Coffee("Latte"));
        coffePriceList.add(30);
    }

    @Override
    public void additionalGoods() {}

    @Override
    public void failSituation() {
        numOfSituation = rnd.nextInt(1, 2);

        switch (numOfSituation) {
            case 1: {
                System.out.println("Looks like your coffee hasn't been delivered yet. I'm sorry");
                break;
            }
            case 2: {
                System.out.println("Your coffee has been stolen by a vicious group of war hedgehogs. I'm sorry");
                break;
            }
        }
    }
}
