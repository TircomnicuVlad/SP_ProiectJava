import java.util.ArrayList;
import java.util.List;

public class Book {
    String Title;
    List<String> Paragraphs;
    List<String> Images;
    List<String> Tables;

    public Book(String Title){
        this.Title = Title;
        this.Paragraphs = new ArrayList<>();
        this.Images = new ArrayList<>();
        this.Tables = new ArrayList<>();
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public List<String> getTables() {
        return Tables;
    }

    public void setTables(List<String> tables) {
        Tables = tables;
    }

    public List<String> getParagraphs() {
        return Paragraphs;
    }

    public void setParagraphs(List<String> paragraphs) {
        Paragraphs = paragraphs;
    }

    public List<String> getImages() {
        return Images;
    }

    public void setImages(List<String> images) {
        Images = images;
    }

    public void createNewParagraph(String newParagraph){
        Paragraphs.add(newParagraph);
    }

    public void createNewImage(String newImageSrc){
        Images.add(newImageSrc);
    }

    public void createNewTable(String newTable){
        Tables.add(newTable);
    }

    @Override
    public String toString() {
        return "Book{" +
                "Title='" + Title + '\'' +
                ", Paragraphs=" + Paragraphs +
                ", Images=" + Images +
                ", Tables=" + Tables +
                '}';
    }

    public void print(){
        System.out.print(this.toString());
    }
}
