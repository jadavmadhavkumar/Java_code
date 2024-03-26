import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConverter {
    public static void main(String[] args) {
        // Convert List to Array
        List<String> languagesList = new ArrayList<>();
        languagesList.add("Java");
        languagesList.add("Python");
        languagesList.add("JavaScript");

        String[] languagesArray = new String[languagesList.size()];
        languagesList.toArray(languagesArray);

        System.out.println("List: " + languagesList);
        System.out.println("Array: " + Arrays.toString(languagesArray));

        // Convert Array to List
        String[] techArray = {"Java", "Python", "C"};
        List<String> techList = new ArrayList<>(Arrays.asList(techArray));

        System.out.println("Array: " + Arrays.toString(techArray));
        System.out.println("List: " + techList);
    }
}

