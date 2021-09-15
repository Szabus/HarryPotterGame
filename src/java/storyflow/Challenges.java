package storyflow;

import model.Character;
import model.House;
import model.Player;
import utils.Printer;
import utils.TypeWriter;
import utils.Utils;

public class
Challenges {

    public static void trollChallenge(Player player) throws InterruptedException {

        int trollPoint = Utils.diceRoller();
        TypeWriter.typeWriter("The troll's point: " + trollPoint);
        System.out.println();

        if (player.getKnowledge() >= trollPoint) {
            player.nextRound();
            Thread.sleep(1000);
            TypeWriter.typeWriter("The troll fainted by your incredible Vingardium Leviosa spell use.");
            System.out.println();



        } else {
            player.nextRound();
            if (player.getBravery() >= trollPoint) {
                player.nextRound();
                Thread.sleep(1000);
                TypeWriter.typeWriter("You defeated the troll with your bravery.");
                System.out.println();

            } else {
                player.nextRound();
                if (player.getBravery() + 2 >= trollPoint) {
                    player.nextRound();
                    TypeWriter.typeWriter("Ron helped you with the Vingardium Leviosa spell.");
                    System.out.println();

                } else {
                    player.setHasHermione(false);
                    TypeWriter.typeWriter("Unfortunately you failed the challenge, " +
                            "Hermione was taken to the Hospital Wing.");
                    System.out.println();
                }
            }
        }
        Printer.playerPoints(player);
        System.out.println();
    }

    public static void quidditchChallenge(Player player) throws InterruptedException {

        int pitonPoint = Utils.diceRoller();
        TypeWriter.typeWriter("Severus Snape's point: " + pitonPoint);
        System.out.println();

        if (player.getBravery() >= pitonPoint) {
            player.nextRound();
            Thread.sleep(1000);
            TypeWriter.typeWriter("You lit his rob with amazing bravery. Gryffindor wins! ");
            System.out.println();

        } else {
            player.nextRound();
            if (player.getFriendliness() >= pitonPoint) {
                player.nextRound();
                Thread.sleep(1000);
                TypeWriter.typeWriter("Even if you are not the bravest, you do everything " +
                        "for help your friends including to curse one of your professor. Gryffindor wins!");
                System.out.println();

            } else {
                player.nextRound();
                if (player.getFriendliness() + 2 >= pitonPoint) {
                    player.nextRound();
                    Thread.sleep(1000);
                    TypeWriter.typeWriter("""
                          Hermione lit Professor Snape rob, you help her to distract the others attention
                          Gryffindor wins!""");
                    System.out.println();

                } else {
                    player.setHasHarry(false);
                    Thread.sleep(1000);
                    TypeWriter.typeWriter("Unfortunately you failed the challenge, Harry fell of hir broom.\" +\n" +
                            "                            \"He was taken to the Hospital Wing");
                    System.out.println();
                }
            }
        }
        Printer.playerPoints(player);
        System.out.println();
    }

    public static void library(Player player) throws InterruptedException {

        int filchAndMrsNorrisPoint = Utils.diceRoller();
        TypeWriter.typeWriter("Filch and Mrs Norris's point: " + filchAndMrsNorrisPoint);
        System.out.println();

        if (player.getTrickery() >= filchAndMrsNorrisPoint) {
            player.nextRound();
            Thread.sleep(1000);
            TypeWriter.typeWriter("With a clever trick, you made fool of Flich.");
            System.out.println();


        } else {
            player.nextRound();
            Thread.sleep(1000);
            if (player.getKnowledge() >= filchAndMrsNorrisPoint) {
                player.nextRound();
                TypeWriter.typeWriter("You spend a lot of time in the library, you know every bookshelves and corners." +
                        "You can easily hide.");
                System.out.println();

            } else {
                player.nextRound();
                if (player.getKnowledge() + 2 >= filchAndMrsNorrisPoint) {
                    player.nextRound();
                    Thread.sleep(1000);
                    TypeWriter.typeWriter( "You hide under Harry's invisibility cloak, Flich can't find you.");
                    System.out.println();

                } else {
                    player.setHasRon(false);
                    Thread.sleep(1000);
                    TypeWriter.typeWriter("""
                            Unfortunately you failed the challenge, Ron was taken by Mrs. Norris
                            He had to go to penalty work.
                            """);
                    System.out.println();
                }
            }
        }
        Printer.playerPoints(player);
        System.out.println();
    }

    public static void neville(Player player) throws InterruptedException {

        int nevillePoints = Utils.diceRoller();

        TypeWriter.typeWriter("Neville point: " + nevillePoints);
        System.out.println();

        if (player.getFriendliness() >= nevillePoints) {
            player.nextRound();
            Thread.sleep(1000);
            TypeWriter.typeWriter("You can calm and convince Neville that you have important things to do.");
            System.out.println();
        } else {
            player.nextRound();
            if (player.getTrickery() >= nevillePoints) {
                player.nextRound();
                Thread.sleep(1000);
                TypeWriter.typeWriter("You trick Neville and you can leave him in the club room.");
                System.out.println();
            } else {
                player.nextRound();
                if (player.getTrickery() + 2 >= nevillePoints) {
                    player.nextRound();
                    Thread.sleep(1000);
                    TypeWriter.typeWriter("You trick Neville and use the saltwater curse on him.");
                    System.out.println();
                } else {
                    Thread.sleep(1000);
                    TypeWriter.typeWriter("""
                            Unfortunately you failed the challenge,
                            You all have to go to penalty work.
                            """);
                    System.out.println();
                    player.nextRound();
                }
            }
        }
        Printer.playerPoints(player);
        System.out.println();
    }

    public static void hagridChallenge(Player player) throws InterruptedException {
        if (player.isHasHermione() && player.isHasHarry() && player.isHasRon()) {
            player.nextRound();
            TypeWriter.typeWriter("Hagrid reveals the secret of Bolyhoska. You can go through the trap door.");
            System.out.println();
        } else {
            player.nextRound();
            if (!player.isHasHermione()) {
                trollChallenge(player);
                hagridChallenge(player);
            } else if (!player.isHasHarry()) {
                player.nextRound();
                quidditchChallenge(player);
                hagridChallenge(player);
            } else if (!player.isHasRon()) {
                player.nextRound();
                library(player);
                hagridChallenge(player);
            }
        }
        Printer.playerPoints(player);
        System.out.println();
    }
}