package model;

import java.util.ArrayList;
import java.util.List;

public class Player extends Character{


    private int score = 20;

    private boolean hasHermione = false;
    private boolean hasRon = false;
    private boolean hasHarry = false;

    private List<Character>helpTeam;

    public Player(String name, House house, int knowledge, int bravery, int trickery, int friendliness,
                  int score, boolean hasHermione, boolean hasRon, boolean hasHarry) {
        super(name, house, knowledge, bravery, trickery, friendliness);
        this.score = score;
        this.hasHermione = hasHermione;
        this.hasRon = hasRon;
        this.hasHarry = hasHarry;
    }

    public Player() {
        helpTeam = new ArrayList<>();
    }

    public void nextRound() {
        if (score > 0) {
            score -= 1;
        } else {
            System.out.println("Professor Quirrell got the sorcerer's stone, Voldemort returned. GAME OVER");
        }
    }







    public int getScore() {

        return score;
    }


    public void setScore(int score) {
        this.score = score;
    }



    public boolean isHasHermione() {
        return hasHermione;
    }

    public void setHasHermione(boolean hasHermione) {
        this.hasHermione = hasHermione;
    }

    public boolean isHasRon() {
        return hasRon;
    }

    public void setHasRon(boolean hasRon) {
        this.hasRon = hasRon;
    }

    public boolean isHasHarry() {
        return hasHarry;
    }

    public void setHasHarry(boolean hasHarry) {
        this.hasHarry = hasHarry;
    }

    public List<Character> getHelpTeam() {
        return helpTeam;
    }

    public void setHelpTeam(List<Character> helpTeam) {
        this.helpTeam = helpTeam;
    }
}
