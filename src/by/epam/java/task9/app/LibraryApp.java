package by.epam.java.task9.app;

import by.epam.java.task9.logic.Logic;
import by.epam.java.task9.store.*;

import java.io.*;
import java.util.*;

public class LibraryApp {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        BufferedReader br;
        StringTokenizer st;
        String type;
        String issue;
        int sorting;
        int author;
        int issueType;
        boolean b = true;
        String selectedAuthor;
        List<String> lib = new ArrayList<>();
        Set<String> authors;
        Comparator comp;
        String[] sortingOptions = {"sorting by year", "sorting by price", "sorting by pages quantity", "sorting by part number"};
        String[] sortingNewsOptions = {"sorting by title", "sorting by price", "sorting by pages quantity"};
        String[] availableIssues = {"Non-periodical issues", "Periodical issues"};
        Set<Issue> issues;
        List<PeriodicalIssue> periodicalIssues;
        List<NonPeriodicalIssue> nonPeriodicalIssues;
        List<Book> books;
        List<Newspaper> newspapers;


        System.out.println("WELCOME TO OUR BOOK STORE!\n");

        while (b) {
            try {
                File libraryContents = new File("./Lib.txt");

                br = new BufferedReader(new FileReader(libraryContents));
                String text;
                while ((text = br.readLine()) != null) {

                    st = new StringTokenizer(text, "\t");

                    while (st.hasMoreTokens()) {
                        type = st.nextToken();
                        issue = st.nextToken();
                        lib.add(type);
                        lib.add(issue);
                    }

                }

                issues = Logic.getIssuesFromLib(lib);

                Logic.printAll(Arrays.asList(availableIssues), "issue type");
                System.out.print("> ");
                issueType = Logic.validNumber(Logic.enterNumber(), Arrays.asList(availableIssues));

                if (issueType == 0) {
                    nonPeriodicalIssues = Logic.getNonPeriodicalFromIssues(issues);
                    books = Logic.getBooksFromIssues(nonPeriodicalIssues);

                    authors = Book.getAllAuthors(books);
                    List<String> allAuthors = new ArrayList<>(authors);
                    Logic.printAll(allAuthors, "an author");
                    System.out.print("> ");
                    author = Logic.validNumber(Logic.enterNumber(), allAuthors);
                    selectedAuthor = allAuthors.get(author);

                    Logic.printAll(Arrays.asList(sortingOptions), "a sorting option");
                    System.out.print("> ");
                    sorting = Logic.validNumber(Logic.enterNumber(), Arrays.asList(sortingOptions));

                    System.out.println("\nHERE'S WHAT WE'VE GOT!\n");

                    comp = Logic.getBookComparator(sorting);
                    books = Book.selectBooksByAuthor(books, selectedAuthor);
                    Collections.sort(books, comp);
                    Book.printBooksInTable(books);
                } else if (issueType == 1) {
                    periodicalIssues = Logic.getPeriodicalFromIssues(issues);
                    newspapers = Logic.getNewsFromIssues(periodicalIssues);

                    Logic.printAll(Arrays.asList(sortingNewsOptions), "a sorting option");
                    System.out.print("> ");
                    sorting = Logic.validNumber(Logic.enterNumber(), Arrays.asList(sortingNewsOptions));

                    System.out.println("\nHERE'S WHAT WE'VE GOT!\n");

                    comp = Logic.getNewsComparator(sorting);
                    Collections.sort(newspapers, comp);
                    Newspaper.printNewsInTable(newspapers);
                }

                System.out.println("\nWould you like to browse more authors? Y / N");
                if (!scanner.next().equalsIgnoreCase("y")) {
                    System.out.println("\nTHANK YOU FOR SHOPPING WITH US!");
                    b = false;
                }

            } catch (IOException e) {
                e.getMessage();
            }
        }
    }

}
