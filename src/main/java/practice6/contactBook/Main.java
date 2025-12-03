package practice6.contactBook;

public class Main {
    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();
        contactBook.addContact("Vasya", 799);
        contactBook.addContact("Sanya", 1799);
        contactBook.printContacts();
        contactBook.updatePhone("Sanya", 11111);
        contactBook.printContacts();
    }
}
