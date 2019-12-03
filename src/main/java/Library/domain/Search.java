package Library.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
@Component
public class Search {
    public ArrayList<Book> avaliableBooks = new ArrayList<>();
@Autowired
BookRental bookRental;
    public List<Book> searchRequest() {
        System.out.print("Podaj autora lub tytul ksiazki: ");

        Scanner scanner = new Scanner(System.in);
        String zmienna = scanner.nextLine();
        scanner.close();
        for (Book iterator : bookRental.listOfBooks) {
            if ((iterator.getAuthor().contentEquals(zmienna) || iterator.getTitle().contentEquals(zmienna)) && iterator.isAvaliablity() == true) {
            avaliableBooks.add(iterator);
               // System.out.println(iterator.getAuthor() + " '" + iterator.getTitle() + "' książka jest dostepna");
            } else if ((iterator.getAuthor().contentEquals(zmienna) || iterator.getTitle().contentEquals(zmienna)) && iterator.isAvaliablity() == false) {
               // System.out.println(iterator.getAuthor() + " '" + iterator.getTitle() + "' książka nie jest dostepna");
            }
        }
        if (avaliableBooks.isEmpty()){
            System.out.println("nie ma ksiazek tego autora");}
        return avaliableBooks;
    }
}
