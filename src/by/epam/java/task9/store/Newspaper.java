package by.epam.java.task9.store;

import java.util.List;

public class Newspaper extends PeriodicalIssue {

    private String spreadType;
    private String colorsUsed;

    public Newspaper(String title, int pagesQuantity, double price, int issuesPerYear, String subject, String format, String editorInChief, String spreadType, String colorsUsed) {

        super(title, pagesQuantity, price, issuesPerYear, subject, format, editorInChief);
        this.spreadType = spreadType;
        this.colorsUsed = colorsUsed;
    }

    public String getSpreadType() {
        return spreadType;
    }

    public void setSpreadType(String spreadType) {
        this.spreadType = spreadType;
    }

    public String getColorsUsed() {
        return colorsUsed;
    }

    public void setColorsUsed(String colorsUsed) {
        this.colorsUsed = colorsUsed;
    }

    // method that converts the quantity of issues oer year into clearer description
    // returns String

    public static String newspaperType(int issuesPerYear) {

        String str;
        if (issuesPerYear == 52) {
            str = "every week";
        } else if (issuesPerYear == 104) {
            str = "twice a week";
        } else if (issuesPerYear == 156) {
            str = "three times a week";
        } else if (issuesPerYear == 208) {
            str = "four times a week";
        } else if (issuesPerYear == 260) {
            str = "five times a week";
        } else {
            str = issuesPerYear + "times a year";
        }
        return str;
    }

    // method that prints Newspaper objects from corresponding List in the list view

    public static void printNews(List<Newspaper> newspapers) {

        System.out.println("TITLE, " + "EDITOR IN CHIEF, " + "SUBJECT, " + "REGION, " + "FORMAT, " + "PRINT COLORS, " + "ISSUED, " + "PAGES, " + "PRICE");
        for (Newspaper newspaper : newspapers) {
            System.out.println(newspaper.getTitle() + ", " + newspaper.getEditorInChief() + ", " + newspaper.getSubject() + ", " + newspaper.getSpreadType() + ", " + newspaper.getFormat() + ", " + newspaper.getColorsUsed() + ", " + Newspaper.newspaperType(newspaper.getIssuesPerYear()) + ", " + newspaper.getPagesQuantity() + ", " + newspaper.getPrice());
        }

    }

    // method that prints Newspaper objects from corresponding List in the formatted table view

    public static void printNewsInTable(List<Newspaper> newspapers) {

        String format = "%-25s %-20s %-30s %-20s %-10s %-20s %-22s %-10s %-10s \n";
        String formatTable = "%-25s %-20s %-30s %-20s %-10s %-20s %-20s %7d %10.2f \n";
        System.out.format(format, "TITLE", "EDITOR IN CHIEF", "SUBJECT", "REGION", "FORMAT", "PRINT COLORS", "ISSUED", "PAGES", "PRICE");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        for (Newspaper newspaper : newspapers) {
            System.out.format(formatTable, newspaper.getTitle(),newspaper.getEditorInChief(),newspaper.getSubject(),newspaper.getSpreadType(),newspaper.getFormat(),newspaper.getColorsUsed(),Newspaper.newspaperType(newspaper.getIssuesPerYear()),newspaper.getPagesQuantity(),newspaper.getPrice());
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }

    }

}
