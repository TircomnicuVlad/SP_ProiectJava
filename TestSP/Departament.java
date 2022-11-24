package TestSP;

import java.util.ArrayList;
import java.util.List;

public class Departament {
    String nume;
    List<Angajat> angajati;
    List<Departament> subDepartamente;

    public Departament(String nume) {
        this.nume = nume;
        this.angajati = new ArrayList<>();
        this.subDepartamente = new ArrayList<>();
    }

    public void addAngajat(Angajat angajat){
        angajati.add(angajat);
    }

    public void addSubDepartament(Departament departament){
        subDepartamente.add(departament);
    }

    public void accept(Visitor visitor){
        for (Departament subDepartament : subDepartamente){
            subDepartament.accept(visitor);
        }
        for (Angajat angajat : angajati){
            angajat.accept(visitor);
        }
    }
}
