import java.util.ArrayList;
import java.util.List;

public class Chapter {
    String name;
    List<SubChapter> subChapters;

    public Chapter(String name) {
        this.name = name;
        subChapters = new ArrayList<>();
    }

    public int createSubChapter(String SubChapterName){
        subChapters.add(new SubChapter(SubChapterName));
        return subChapters.size() - 1;
    }

    public SubChapter getSubChapter(int indexOfSubChapter){
        return subChapters.get(indexOfSubChapter);
    }

    public void print(){
        System.out.println(name);
        for (var i: subChapters) {
            i.print();
        }
        System.out.println();
    }
}
