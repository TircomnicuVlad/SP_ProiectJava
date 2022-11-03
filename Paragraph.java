public class Paragraph implements Element{
    private String text;
    private AlignStrategy textAlignment;

    public Paragraph(String text) {

        this.text = text;
    }

    public void print(){
        if(textAlignment != null) {
            textAlignment.render(this);
        }
        else {
            System.out.println("Paragraph: " + text + " ");
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

    public void setAlignStrategy(AlignStrategy strategy){
        textAlignment = strategy;
    }

    public String getText() {
        return text;
    }
}
