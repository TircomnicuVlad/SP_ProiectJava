package services;

public class AlignCenter implements AlignStrategy{

    @Override
    public void render(String paragraph) {
        System.out.println("models.Paragraph:#####" + paragraph);
    }
}
