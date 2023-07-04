import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {

    @Test
    public void testAdd(){
        String number = "+7(903)123-45-88";
        String name = "Vasya";
        PhoneBook phoneBook = new PhoneBook();

        int counter = phoneBook.add(name, number);

        assertEquals(1, counter);

    }

    @Test
    public void testSameNameAdd(){
        String number = "+7(903)123-45-67";
        String name = "Petya";
        String number2 = "+7(903)123-45-77";
        String name2 = "Petya";
        PhoneBook phoneBook = new PhoneBook();

        int counter = phoneBook.add(name, number);
        int counter2 = phoneBook.add(name2, number2);

        assertEquals(counter, counter2);

    }

    @Test
    public void testFindByNumber(){
        PhoneBook phonebook = new PhoneBook();
        String name = "Petya";

        String searchName = phonebook.findByNumber("+7(903)123-45-67");

        assertEquals(name, searchName);
    }
}
