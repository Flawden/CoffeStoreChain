package stores;

import menu.*;

public class SatkaCoffeeStore extends CoffeStore {

    @Override
    public void setFailChance() {
        failChance = 20;
    }

    @Override
    public void setCoffeeStoreName() {
        city = "Satka";
    }

    @Override
    public void createCoffeList() {
        listOfCoffee.add(new Coffee("Cappuccino"));
        coffePriceList.add(33);
        listOfCoffee.add(new Coffee("Macchiato "));
        coffePriceList.add(32);
        listOfCoffee.add(new Coffee("Vietnamese coffee"));
        coffePriceList.add(31);
        listOfCoffee.add(new Coffee("Coffee bombon"));
        coffePriceList.add(36);
        listOfCoffee.add(new Coffee("Viennese coffee"));
        coffePriceList.add(33);
        listOfCoffee.add(new Coffee("Frappe"));
        coffePriceList.add(37);
    }

    @Override
    public void additionalGoods() {}

    @Override
    public void failSituation() {
        numOfSituation = rnd.nextInt(1, 2);

        switch (numOfSituation) {
            case 1: {
                System.out.println("Looks like your coffee hasn't been delivered yet. We apologize");
                break;
            }
            case 2: {
                System.out.println("Looks like your coffee turned out to be tea. We apologize");
                break;
            }
        }
    }
}