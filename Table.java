public class Table implements Element{
    String title;

    public Table(String title) {
        this.title = title;
    }

    public void print(){
        System.out.print(title + " ");
    }
}
