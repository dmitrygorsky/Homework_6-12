package byy.epam.javabasic.task8_part2;

import java.util.ArrayList;
import java.util.List;

public class PaymentApp {

    public static void main(String[] args) {
        Payment moloko = new Payment("Milk", 2, 0.72);
        Payment hleb = new Payment("Bread", 1, 0.55);
        Payment maslo = new Payment("Butter", 1, 1.56);
        Payment kartofel = new Payment("Potato", 10, 0.59);
        Payment yabloki = new Payment("Apple", 2, 1.37);
        Payment syr = new Payment("Cheese", 1, 5.04);

        List<Payment> payments = new ArrayList<>();

        payments.add(moloko);
        payments.add(hleb);
        payments.add(maslo);
        payments.add(kartofel);
        payments.add(yabloki);
        payments.add(syr);

        Check check = new Check(payments);

        System.out.println("Here's your check\n");
        Check.printCheckAndTotal(check);
        System.out.println("------------------------------------");
        System.out.println("Total - $" + String.format("%.2f", Check.getCheckPrice(check)));
        System.out.println("\nThank you for shopping with us!");

    }
}
