package by.epam.java.task9.store;

import java.util.*;

public class Book extends NonPeriodicalIssue {

    private String series;
    private String partNumber;
    private String genre;

    public Book(String title, int pagesQuantity, double price, String author, int yearPublished, String series, String partNumber, String genre) {

        super(title, pagesQuantity, price, author, yearPublished);
        this.series = series;
        this.partNumber = partNumber;
        this.genre = genre;

    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // method that prints Book objects from corresponding List in the list view

    public static void printBooks(List<Book> books) {
        System.out.println("AUTHOR, " + "TITLE, " + "GENRE, " + "SERIES (if any), " + "PART (if any), " + "PAGES, " + "YEAR, " + "PRICE");

        for (Book book : books) {
            System.out.println(book.getTitle() + ", " + book.getAuthor() + ", " + book.getGenre() + ", " + book.getSeries() + ", " + book.getPartNumber() + ", " + book.getPagesQuantity() + ", " + book.getYearPublished() + ", " + book.getPrice());
        }

    }

    // method that prints Book objects from corresponding List in the formatted table view

    public static void printBooksInTable(List<Book> books) {

        String format = "%-17s %-45s %-15s %-30s %-12s %-10s %-8s %-8s \n";
        String formatTable = "%-17s %-45s %-15s %-25s %9s %13d %9d %9.2f \n";
        System.out.format(format, "AUTHOR", "TITLE", "GENRE", "SERIES", "PART", "PAGES", "YEAR", "PRICE");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");

        for (Book book : books) {
            System.out.format(formatTable, book.getAuthor(), book.getTitle(), book.getGenre(), book.getSeries(), book.getPartNumber(), book.getPagesQuantity(), book.getYearPublished(), book.getPrice());
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        }

    }

    // method that takes given List of Books and author name, and puts Books of a certain author into List of Books

    public static List<Book> selectBooksByAuthor(List<Book> books, String author) {
        List<Book> selectedBooks = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().equals(author)) {
                selectedBooks.add(books.get(i));
            }
        }
        return selectedBooks;
    }

    // method that takes given List of Books, takes author name from each object and puts them into Set of Strings

    public static Set<String> getAllAuthors(List<Book> books) {
        Set<String> allAuthors = new HashSet<>();
        for (Book book : books) {
            allAuthors.add(book.getAuthor());
        }
        return allAuthors;
    }


}