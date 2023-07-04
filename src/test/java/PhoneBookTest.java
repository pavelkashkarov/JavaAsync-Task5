import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {

    @Test
    public void testAdd(){
        int numbersCount = 1;
        PhoneBook phoneBook = new PhoneBook();

        int counter = phoneBook.add();

        assertEquals(numbersCount, counter);

    }
}
