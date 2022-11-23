package oo.ch2;

public class Studio {

    public String getNume() {
        return nume;
    }

    public Film[] getFilme() {
        return filme;
    }

    private String nume;
    private Film[] filme;

    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
    }
}
