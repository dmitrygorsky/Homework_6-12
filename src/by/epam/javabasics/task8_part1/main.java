package by.epam.javabasics.task8_part1;

public class main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Larry","King","ABC123456",987654321,0.00,3.50,1.00);
        BankAccount bankAccount2 = new BankAccount("Larry","King","ABC123456",987654321,0.00,3.50,1.00);
        BankAccount bankAccount3 = new BankAccount("King","Larry","ABC123456",987654321,0.00,3.50,1.00);

        // print true

        System.out.println(bankAccount1.equals(bankAccount2));

        // prints false

        System.out.println(bankAccount1.equals(bankAccount3));

    }
}
