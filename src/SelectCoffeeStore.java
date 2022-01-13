import Stores.*;
import TypeOfCoffee.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SelectCoffeeStore {

    static String myCity = "";

    //======================================================
    // Выбираем город - начало

    public static int select() throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

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

        myCity = rd.readLine();

        switch (myCity) {
            case "1":
                System.out.println("Ваш город: Москва...Ожидайте");
                MoscowCoffeShop mosMakeCoffee = new MoscowCoffeShop();
                mosMakeCoffee.selectCoffee(mosMakeCoffee);
                break;

            case "2":
                System.out.println("Ваш город: Санкт-Питербург...Ожидайте");
                StPetersburgCoffeeStore stMakeCoffee = new StPetersburgCoffeeStore();
                stMakeCoffee.selectCoffee(stMakeCoffee);
                break;

            case "3":
                System.out.println("Ваш город: Челябинск...Ожидайте");
                ChelyabinskCoffeeStore chelMakeCoffee = new ChelyabinskCoffeeStore();
                chelMakeCoffee.selectCoffee(chelMakeCoffee);
                break;

            case "4":
                System.out.println("Ваш город: Сатка...Ожидайте");
                SatkaCoffeeStore satkaMakeCofee = new SatkaCoffeeStore();
                satkaMakeCofee.selectCoffee(satkaMakeCofee);
                break;

            case "5":
                System.out.println("Ваш город: Карталы...Ожидайте");
                KartalyCoffeeStore ktMakeCoffee = new KartalyCoffeeStore();
                ktMakeCoffee.selectCoffee(ktMakeCoffee);
                break;

            case "6":
                System.out.println("Ваш город: Ижевск...Ожидайте");
                IzevskCoffeeStore izMakeCofee = new IzevskCoffeeStore();
                izMakeCofee.selectCoffee(izMakeCofee);
                break;

            case "7":
                System.out.println("Ваш город: Омск...Ожидайте");
                OmskCoffeeStore omMakeCofee = new OmskCoffeeStore();
                omMakeCofee.selectCoffee(omMakeCofee);
                break;

            case "8":
                System.out.println("Ваш город: Самара...Ожидайте");
                SamaraCoffeeStore samMakeCoffee = new SamaraCoffeeStore();
                samMakeCoffee.selectCoffee(samMakeCoffee);
                break;

            case "9":
                System.out.println("Ваш город: Саратов...Ожидайте");
                SaratovCoffeeStore sarMakeCoffee = new SaratovCoffeeStore();
                sarMakeCoffee.selectCoffee(sarMakeCoffee);
                break;

            default:
                System.out.println("Ошибка. Неверное значение, попробуйте еще раз \n");
                return 1;
        }

        return 0;
    }

    // Выбираем город - конец
    //======================================================


}
