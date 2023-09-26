package HW.hwsem5;

import java.util.*;

public class PhoneBook {
    private final Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }


    public void addContact(String name, String phoneNumber) {
        if (phoneBook.containsKey(name)) {
            List<String> phoneNumbers = phoneBook.get(name);
            phoneNumbers.add(phoneNumber);
        } else {
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            phoneBook.put(name, phoneNumbers);
        }
    }

    public void printSortedContacts() {
        List<Map.Entry<String, List<String>>> sortedEntries = new ArrayList<>(phoneBook.entrySet());
        sortedEntries.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));

        for (Map.Entry<String, List<String>> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите имя (или 'q' для выхода): ");
            String name = scanner.nextLine();
            if ("q".equals(name)) {
                break;
            }

            System.out.println("Введите номер телефона: ");
            String phoneNumber = scanner.nextLine();

            phoneBook.addContact(name, phoneNumber);
        }

        System.out.println("Телефонная книга:");
        phoneBook.printSortedContacts();
    }
}
