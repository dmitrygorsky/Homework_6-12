package byy.epam.javabasic.task8_part2;

import java.util.*;

public class Check {

    private List<Payment> payments;

    public Check(List<Payment> payments) {
        this.payments = payments;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public static void printCheck(Check check) {

        for (Payment payment : check.getPayments()) {
            System.out.println(payment.toString());
        }

    }

    public static double getCheckPrice(Check check) {

        double result = 0;

        for (Payment payment : check.getPayments()) {
            result += Payment.getTotalPrice(payment);
        }

        return result;

    }

    public static void printCheckAndTotal(Check check) {
        for (Payment payment : check.getPayments()) {
            switch (payment.getTitle()) {
                case "Milk":
                case "Butter":
                    System.out.println(payment.getQty() + " pack(s) of " + payment.getTitle() + ", cost - $" + String.format("%.2f", Payment.getTotalPrice(payment)));
                    break;
                case "Bread":
                    System.out.println(payment.getQty() + " piece(s) of " + payment.getTitle() + ", cost - $" + String.format("%.2f", Payment.getTotalPrice(payment)));
                    break;
                case "Potato":
                case "Apple":
                case "Cheese":
                    System.out.println(payment.getQty() + " kilo(s) of " + payment.getTitle() + ", cost - $" + String.format("%.2f", Payment.getTotalPrice(payment)));
                    break;
                default:
                    System.out.println("Something went wrong...");
                    System.exit(1);
            }
        }

    }

}

