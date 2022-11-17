package models;

import java.util.ArrayList;
import java.util.List;

public class TableOfContents implements Element{
    private List<String> something = new ArrayList<String>();

    public TableOfContents(){}

    @Override
    public void print() {
        for (String i : something) {
            System.out.println(i);
        }
    }

    @Override
    public void add(Element element) {

    }

    public void add(String element, int page) {
        something.add(element + " pag." + Integer.toString(page));
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
        visitor.visitTableOfContents(this);
    }
}
