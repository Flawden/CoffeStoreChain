import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String answer = "Нет";
        int status = 1;

        try {
            while (status == 1) {
                while (status == 1) {
                    status = SelectCoffeeStore.start();
                }
                status = 1;
                System.out.println("Do you want to buy something again? (Yes/No)");
                answer = rd.readLine().toLowerCase();

                if (!answer.equals("yes")) {
                    status = 0;
                }
            }

        }
        catch (Exception e) {
            System.out.println("Something went wrong.");
            e.printStackTrace();
        }


    }

}
