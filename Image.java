public class Image implements Element{
    String url;

    public Image(String title) {
        url = title;
    }

    public void print(){
        System.out.println("Image with name: " + url + " ");
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
}
