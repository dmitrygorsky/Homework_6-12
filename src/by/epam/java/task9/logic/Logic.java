package by.epam.java.task9.logic;

import by.epam.java.task9.store.*;

import java.util.*;

public class Logic {

    // method that a specific object - Book or Newspaper
    // based on List of Strings
    // returns a Set of Issues

    public static Set<Issue> getIssuesFromLib(List<String> lib) {
        StringTokenizer stz;

        String title = "";
        String author = "";
        String genre = "";
        int yearPublished = 0;
        int pagesQuantity = 0;
        String series = "";
        String partNumber = "";
        double price = 0;

        String title_news = "";
        int pagesQuantity_news = 0;
        double price_news = 0;
        int issuesPerYear = 0;
        String subject = "";
        String format = "";
        String editorInChief = "";
        String spreadType = "";
        String colorsUsed = "";

        Set<Issue> issues = new HashSet<>();

        for (int i = 0; i < lib.size(); i += 2) {
            if (lib.get(i).equals("Book")) {
                stz = new StringTokenizer(lib.get(i + 1), ",");
                while (stz.hasMoreTokens()) {
                    title = stz.nextToken();
                    author = stz.nextToken();
                    genre = stz.nextToken();
                    yearPublished = Integer.parseInt(stz.nextToken());
                    pagesQuantity = Integer.parseInt(stz.nextToken());
                    series = stz.nextToken();
                    partNumber = stz.nextToken();
                    price = Double.parseDouble(stz.nextToken());
                }
                Book book = new Book(title, pagesQuantity, price, author, yearPublished, series, partNumber, genre);
                issues.add(book);
            } else if (lib.get(i).equals("Newspaper")) {
                stz = new StringTokenizer(lib.get(i + 1), ",");
                while (stz.hasMoreTokens()) {
                    title_news = stz.nextToken();
                    pagesQuantity_news = Integer.parseInt(stz.nextToken());
                    price_news = Double.parseDouble(stz.nextToken());
                    issuesPerYear = Integer.parseInt(stz.nextToken());
                    subject = stz.nextToken();
                    format = stz.nextToken();
                    editorInChief = stz.nextToken();
                    spreadType = stz.nextToken();
                    colorsUsed = stz.nextToken();
                }
                Newspaper newspaper = new Newspaper(title_news, pagesQuantity_news, price_news, issuesPerYear, subject, format, editorInChief, spreadType, colorsUsed);
                issues.add(newspaper);
            }
        }

        return issues;

    }

    // method that takes objects of Book class from List of NonPeriodicalIssues
    // and puts them into List of Books

    public static List<Book> getBooksFromIssues(List<NonPeriodicalIssue> nonPeriodicalIssues) {
        List<Book> books = new ArrayList<>();
        for (NonPeriodicalIssue issue : nonPeriodicalIssues) {
            if (issue instanceof Book) {
                books.add((Book) issue);
            }
        }
        return books;
    }

    // method that takes objects of Newspaper class from List of PeriodicalIssues
    // and puts them into List of Newspapers

    public static List<Newspaper> getNewsFromIssues(List<PeriodicalIssue> periodicalIssues) {
        List<Newspaper> newspapers = new ArrayList<>();
        for (PeriodicalIssue issue : periodicalIssues) {
            if (issue instanceof Newspaper) {
                newspapers.add((Newspaper) issue);
            }
        }
        return newspapers;
    }

    // method that takes objects of PeriodicalIssue class from Set of Issues
    // and puts them into List of PeriodicalIssues

    public static List<PeriodicalIssue> getPeriodicalFromIssues(Set<Issue> issues) {
        List<PeriodicalIssue> periodicalIssues = new ArrayList<>();
        List<Issue> issuesList = new ArrayList<>(issues);
        for (Issue anIssuesList : issuesList) {
            if (anIssuesList instanceof PeriodicalIssue) {
                periodicalIssues.add((PeriodicalIssue) anIssuesList);
            }
        }
        return periodicalIssues;
    }

    // method that takes objects of NonPeriodicalIssue class from Set of Issues
    // and puts them into List of NonPeriodicalIssues

    public static List<NonPeriodicalIssue> getNonPeriodicalFromIssues(Set<Issue> issues) {
        List<NonPeriodicalIssue> nonPeriodicalIssues = new ArrayList<>();
        List<Issue> issuesList = new ArrayList<>(issues);
        for (Issue anIssuesList : issuesList) {
            if (anIssuesList instanceof NonPeriodicalIssue) {
                nonPeriodicalIssues.add((NonPeriodicalIssue) anIssuesList);
            }
        }
        return nonPeriodicalIssues;
    }

    // method that lets user enter a value of int type and
    // throws error message if value of any other type is entered
    // returns entered int value

    public static int enterNumber() {

        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()) {

            System.out.println("Invalid number! Try again");
            System.out.print("> ");
            scanner.next();

        }

        return scanner.nextInt();

    }

    // method that checks given value against given List size
    // if value is bigger or less than List size, throws error message
    // returns int value

    public static int validNumber(int i, List<String> list) {

        while (i < 0 || i > list.size() - 1) {

            System.out.println("Invalid number! Try again");
            System.out.print("> ");
            i = Logic.enterNumber();

        }

        return i;

    }

    // method that takes given List of Strings and prints each option in one line

    public static void printAll(List<String> list, String msg) {
        System.out.print("Please select " + msg + ": press ");

        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print("and " + i + " for " + list.get(i) + "\n");
                return;
            }

            System.out.print(i + " for " + list.get(i) + ", ");
        }
    }

    // method that creates object of certain Comparator that accepts Book objects based on given value of int type
    // returns Comparator object

    public static Comparator<Book> getBookComparator(int i) {
        Comparator comp = null;
        switch(i) {
            case 0:
                comp = new YearComp();
                break;
            case 1:
                comp = new PriceComp();
                break;
            case 2:
                comp = new PagesComp();
                break;
            case 3:
                comp = new PartComp();
                break;
            default:
                System.out.println("Something went wrong...");
                System.exit(1);
        }
        return comp;
    }

    // method that creates object of certain Comparator that accepts Newspaper objects based on given value of int type
    // returns Comparator object

    public static Comparator<Book> getNewsComparator(int i) {
        Comparator comp = null;
        switch(i) {
            case 0:
                comp = new TitleNewsComp();
                break;
            case 1:
                comp = new PriceNewsComp();
                break;
            case 2:
                comp = new PagesNewsComp();
                break;
            default:
                System.out.println("Something went wrong...");
                System.exit(1);
        }
        return comp;
    }


}
