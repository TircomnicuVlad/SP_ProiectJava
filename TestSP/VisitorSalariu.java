package TestSP;

public class VisitorSalariu implements Visitor{
    int managerTotal = 0;
    int programatorTotal = 0;
    int testerTotal = 0;
    int total = 0;

    @Override
    public void visitManager(Manager manager) {
        managerTotal += manager.getSalariu();
        total += manager.getSalariu();
    }

    @Override
    public void visitProgramator(Programator programator) {
        programatorTotal += programator.getSalariu();
        total += programator.getSalariu();
    }

    @Override
    public void visitTester(Tester tester) {
        testerTotal += tester.getSalariu();
        total += tester.getSalariu();
    }

    @Override
    public void print(){
        System.out.println("Salariu total: " + total);
        System.out.println("Salariu total Manageri: " + managerTotal);
        System.out.println("Salariu total Programatori: " + programatorTotal);
        System.out.println("Salariu total Testeri: " + testerTotal);
        System.out.println();
    }
}
