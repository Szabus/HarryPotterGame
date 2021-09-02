package utils;

import model.House;
import model.Player;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Printer {

    public static String askName() {

        System.out.println("Please, enter your full name:");
        return Utils.userInput();
    }

    public static String prologue(String name) {
        return "Dear " + name + "!" + "\n" + "We are pleased to inform you that you have been accepted at " +
                "Hogwarts School of Witchcraft and Wizardry.\n" +
                "Term begins on 1 September.\n" + "Yours sincerely\n" + "Minerva Mcgonall\n";
    }

    public static String sortingHat(House house) {
        return  """
                
                The opening day of your first Hogwarts year has arrived,
                Mcgonall puts the Sorting Hat on your head
                which after a little thought exclaims:
                
                """
                + house + "!!\n";
    }

    public static String charmClass() {
        return """
                
                In Professor Flitwick Charm Class, you meet Ron,
                the youngest Weasley,
                and learn how to use correctly the Vingardium Leviosa charm.
                Your knowledge now:
                
                """;
    }

    public static String FlyingClass() {
        return """
                
                In Madam Hooch’s flying lesson, you meet Harry Potter,
                the boy who survived Youknowwho attack
                Let's see how much talent you have for flying,
                your actual bravery point is:
                
                """;

    }

    public static String PotionClass() {
        return """
                
                Well, well, where are you?
                Dark and damp, below so many floors
                You guessed it right, the infamous Potion class!
                Obviously.
                Professor Snape glares at you: What would I get if I added powdered root
                of asphodel to an infusion of wormwood?
                Depending on how cunning you are, you evade the question with a smart remark
                
                """;
    }

    public static String TransfigurationClass() {
        return """
                
                As you hurry to transfiguration class, you help Hermione to avoid the tricky stairs.
                You two Practice the charms together in the class.
                Hermione offers to help you. Do you accept it?
                Your social skill now:
                                
                """;
    }

    public static void printSkill(int skill) throws InterruptedException {
        System.out.println((skill + "\n"));
        Thread.sleep(100);
    }

    public static void printNewSkill(int skill) {
        TypeWriter.typeWriter("Your point : " + skill);
        System.out.println();
    }

    public static String secondRound() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Do you want to stay to practise? Press y to yes or n to no!");
        return Utils.userInput();
    }

    public static String troll() {
        return """
                
                Hermione is trapped by a mountain troll
                you rushed to her aid with the guys despite the ban.
                
                """;
    }

    public static String quidditch() {
        return """
                
                Harry's Nimbus2000 is cursed during the match,
                Hermione suspect of Professor Snape
                You need to do something right now!
                
                """;
    }

    public static String library() {
        return """
                
                At night you look for information about Nicolas Flamel
                in the locked section of the library.
                You want to search faster, so you seperate from each other.
                                
                """;

    }

    public static String neville() {
        return """
                
                The next night, you, Harry Ron and Hermione want to escape to Hagrid
                to ask about the three-headed dog and crash into the trap door.
                Suddenly, Neville angrily stands in your way...
                
                """;
    }

    public static void playerPoints(Player player) throws InterruptedException {
        Thread.sleep(1000);
        TypeWriter.typeWriter("Your score " + player.getScore());
        System.out.println();
        Thread.sleep(1000);
    }

    public static String hagrid() {
        return """
                
                You escape from the castle to Hagrid's hut,
                you try to get him to tell you how to treat Bolyhoska
                
                """;
    }

    public static void printTheEnd(String file) {
        try {
            Thread.sleep(1000);
            Stream<String> stream = Files.lines(Paths.get(file));
            stream.forEach(System.out::println);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}