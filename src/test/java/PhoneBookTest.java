import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {

    @Test
    public void testAdd(){
        String number = "+7(903)123-45-88";
        String name = "Vasya";
        PhoneBook phonebook = new PhoneBook();

        int counter = phonebook.add(name, number);

        assertEquals(2, counter);

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
        PhoneBook phoneBook = new PhoneBook();
        String number = "+7(903)123-45-67";
        String name = "Petya";
        phoneBook.add(name, number);
        Set<String> names = new HashSet<>();
        names.add("Petya");

        Set<String> searchName = phoneBook.findByNumber("+7(903)123-45-67");

        assertEquals(names, searchName);
    }

    @Test
    public void findByName(){
        PhoneBook phoneBook = new PhoneBook();

        String number = phoneBook.findByName("Petya");

        assertEquals("+7(903)123-45-67", number);
    }
}
