package Library.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookRental {

    public ArrayList<Book> listOfBooks=new ArrayList<>();

    public List<Book> addBooks() {
        listOfBooks.add(new Book("Adam Mickiewicz","Dziady",true));
        listOfBooks.add(new Book("Adam Mickiewicz","Pan Tadeusz",true));
        listOfBooks.add(new Book("Henryk Sienkiewicz","Quo Vadis",true));
        listOfBooks.add(new Book("Remigiusz Mróz","Kasacja",true));
        listOfBooks.add(new Book("Remigiusz Mróz","Rewizja",false));
        listOfBooks.add(new Book("Gombrowicz","Ferdydurke",false));
        listOfBooks.add(new Book("Jan Kochanowski","Na zdrowie",false));
        for (Book iterator:listOfBooks) {
          //System.out.println("autor: "+iterator.author+ " tytul: "+iterator.title+ " dostepnosc: "+iterator.avaliablity);
        }
        return listOfBooks;
    }

    @Override
    public String toString() {
        return "BookRental{" + "listOfBooks=" + addBooks() + '}';
    }
}
