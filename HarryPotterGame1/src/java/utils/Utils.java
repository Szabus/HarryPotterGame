package utils;

import model.House;
import model.Player;

import java.util.Random;
import java.util.Scanner;

public class Utils {

    public static int diceRoller() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public static int incrementer(Player player, House house) {
        int incrementedDice = diceRoller();
        if (player.getHouse().equals(house) && incrementedDice < 6) {
            incrementedDice += 1;
        }

        return incrementedDice;
    }

    public static int decrement(Player player, House house, int dicePoints) {
        int decrementedDice = dicePoints;
        if (player.getHouse().equals(house)) {
            decrementedDice -= 1;
        }

        return decrementedDice;
    }

    public static String userInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static boolean alive(Player player) {
        return player.getScore() > 0;
    }
}
