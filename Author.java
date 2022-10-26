public class Author {
    String name;
    String surname;

    public Author(String name) {
        this.name = name;
    }

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void print(){
        System.out.println("Author: " + name);
    }
}
