package model;

public enum House {
    GRYFFINDOR(1),
    RAVENCLAW(2),
    HUFFLEPUFF(3),
    SLYTHERIN(4);

    private int id;

    House(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
