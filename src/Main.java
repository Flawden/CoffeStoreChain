import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int status = 1;

        try {
            while (status == 1) {
                status = SelectCoffeeStore.start();
            }
        }
        catch (Exception e) {
            System.out.println("Что-то пошло не так.");
        }


    }

}
