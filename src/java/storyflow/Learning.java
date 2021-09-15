package storyflow;

import model.Character;
import model.House;
import model.Player;
import utils.Printer;
import utils.Utils;

public class Learning {


    public static int learningProcess(Player player, House house) {
        return Utils.incrementer(player, house);
    }

    public static void getKnowledge(Player player) throws InterruptedException {
        House house = House.RAVENCLAW;

        player.setKnowledge(learningProcess(player, house));
        Printer.printSkill(player.getKnowledge());
        if (player.getKnowledge() < 6) {
            player.setKnowledge(Controller.nextRound(player, Printer.secondRound(), player.getKnowledge()));
            Printer.printNewSkill(player.getKnowledge());
        }
        Character ron = Controller.createCharacter("Ron", House.GRYFFINDOR);
        player.getHelpTeam().add(ron);


    }

    public static void getBravery(Player player) throws InterruptedException {
        House house = House.GRYFFINDOR;
        player.setBravery(learningProcess(player, house));
        Printer.printSkill(player.getBravery());
        if (player.getBravery() < 6) {
            player.setBravery(Controller.nextRound(player, Printer.secondRound(), player.getBravery()));
            Printer.printNewSkill(player.getBravery());
        }
        Character harry = Controller.createCharacter("Harry", House.GRYFFINDOR);
        player.getHelpTeam().add(harry);
    }

    public static void getTrickery(Player player) throws InterruptedException {
        House house = House.SLYTHERIN;
        player.setTrickery(learningProcess(player, house));
        Printer.printSkill(player.getTrickery());
        if (player.getTrickery() < 6) {
            player.setTrickery(Controller.nextRound(player, Printer.secondRound(), player.getTrickery()));
            Printer.printNewSkill(player.getTrickery());
        }
    }

    public static void getFriendliness(Player player) throws InterruptedException {
        House house = House.HUFFLEPUFF;
        player.setFriendliness(learningProcess(player, house));
        Printer.printSkill(player.getFriendliness());
        if (player.getFriendliness() < 6) {
            player.setFriendliness(Controller.nextRound(player, Printer.secondRound(), player.getFriendliness()));
            Printer.printNewSkill(player.getFriendliness());
        }
        Character hermi = Controller.createCharacter("Hermione", House.GRYFFINDOR);
        player.getHelpTeam().add(hermi);
    }
}
