package TestSP;

public interface Visitor {
    public void visitManager(Manager manager);
    public void visitProgramator(Programator programator);
    public void visitTester(Tester tester);
    public void print();
}
