package by.epam.java.task9.store;

public class Issue {

    private String title;
    private int pagesQuantity;
    private double price;

    public Issue(String title, int pagesQuantity, double price) {
        this.title = title;
        this.pagesQuantity = pagesQuantity;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPagesQuantity() {
        return pagesQuantity;
    }

    public void setPagesQuantity(int pagesQuantity) {
        this.pagesQuantity = pagesQuantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (title == null ? 0 : title.hashCode());
        result = prime * result + pagesQuantity;
        result = prime * result + Double.hashCode(price);
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
        Issue other = (Issue) obj;
        if ((this.title == null) ? (other.title != null) : !this.title.equals(other.title)) {
            return false;
        }
        if (pagesQuantity != other.pagesQuantity) {
            return false;
        }
        if (price != other.price) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.title + " " + this.pagesQuantity + " " + this.price;
    }

}
