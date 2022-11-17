package services;

import models.*;

public class TableOfContentsVisitor implements Visitor {

    TableOfContents tableOfContents = new TableOfContents();
    int iterator = 1;
    @Override
    public void visitBook(Book book) {

    }

    public TableOfContents getTableOfContents() {
        return tableOfContents;
    }

    @Override
    public void visitSection(Section section) {
        tableOfContents.add(section.getTitle(), iterator);
    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {

    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        iterator++;
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        iterator++;
    }

    @Override
    public void visitImage(Image image) {
        iterator++;
    }

    @Override
    public void visitTable(Table table) {

        iterator++;
    }
}
