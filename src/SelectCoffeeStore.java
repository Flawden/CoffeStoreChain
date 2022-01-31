import stores.*;

import java.io.*;
import java.util.Locale;

public class SelectCoffeeStore {

    static String myCity = "";
    static private final String answer = "";

    static MoscowCoffeShop mosMakeCoffee;
    static StPetersburgCoffeeStore stMakeCoffee;
    static ChelyabinskCoffeeStore chelMakeCoffee;
    static SatkaCoffeeStore satkaMakeCofee;
    static KartalyCoffeeStore ktMakeCoffee;
    static IzevskCoffeeStore izMakeCofee;
    static OmskCoffeeStore omMakeCofee;
    static SamaraCoffeeStore samMakeCoffee;
    static SaratovCoffeeStore sarMakeCoffee;

    static {
         mosMakeCoffee = new MoscowCoffeShop();
         stMakeCoffee = new StPetersburgCoffeeStore();
         chelMakeCoffee = new ChelyabinskCoffeeStore();
         satkaMakeCofee = new SatkaCoffeeStore();
         ktMakeCoffee = new KartalyCoffeeStore();
         izMakeCofee = new IzevskCoffeeStore();
         omMakeCofee = new OmskCoffeeStore();
         samMakeCoffee = new SamaraCoffeeStore();
         sarMakeCoffee = new SaratovCoffeeStore();
    }



    public static int start() throws IOException, ClassNotFoundException {

        deserialize();
        greetingMethod();
        if (selectCity() == 1) {
            return 1;
        }
        else {
            serialize();
            return 0;
        }

    }

    private static void serialize() throws IOException {
        //Москва
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Moscow.txt"));
        os.writeObject(mosMakeCoffee);
        os.close();

        //Санкт-петербург
        os = new ObjectOutputStream(new FileOutputStream("ST_pt.txt"));
        os.writeObject(stMakeCoffee);
        os.close();

        //Челябинск
        os = new ObjectOutputStream(new FileOutputStream("Chel.txt"));
        os.writeObject(chelMakeCoffee);
        os.close();

        //Сатка
        os = new ObjectOutputStream(new FileOutputStream("Satka.txt"));
        os.writeObject(satkaMakeCofee);
        os.close();

        //Карталы
        os = new ObjectOutputStream(new FileOutputStream("Kartaly.txt"));
        os.writeObject(ktMakeCoffee);
        os.close();

        //Ижевск
        os = new ObjectOutputStream(new FileOutputStream("Izevsk.txt"));
        os.writeObject(izMakeCofee);
        os.close();

        //Омск
        os = new ObjectOutputStream(new FileOutputStream("Omsk.txt"));
        os.writeObject(omMakeCofee);
        os.close();

        //Самара
        os = new ObjectOutputStream(new FileOutputStream("Samara.txt"));
        os.writeObject(samMakeCoffee);
        os.close();

        //Саратов
        os = new ObjectOutputStream(new FileOutputStream("Saratov.txt"));
        os.writeObject(sarMakeCoffee);
        os.close();

    }

    private static void deserialize() throws IOException, ClassNotFoundException {

        //Москва
        ObjectInputStream os = new ObjectInputStream(new FileInputStream("Moscow.txt"));
        mosMakeCoffee = (MoscowCoffeShop) os.readObject();
        os.close();

        //Санкт-петербург
        os = new ObjectInputStream(new FileInputStream("ST_pt.txt"));
        stMakeCoffee = (StPetersburgCoffeeStore) os.readObject();
        os.close();

        //Челябинск
        os = new ObjectInputStream(new FileInputStream("Chel.txt"));
        chelMakeCoffee = (ChelyabinskCoffeeStore) os.readObject();
        os.close();

        //Сатка
        os = new ObjectInputStream(new FileInputStream("Satka.txt"));
        satkaMakeCofee = (SatkaCoffeeStore) os.readObject();
        os.close();

        //Карталы
        os = new ObjectInputStream(new FileInputStream("Kartaly.txt"));
        ktMakeCoffee = (KartalyCoffeeStore) os.readObject();
        os.close();

        //Ижевск
        os = new ObjectInputStream(new FileInputStream("Izevsk.txt"));
        izMakeCofee = (IzevskCoffeeStore) os.readObject();
        os.close();

        //Омск
        os = new ObjectInputStream(new FileInputStream("Omsk.txt"));
        omMakeCofee = (OmskCoffeeStore) os.readObject();
        os.close();

        //Самара
        os = new ObjectInputStream(new FileInputStream("Samara.txt"));
        samMakeCoffee = (SamaraCoffeeStore) os.readObject();
        os.close();

        //Саратов
        os = new ObjectInputStream(new FileInputStream("Saratov.txt"));
        sarMakeCoffee = (SaratovCoffeeStore) os.readObject();
        os.close();

    }

    private static void greetingMethod() {
        System.out.println("Welcome to the home page of our coffee shop chain \"CoffeeShop\"" +
                "We are a huge Russian chain of coffee houses all over the country. We have our own coffee shops in the following cities: \n" +
                "1.Moscow \n" +
                "2.Saint Petersburg \n" +
                "3.Chelyabinsk \n" +
                "4.Satka \n" +
                "5.Kartaly \n" +
                "6.Izhevsk \n" +
                "7.Omsk \n" +
                "8.Samara \n" +
                "9.Saratov \n \n" +
                "Enter the number of your city where you would like to get coffee:");
    }

    private static int selectCity() throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        myCity = rd.readLine();

        switch (myCity) {
            case "1":
                System.out.println("Your city is Moscow...Please wait");
                mosMakeCoffee.coffeeStoreStart();
                break;

            case "2":
                System.out.println("Your city is Saint Petersburg...Please wait");
                stMakeCoffee.coffeeStoreStart();
                break;

            case "3":
                System.out.println("Your city is Chelyabinsk...Please wait");
                chelMakeCoffee.coffeeStoreStart();
                break;

            case "4":
                System.out.println("Your city is Satka...Please wait");
                satkaMakeCofee.coffeeStoreStart();
                break;

            case "5":
                System.out.println("Your city is Kartaly...Please wait");
                ktMakeCoffee.coffeeStoreStart();
                break;

            case "6":
                System.out.println("Your city is Izhevsk...Please wait");
                izMakeCofee.coffeeStoreStart();
                break;

            case "7":
                System.out.println("Your city is Omsk...Please wait");
                omMakeCofee.coffeeStoreStart();
                break;

            case "8":
                System.out.println("Your city is Samara...Please wait");
                samMakeCoffee.coffeeStoreStart();
                break;

            case "9":
                System.out.println("Your city is Saratov...Please wait");
                sarMakeCoffee.coffeeStoreStart();
                break;

            default:
                    System.out.println("Incorrect value, please try again. \n");
                return 1;
        }
        return 0;
    }

}
