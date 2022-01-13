package Stores;

import TypeOfCoffee.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public abstract class CoffeStore {

            public void makeAmericano(Coffee americano)  {

                Random rnd = new Random();
                try {
                    Thread.sleep(rnd.nextInt(1000, 4000));
                }
                catch (Exception e) {
                    e.printStackTrace();
                }

            }

            public void makeCapuccino(Coffee capuccino) {

                Random rnd = new Random();
                try {
                    Thread.sleep(rnd.nextInt(1000, 4000));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            public void makeExpresso(Coffee expresso) {

                Random rnd = new Random();
                try {
                    Thread.sleep(rnd.nextInt(1000, 4000));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            public void makeLatte(Coffee latte) {

                Random rnd = new Random();
                try {
                    Thread.sleep(rnd.nextInt(1000, 4000));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

    public static void selectCoffee(CoffeStore coffeStore) {}

}

