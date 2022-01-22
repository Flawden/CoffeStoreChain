import stores.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SelectCoffeeStore {

    static String myCity = "";

    //======================================================
    // Выбираем город - начало

    public static int start() throws IOException {

        greetingMethod();
        if (selectCity() == 1) {
            return 1;
        }
        else {
            return 0;
        }

    }

    // Выбираем город - конец
    //======================================================

    private static void greetingMethod() {
        System.out.println("Добро пожаловать на главную страницу нашей сети кофеен \"CoffeeShop\"" +
                "Мы - огромная российская сеть кофеен по всей стране. У нас есть свои кофейни в следующих городах: \n" +
                "1.Москва \n" +
                "2.Санкт-Питербург \n" +
                "3.Челябинск \n" +
                "4.Сатка \n" +
                "5.Карталы \n" +
                "6.Ижевск \n" +
                "7.Омск \n" +
                "8.Самара \n" +
                "9.Саратов \n \n" +
                "Введите номер своего города, в котором вы бы хотели получить кофе:");
    }

    private static int selectCity() throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        myCity = rd.readLine();


        switch (myCity) {
            case "1":
                System.out.println("Ваш город: Москва...Ожидайте");
                MoscowCoffeShop mosMakeCoffee = new MoscowCoffeShop();
                mosMakeCoffee.coffeeStoreStart();
                break;

            case "2":
                System.out.println("Ваш город: Санкт-Питербург...Ожидайте");
                StPetersburgCoffeeStore stMakeCoffee = new StPetersburgCoffeeStore();
                stMakeCoffee.coffeeStoreStart();
                break;

            case "3":
                System.out.println("Ваш город: Челябинск...Ожидайте");
                ChelyabinskCoffeeStore chelMakeCoffee = new ChelyabinskCoffeeStore();
                chelMakeCoffee.coffeeStoreStart();
                break;

            case "4":
                System.out.println("Ваш город: Сатка...Ожидайте");
                SatkaCoffeeStore satkaMakeCofee = new SatkaCoffeeStore();
                satkaMakeCofee.coffeeStoreStart();
                break;

            case "5":
                System.out.println("Ваш город: Карталы...Ожидайте");
                KartalyCoffeeStore ktMakeCoffee = new KartalyCoffeeStore();
                ktMakeCoffee.coffeeStoreStart();
                break;

            case "6":
                System.out.println("Ваш город: Ижевск...Ожидайте");
                IzevskCoffeeStore izMakeCofee = new IzevskCoffeeStore();
                izMakeCofee.coffeeStoreStart();
                break;

            case "7":
                System.out.println("Ваш город: Омск...Ожидайте");
                OmskCoffeeStore omMakeCofee = new OmskCoffeeStore();
                omMakeCofee.coffeeStoreStart();
                break;

            case "8":
                System.out.println("Ваш город: Самара...Ожидайте");
                SamaraCoffeeStore samMakeCoffee = new SamaraCoffeeStore();
                samMakeCoffee.coffeeStoreStart();
                break;

            case "9":
                System.out.println("Ваш город: Саратов...Ожидайте");
                SaratovCoffeeStore sarMakeCoffee = new SaratovCoffeeStore();
                sarMakeCoffee.coffeeStoreStart();
                break;

            default:
                System.out.println("Ошибка. Неверное значение, попробуйте еще раз \n");
                return 1;
        }
        return 0;
    }

}
