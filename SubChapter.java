import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    String name;
    List<Paragraph> paragraphs;
    List<Image> images;
    List<Table> tables;

    public SubChapter(String name) {
        this.name = name;
        this.paragraphs = new ArrayList<>();
        this.images = new ArrayList<>();
        this.tables = new ArrayList<>();
    }

    public void createNewParagraph(String Paragraph){
        paragraphs.add(new Paragraph(Paragraph));
    }

    public void createNewImage(String imageName){
        images.add(new Image(imageName));
    }

    public void createNewTable(String tableTitle){
        tables.add(new Table(tableTitle));
    }

    public void print(){
        System.out.println(name);
        for (var i: paragraphs) {
            i.print();
        }
        System.out.println();
        for (var i: images) {
            i.print();
        }
        System.out.println();
        for (var i: tables) {
            i.print();
        }
        System.out.println();
    }
}
