package models;

import services.ImageLoaderFactory;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture{
    private String url;
    private String ImageContent;

    public String getUrl() {
        return url;
    }

    private ImageLoaderFactory uses;

    public Image(String title) {
        url = title;
        try{
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void print(){
        System.out.println("models.Image with name: " + url + " ");
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
        visitor.visitImage(this);
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
        return  ImageContent;
    }
}
