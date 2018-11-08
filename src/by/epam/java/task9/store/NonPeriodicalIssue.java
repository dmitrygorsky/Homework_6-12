package by.epam.java.task9.store;

public abstract class NonPeriodicalIssue extends Issue {

    private String author;
    private int yearPublished;

    public NonPeriodicalIssue(String title, int pagesQuantity, double price, String author, int yearPublished) {

        super(title, pagesQuantity, price);
        this.author = author;
        this.yearPublished = yearPublished;

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
}
