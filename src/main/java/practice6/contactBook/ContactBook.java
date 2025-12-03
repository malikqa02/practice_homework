package practice6.contactBook;

import java.util.HashMap;

public class ContactBook {
    // ключ-значение(имя-телефон)
    private HashMap<String, Integer> contacts;

    public ContactBook() {
        this.contacts = new HashMap<>();
    }

    // добавить контакт
    public void addContact(String name, int phone) {
        contacts.put(name, phone);
    }

    // поиск контактов по имени
    public Integer getPhone(String name) {
        return contacts.get(name);
    }

    // обновление по имени
    public void updatePhone(String name, Integer updatedPhone) {
        contacts.put(name, updatedPhone);
    }

    public void printContacts() {
        System.out.println("Все контакты:");
        contacts.forEach(
                (name, phone) -> {
                    System.out.println("имя: " + name + "телефон: " + phone);
                }
        );
        System.out.println();
    }
}
