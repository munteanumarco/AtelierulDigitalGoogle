package oo.ch2;

public class Film {

    private Integer anAparitie;
    private String nume;
    private Actor[] actori;

    public Integer getAnAparitie() {
        return anAparitie;
    }

    public String getNume() {
        return nume;
    }

    public Actor[] getActori() {
        return actori;
    }

    public Film(Integer anAparitie, String nume, Actor[] actori) {
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actori;
    }
}
