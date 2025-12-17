package practice_homework6.exceptions.task4;

public class Validator {
    public void validateAddresses (String address) throws validateAddress {
        if (address.equals("example")) {
            System.out.println("адрес совпадает");
        } else {
            throw new validateAddress("неверный адрес");
        }
    }
}
