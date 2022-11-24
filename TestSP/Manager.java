package TestSP;

public class Manager extends Angajat{


    public Manager(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void accept(Visitor visitor){
        visitor.visitManager(this);
    }
}
