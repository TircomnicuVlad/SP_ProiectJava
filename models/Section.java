package models;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element{
    private String title;

    public String getTitle() {
        return title;
    }

    private List<Element> elements = new ArrayList<>();

    public Section(String title){
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println(title);
        for(Element i : elements){
            i.print();
        }
    }

    @Override
    public void add(Element element) {
        elements.add(element);
    }

    @Override
    public void remove(Element element) {
        elements.remove(element);
    }

    @Override
    public Element get(int index) {
        return elements.get(index);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSection(this);
        for(Element e : elements)
            e.accept(visitor);
    }
}
