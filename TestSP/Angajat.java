package TestSP;

public abstract class Angajat {
    private String nume;
    private int salariu;

    public Angajat(String nume, int salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    public void accept(Visitor visitor){

    }

    public int getSalariu() {
        return salariu;
    }
}
