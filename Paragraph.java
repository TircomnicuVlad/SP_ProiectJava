public class Paragraph implements Element{
    String text;

    public Paragraph(String text) {

        this.text = text;
    }

    public void print(){
        System.out.print(text + " ");
    }
}
