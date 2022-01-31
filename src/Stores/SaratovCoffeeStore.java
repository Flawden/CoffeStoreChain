package stores;

import menu.*;

public class SaratovCoffeeStore extends CoffeStore {

    @Override
    public void setFailChance() {
        failChance = 30;
    }

    @Override
    public void setCoffeeStoreName() {
        city = "Saratov";
    }

    @Override
    public void createCoffeList() {
        listOfCoffee.add(new Coffee("Cappuccino"));
        coffePriceList.add(40);
        listOfCoffee.add(new Coffee("Macchiato"));
        coffePriceList.add(50);
        listOfCoffee.add(new Coffee("Сoffee bombon"));
        coffePriceList.add(15);
        listOfCoffee.add(new Coffee("Viennese coffee"));
        coffePriceList.add(40);
        listOfCoffee.add(new Coffee("Frappe"));
        coffePriceList.add(50);
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