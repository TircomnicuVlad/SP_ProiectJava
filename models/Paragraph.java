package models;

import models.Element;
import services.AlignStrategy;

public class Paragraph implements Element {
    private String text;
    private AlignStrategy textAlignment;

    public Paragraph(String text) {

        this.text = text;
    }

    public void print(){
        if(textAlignment != null) {
            textAlignment.render(text);
        }
        else {
            System.out.println("models.Paragraph: " + text + " ");
        }
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
        visitor.visitParagraph(this);
    }

    public void setAlignStrategy(AlignStrategy strategy){
        textAlignment = strategy;
    }

    public String getText() {
        return text;
    }
}
