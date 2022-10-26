import java.util.ArrayList;
import java.util.List;

public class Book extends Section{
    List<String> paragraphs;
    List<String>images;
    List<String> tables;
    List<Author> authors;
    List<Chapter> chapters;

    public Book(String Title){
        super(Title);
        this.paragraphs = new ArrayList<>();
        this.images = new ArrayList<>();
        this.tables = new ArrayList<>();
        this.chapters = new ArrayList<>();
        this.authors = new ArrayList<>();
    }

    public Book(String Title, Author Author){
        super(Title);
        this.paragraphs = new ArrayList<>();
        this.images = new ArrayList<>();
        this.tables = new ArrayList<>();
        this.authors.add(Author);
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
        System.out.println("Book: " + title);
        System.out.println();
        System.out.println("Authors: ");
        for(Author i : authors){
            i.print();
        }
        System.out.println();
        super.print();
    }

    public void addAuthor(Author newAuthor){
        authors.add(newAuthor);
    }

    public int createChapter(String newChapter){
        chapters.add(new Chapter(newChapter));
        return chapters.size() - 1;
    }

    public Chapter getChapter(int indexOfChapter){
        return chapters.get(indexOfChapter);
    }

    public void addContent(Element element){
        elements.add(element);
    }
}
