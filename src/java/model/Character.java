package model;

public class Character {
    private String name;
    private House house;
    private int knowledge;
    private int bravery;
    private int trickery;
    private int friendliness;

    public Character() {
    }

    public Character(String name, House house, int knowledge, int bravery, int trickery, int friendliness) {
        this.name = name;
        this.house = house;
        this.knowledge = knowledge;
        this.bravery = bravery;
        this.trickery = trickery;
        this.friendliness = friendliness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public int getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(int knowledge) {
        this.knowledge = knowledge;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int getTrickery() {
        return trickery;
    }

    public void setTrickery(int trickery) {
        this.trickery = trickery;
    }

    public int getFriendliness() {
        return friendliness;
    }

    public void setFriendliness(int friendliness) {
        this.friendliness = friendliness;
    }
}
