package Library.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Book {
    public String author;
    public String title;
    boolean avaliablity = true;

    public Book(String author, String title, boolean avaliablity) {
        this.author = author;
        this.title = title;
        this.avaliablity = avaliablity;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" + "author='" + author + '\'' + ", title='" + title + '\'' + ", avaliablity=" + avaliablity + '}';
    }

    @Autowired
    public String getAuthor() {
        return author;
    }

    @Autowired
    public void setAuthor(String author) {
        this.author = author;
    }

    @Autowired
    public String getTitle() {
        return title;
    }

    @Autowired
    public void setTitle(String title) {
        this.title = title;
    }

 //   @Autowired
    public boolean isAvaliablity() {
        return avaliablity;
    }

   // @Autowired
    public void setAvaliablity(boolean avaliablity) {
        this.avaliablity = avaliablity;
    }

}
