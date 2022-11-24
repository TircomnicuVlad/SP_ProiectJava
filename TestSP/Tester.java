package TestSP;

public class Tester extends Angajat{

    public Tester(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void accept(Visitor visitor){
        visitor.visitTester(this);
    }
}
