package TestSP;

public class Programator extends Angajat{

    public Programator(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void accept(Visitor visitor){
        visitor.visitProgramator(this);
    }
}
