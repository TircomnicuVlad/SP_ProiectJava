package models;

public class Table implements Element{
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public void print(){
        System.out.println(title + " ");
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int index) {
        return null;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTable(this);
    }
}
