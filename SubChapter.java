import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    String name;
    List<Element> elements;

    public SubChapter(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void createNewParagraph(String Paragraph){
        elements.add(new Paragraph(Paragraph));
    }

    public void createNewImage(String imageName){
        elements.add(new Image(imageName));
    }

    public void createNewTable(String tableTitle){
        elements.add(new Table(tableTitle));
    }

    public void print(){
        System.out.println(name);
        for (var i: elements) {
            i.print();
        }
        System.out.println();
    }
}
