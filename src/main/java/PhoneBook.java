import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

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

    public Set<String> findByNumber(String number){
        return phonebook
                .entrySet()
                .stream()
                .filter(entry -> Objects.equals(entry.getValue(), number))
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }

    public String findByName(String name){
        return phonebook.get(name);
    }
}
