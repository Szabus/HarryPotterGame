package model;

public class Player {

    private String name;
    private House house;
    private int score = 20;
    private int knowledge;
    private int bravery;
    private int trickery;
    private int friendliness;
    private boolean hasHermione = false;
    private boolean hasRon = false;
    private boolean hasHarry = false;

    public Player() {
    }

    public void nextRound() {
        if (score > 0) {
            score -= 1;
        } else {
            System.out.println("Professor Quirrell got the sorcerer's stone, Voldemort returned. GAME OVER");
        }
    }

    public String getName() {
        return name;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public int getScore() {

        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setKnowledge(int knowledge) {
        this.knowledge = knowledge;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void setTrickery(int trickery) {
        this.trickery = trickery;
    }

    public void setFriendliness(int friendliness) {
        this.friendliness = friendliness;
    }

    public int getKnowledge() {
        return knowledge;
    }

    public int getBravery() {
        return bravery;
    }

    public int getTrickery() {
        return trickery;
    }

    public int getFriendliness() {
        return friendliness;
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
}
