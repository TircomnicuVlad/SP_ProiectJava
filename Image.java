public class Image implements Element{
    String imageName;

    public Image(String title) {
        imageName = title;
    }

    public void print(){
        System.out.print(imageName + " ");
    }
}
