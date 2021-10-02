package TelephoneDirectory;

/*Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
        В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get()
        искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов
        (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
        */

import java.util.*;

public class TelephoneDirectory {

    public static void main(String args[]) {
        HashMap<String, String> telephoneDirectory = new HashMap<>();
        telephoneDirectory.put("8-952-327-18-16", "Пупкин");
        telephoneDirectory.put("8-322-345-11-99", "Иванов");
        telephoneDirectory.put("8-963-458-12-11", "Иванов");
        telephoneDirectory.put("8-300-333-76-50", "Пупкин");
        telephoneDirectory.put("8-252-991-11-33", "Сидоров");
        telephoneDirectory.put("8-333-989-40-10", "Федоров");
        telephoneDirectory.put("8-789-122-66-44", "Петров");
        add(telephoneDirectory, "8-333-089-11-22", "Иванов");// метод для добавления телефона и фамилии
        for (Map.Entry<String, String> o : telephoneDirectory.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }
        get(telephoneDirectory, "Иванов");// метод вывода номера телефона по фамилии;

    }

    private static void add(HashMap<String, String> directory, String PhoneNumber, String LastName) {
        directory.put(PhoneNumber, LastName);
    }

    private static void get(HashMap<String, String> directory, String LastName) {
        System.out.println("*************");
        System.out.println("Результат поиска телефонных номеров по фамилии " + LastName + ":");

        ArrayList<String> keys = new ArrayList<>(directory.keySet());
        ArrayList<String> values = new ArrayList<>(directory.values());
        for (int i = 0; i < values.size(); i++)
            if (values.get(i).contains(LastName)) {
                System.out.println(keys.get(i));
            }
    }
}





