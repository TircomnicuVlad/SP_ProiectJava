package services;

public class AlignRight implements AlignStrategy{

    @Override
    public void render(String paragraph) {
            System.out.println("models.Paragraph:##########" + paragraph);
    }
}
