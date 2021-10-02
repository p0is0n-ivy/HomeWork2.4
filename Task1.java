import java.util.*;
public class Task1 {
    public static void main(String[] args) {
        String[] arrayPetsNames = {"Barsik", "Barsik", "Barsik", "Bobik", "Murzik", "Tuzik", "Bobik", "Charik", "Barsik", "Rex", "Pushok", "Barsik", "Tuzik", "Bobik"};
        List<String> listPetsNames = new ArrayList<>(Arrays.asList(arrayPetsNames));
        //listPetsNames = Arrays.asList(arrayPetsNames);
        System.out.println("Список, в котором есть повторяющиеся клички животных: " + listPetsNames);
        Set hashSetPetsNames = new HashSet(listPetsNames);
        System.out.println("Список с уникальными кличками животных: " + hashSetPetsNames);
        List<String> uniqueListPetsNames = new ArrayList<String>(hashSetPetsNames);

        System.out.println("******************");
        for (int i = 0; i < uniqueListPetsNames.size(); i++) {
            String a = uniqueListPetsNames.get(i);
            System.out.println("Кол-во повторений " + a + " - " + (Collections.frequency(listPetsNames, a)));
        }
    }
}