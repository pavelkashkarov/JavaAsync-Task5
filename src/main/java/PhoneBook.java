import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    public static final Map<String, String> phonebook = new HashMap<>();
    public int add(String name, String number){
        if (!phonebook.containsKey(name)) {
            phonebook.put(name, number);
        } else {
            System.out.println("Name already exists!");
        }

        return phonebook.size();
    }
}
