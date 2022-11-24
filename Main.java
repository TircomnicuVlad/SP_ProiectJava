import TestSP.*;
import TestSP.Visitor;
import models.*;
import services.*;

public class Main {

    public static void main(String[] args) throws Exception{
        Firma a = new Firma("Nokia");
        Departament d = new Departament("5G");
        d.addAngajat(new Manager("Sefu", 10000));
        d.addAngajat(new Programator("Cel bun", 15000));
        d.addAngajat(new Programator("Incepator", 4500));
        a.addDepartament(d);
        Visitor calculSalariu = new VisitorSalariu();
        a.accept(calculSalariu);
        calculSalariu.print();
        a.print();
    }
}
