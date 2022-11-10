package models;

import models.Element;
import models.Image;
import models.Picture;
import models.Visitor;

import java.awt.*;

public class ImageProxy implements Element, Picture {
    private String url;
    private Dimension dim;
    private models.Image realImage;

    public ImageProxy(String Url){
        url = Url;
    }

    @Override
    public void print() {
        loadImage();
        realImage.print();
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

    @Override
    public void accept(Visitor visitor) {
        visitor.visitImageProxy(this);
    }

    @Override
    public String url() {
        return null;
    }

    @Override
    public Dimension dim() {
        return null;
    }

    @Override
    public String content() {
        return null;
    }

    public models.Image loadImage(){
        if(realImage == null){
            realImage = new Image(url);
        }

        return realImage;
    }
}
