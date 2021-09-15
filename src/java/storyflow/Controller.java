package storyflow;

import model.Character;
import model.House;
import model.Player;
import utils.Utils;

import java.util.Random;

public class Controller {

    public static void sortingHat(Player player) {
        Random random = new Random();
        int houseNumber = random.nextInt(4) + 1;

        if (houseNumber == 1) {
            player.setHouse(House.GRYFFINDOR);
        } else if (houseNumber == 2) {
            player.setHouse(House.RAVENCLAW);
        } else if (houseNumber == 3) {
            player.setHouse(House.HUFFLEPUFF);
        } else if (houseNumber == 4) {
            player.setHouse(House.SLYTHERIN);
        }
    }

    public static int nextRound(Player player, String answer, int skill) {
        if (answer.equalsIgnoreCase("y")) {
            player.nextRound();
            return skill+1;
        }return skill;
    }

    public static void nextGame(String answer){
        if (answer.equalsIgnoreCase("y")){
            StoryFlow.run();
        }
    }

    public static Character createCharacter(String name, House house){
        Character character = new Character();
        character.setName(name);
        character.setHouse(house);
        character.setKnowledge(Utils.diceRoller());
        character.setBravery(Utils.diceRoller());
        character.setTrickery(Utils.diceRoller());
        character.setFriendliness(Utils.diceRoller());

        return character;
    }
}
