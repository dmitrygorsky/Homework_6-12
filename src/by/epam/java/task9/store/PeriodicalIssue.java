package by.epam.java.task9.store;

public abstract class PeriodicalIssue extends Issue {

    private int issuesPerYear;
    private String subject;
    private String format;
    private String editorInChief;

    public PeriodicalIssue(String title, int pagesQuantity, double price, int issuesPerYear, String subject, String format, String editorInChief) {

        super(title, pagesQuantity, price);
        this.issuesPerYear = issuesPerYear;
        this.subject = subject;
        this.format = format;
        this.editorInChief = editorInChief;

    }

    public int getIssuesPerYear() {
        return issuesPerYear;
    }

    public void setIssuesPerYear(int issuesPerYear) {
        this.issuesPerYear = issuesPerYear;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getEditorInChief() {
        return editorInChief;
    }

    public void setEditorInChief(String editorInChief) {
        this.editorInChief = editorInChief;
    }

}

