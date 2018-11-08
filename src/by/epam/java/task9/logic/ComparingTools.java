package by.epam.java.task9.logic;

import by.epam.java.task9.store.*;

import java.util.Comparator;

class PriceComp implements Comparator<Book> {
    public int compare(Book p1, Book p2) {
        return Double.compare(p1.getPrice(), p2.getPrice());
    }
}

class PartComp implements Comparator<Book> {
    public int compare(Book p1, Book p2) {
        return Integer.compare(Integer.parseInt(p1.getPartNumber()), Integer.parseInt(p2.getPartNumber()));
    }
}

class YearComp implements Comparator<Book> {
    public int compare(Book p1, Book p2) {
        return Integer.compare(p1.getYearPublished(), p2.getYearPublished());
    }
}

class PagesComp implements Comparator<Book> {
    public int compare(Book p1, Book p2) {
        return Integer.compare(p1.getPagesQuantity(), p2.getPagesQuantity());
    }
}

class TitleNewsComp implements Comparator<Newspaper> {
    public int compare(Newspaper n1, Newspaper n2) {
        return n1.getTitle().compareTo(n2.getTitle());
    }

}

class PriceNewsComp implements Comparator<Newspaper> {
    public int compare(Newspaper n1, Newspaper n2) {
        return Double.compare(n1.getPrice(), n2.getPrice());
    }
}

class PagesNewsComp implements Comparator<Newspaper> {
    public int compare(Newspaper n1, Newspaper n2) {
        return Integer.compare(n1.getPagesQuantity(), n2.getPagesQuantity());
    }
}

