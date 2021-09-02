package storyflow;

import model.Player;
import utils.Printer;
import utils.TypeWriter;
import utils.Utils;

public class StoryFlow {

    public static void run() {

        Player player = new Player();

        player.setName(Printer.askName());

        try {
            TypeWriter.typeWriter(Printer.prologue(player.getName()));

            Controller.sortingHat(player);
            TypeWriter.typeWriter(Printer.sortingHat(player.getHouse()));

            TypeWriter.typeWriter(Printer.charmClass());
            Learning.getKnowledge(player);

            TypeWriter.typeWriter(Printer.FlyingClass());
            Learning.getBravery(player);

            TypeWriter.typeWriter(Printer.PotionClass());
            Learning.getTrickery(player);

            TypeWriter.typeWriter(Printer.TransfigurationClass());
            Learning.getFriendliness(player);

            TypeWriter.typeWriter(Printer.troll());
            if (Utils.alive(player)) {
                Challenges.trollChallenge(player);
            } else {
                System.out.println("Professor Quirrell got the sorcerer's stone, Voldemort returned. GAME OVER");
            }

            TypeWriter.typeWriter(Printer.quidditch());
            if (Utils.alive(player)) {
                Challenges.quidditchChallenge(player);
            } else {
                System.out.println("Professor Quirrell got the sorcerer's stone, Voldemort returned. GAME OVER");
            }

            TypeWriter.typeWriter(Printer.library());
            if (Utils.alive(player)) {
                Challenges.library(player);
            } else {
                System.out.println("Professor Quirrell got the sorcerer's stone, Voldemort returned. GAME OVER");
            }

            TypeWriter.typeWriter(Printer.neville());
            if (Utils.alive(player)) {
                Challenges.neville(player);
            } else {
                System.out.println("Professor Quirrell got the sorcerer's stone, Voldemort returned. GAME OVER");
            }

            TypeWriter.typeWriter(Printer.hagrid());
            if (Utils.alive(player)) {
                Challenges.hagridChallenge(player);
            } else {
                System.out.println("Professor Quirrell got the sorcerer's stone, Voldemort returned. GAME OVER");
            }
            Printer.printTheEnd("HarryPotterGame1/src/resources/hp.txt");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
