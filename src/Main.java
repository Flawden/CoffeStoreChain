import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        int status = 1;

        try {
            while (status == 1) {
                status = SelectCoffeeStore.select();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }

}
