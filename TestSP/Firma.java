package TestSP;

import java.util.ArrayList;
import java.util.List;

public class Firma {
    String nume;
    List<Departament> departamente;

    public Firma(String nume) {
        this.nume = nume;
        this.departamente = new ArrayList<>();
    }

    public void addDepartament(Departament departament){
        departamente.add(departament);
    }

    public void accept(Visitor visitor){
        for (Departament departament : departamente){
            departament.accept(visitor);
        }
    }

    public void print(){
        System.out.println("Firma: " + nume);
        for(Departament departament : departamente){
            departament.print();
        }
    }
}
