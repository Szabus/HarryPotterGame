import model.Character;
import model.Player;
import storyflow.Challenges;
import storyflow.StoryFlow;
import utils.Printer;

public class HarryPotterFirstYear {

    public static void main(String[] args) {

     //   StoryFlow.run();
      //  Printer.printTheEnd("src/resources/hp.txt");

        Player player = new Player();
        player.setScore(10);
        player.setKnowledge(1);

        Character ron = new Character();
        Character harry = new Character();
        Character hermi = new Character();
        hermi.setKnowledge(2);
        player.getHelpTeam().add(ron);
        player.getHelpTeam().add(harry);
        player.getHelpTeam().add(hermi);

        Challenges.bimbaChallenge(player);
    }
}
