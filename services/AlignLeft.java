package services;

public class AlignLeft implements AlignStrategy{

    @Override
    public void render(String paragraph) {
        System.out.println("models.Paragraph: " + paragraph + " ");
    }
}
