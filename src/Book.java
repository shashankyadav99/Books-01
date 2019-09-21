import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        String bookname;
        String authorname;
        int i, n, j, isbn;
        System.out.println("Enter the no of book you want to entered ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Author arr[] = new Author[n];
        if (n > 0) {
            for (i = 0; i < n; i++) {
                sc.nextLine();
                bookname = sc.nextLine();
                authorname = sc.next();
                isbn = sc.nextInt();

                arr[i] = new Author(bookname, authorname, isbn);

            }

            for (i = 0; i < n; i++) {

                System.out.println("-------------------------");
                System.out.println("Bookkname :" + arr[i].Bookname().toString());
                System.out.println("Authorname :" + arr[i].Authorname().toString());
                System.out.println("ISBN :" + arr[i].Isbn());
                System.out.println("-------------------------");

            }
        } else {
            System.out.println("plzz enter the valid no");
        }


        sc.close();
    }
}

class Author {
    private String bookname;
    private String authorname;
    private int isbn;


    public Author(String bookname, String authorname, int isbn) {
        this.bookname = bookname;
        this.authorname = authorname;
        this.isbn = isbn;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String Bookname() {
        return bookname;
    }

    public String Authorname() {
        return authorname;
    }

    public int Isbn() {
        return isbn;
    }

}