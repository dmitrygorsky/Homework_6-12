package byy.epam.javabasic.task8_part2;

public class Payment {

    private String title;
    private int qty;
    private double priceForPiece;

    public Payment(String title, int qty, double priceForPiece) {
        this.title = title;
        this.qty = qty;
        this.priceForPiece = priceForPiece;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPriceForPiece() {
        return priceForPiece;
    }

    public void setPriceForPiece(double priceForPiece) {
        this.priceForPiece = priceForPiece;
    }

    public static double getTotalPrice(Payment payment) {
        return payment.getQty() * payment.getPriceForPiece();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (title == null ? 0 : title.hashCode());
        result = prime * result + qty;
        result = prime * result + Double.hashCode(priceForPiece);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Payment other = (Payment) obj;
        if ((this.title == null) ? (other.title != null) : !this.title.equals(other.title)) {
            return false;
        }
        if (qty != other.qty) {
            return false;
        }
        if (priceForPiece != other.priceForPiece) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Quantity - " + this.qty + ", title - " + this.title + ", cost - $" + Payment.getTotalPrice(this);
    }
}
