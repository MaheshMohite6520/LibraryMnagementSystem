// Library Management System Program

class Library
{
    String[] books;
    int no_of_books;
    Library()
    {
        this.books = new String[100];
        this.no_of_books=0;
    }
    void addBook(String book)
    {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+ " has been added!");
    }
    void showAvailableBooks()
    {
        System.out.println("\n* The available books are: ");
        for (String book: this.books)
        {
            if (book == null)
            {
                continue;
            }
            System.out.println(book);
        }
    }
    void issueBook(String book)
    {
        for (int i=0; i<this.books.length; i++)
        {
            if (this.books[i].equals(book))
            {
                System.out.println();
                System.out.println("*Issued Books: ");
                System.out.println(book+ " book has been issued already." );
                this.books[i] = null;
                return;
            }
        }

        System.out.println("This book doesn't exist.");
    }
    void returnBook(String book)
    {
        this.books[no_of_books] = book;
        System.out.print("\n*Returned Books: ");
        System.out.println(book+ " has been returned!");
    }
}

public class Project_4
{
    public static void main(String[] args)
    {
        Library l = new Library();

        l.addBook("\nChapter-2023");
        l.addBook("Data Structure");
        l.addBook("Algorithm");
        l.addBook("JAVA");
        l.addBook("C++");
        l.addBook("C");

        l.showAvailableBooks();

        l.issueBook("Algorithm");

        l.returnBook("\nC++");
    }
}
