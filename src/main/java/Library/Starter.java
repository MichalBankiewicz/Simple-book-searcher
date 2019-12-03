package Library;

import Library.domain.Book;
import Library.domain.BookRental;
import Library.domain.Search;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Starter implements CommandLineRunner {

    @Autowired
    BookRental bookRental;
    @Autowired
    Search search;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(bookRental.addBooks());
        System.out.println(search.searchRequest());
//        System.out.print("Podaj autora lub tytul ksiazki: ");
//
//        Scanner scanner = new Scanner(System.in);
//        String zmienna = scanner.nextLine();
//        scanner.close();
//        for (Book iterator : bookRental.listOfBooks) {
//            if ((iterator.getAuthor().contentEquals(zmienna) || iterator.getTitle().contentEquals(zmienna)) && iterator.isAvaliablity() == true) {
//
//                System.out.println(iterator.getAuthor()+" '"+iterator.getTitle()+ "' książka jest dostepna");
//            } else if ((iterator.getAuthor().contentEquals(zmienna) || iterator.getTitle().contentEquals(zmienna)) && iterator.isAvaliablity() == false) {
//                System.out.println(iterator.getAuthor()+" '"+iterator.getTitle()+ "' książka nie jest dostepna");
//            }
        }
    }

