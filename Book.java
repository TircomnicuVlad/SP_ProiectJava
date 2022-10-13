import java.util.ArrayList;
import java.util.List;

public class Book {
    String title;
    List<String> paragraphs;
    List<String>images;
    List<String> tables;
    Author authorOfBook;
    List<Chapter> chapters;

    public Book(String Title){
        this.title = Title;
        this.paragraphs = new ArrayList<>();
        this.images = new ArrayList<>();
        this.tables = new ArrayList<>();
        this.chapters = new ArrayList<>();
    }

    public Book(String Title, Author Author){
        this.title = Title;
        this.paragraphs = new ArrayList<>();
        this.images = new ArrayList<>();
        this.tables = new ArrayList<>();
        this.authorOfBook = Author;
    }

    public void createNewParagraph(String newParagraph){
        paragraphs.add(newParagraph);
    }

    public void createNewImage(String newImageSrc){
        images.add(newImageSrc);
    }

    public void createNewTable(String newTable){
        tables.add(newTable);
    }

    public void print(){

        System.out.println(title + " by ");
        authorOfBook.print();
        for (var i: chapters) {
            i.print();
        }
        System.out.println();
    }

    public void addAuthor(Author newAuthor){
        authorOfBook = newAuthor;
    }

    public int createChapter(String newChapter){
        chapters.add(new Chapter(newChapter));
        return chapters.size() - 1;
    }

    public Chapter getChapter(int indexOfChapter){
        return chapters.get(indexOfChapter);
    }
}
