package Library;

import Library.domain.Book;
import Library.domain.BookRental;
import Library.domain.Search;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AvaliabilityTest {

    @Test
public void aviabilityGombrowiczBooks(){

        Book book=new Book("Gombrowicz","Ferdydurke",false);
        String expectedValue="Book{author='Gombrowicz', title='Ferdydurke', avaliablity=false}";
        assertEquals(expectedValue,book.toString());
}
}
