package stores;

import menu.*;

public class KartalyCoffeeStore extends CoffeStore {

    @Override
    public void setCoffeeStoreName() {
        city = "Kartaly";
    }

    @Override
    public void setFailChance() {
        failChance = 50;
    }

    @Override
    public void createCoffeList() {
        listOfCoffee.add(new Coffee("Coffee"));
        coffePriceList.add(50);
    }

    @Override
    public void additionalGoods() {}

    @Override
    public void failSituation() {
        numOfSituation = rnd.nextInt(1, 5);

        switch (numOfSituation) {
            case 1: {
                System.out.println("Looks like your coffee hasn't been delivered yet. I sympathize");
                break;
            }
            case 2: {
                System.out.println("Your coffee has been captured by a group of terrorists. We bring our apologies");
                break;
            }
            case 3: {
                System.out.println("Your coffee is drunk by a hungry waiter. We bring our apologies");
                break;
            }
            case 4: {
                System.out.println("Oops! It seems your coffee has been sitting on the shelf for so long that it evolved, grew legs and ran away. We bring our apologies");
                break;
            }
            case 5: {
                System.out.println("We accidentally made tea instead of coffee. I hope you're not offended. Bon Appetit!");
                break;
            }
        }
    }

}
