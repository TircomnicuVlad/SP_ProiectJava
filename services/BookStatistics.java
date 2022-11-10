package services;

import models.*;

public class BookStatistics implements Visitor{

    private int paragraph = 0;
    private int image = 0;
    private int table = 0;

    @Override
    public void visitBook(Book book) {

    }

    @Override
    public void visitSection(Section section) {

    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {

    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        this.paragraph++;
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        this.image++;
    }

    @Override
    public void visitImage(Image image) {
        this.image++;
    }

    @Override
    public void visitTable(Table table) {
        this.table++;
    }

    public void printStatistics(){
        System.out.println("Book Statistics:");
        if(this.image > 0){
            System.out.println("*** Number of images: " + image);
        }
        if(this.table > 0){
            System.out.println("*** Number of tables: " + table);
        }
        if(this.paragraph > 0){
            System.out.println("*** Number of paragraphs: " + paragraph);
        }
    }
}
