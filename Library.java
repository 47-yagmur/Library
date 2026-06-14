import algo2odev.Book;
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Kitap ekleme
    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " eklendi.");
    }

    // Kitapları listeleme
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("Kütüphanede kitap yok.");
            return;
        }

        System.out.println("\n--- Kitap Listesi ---");
        for (Book book : books) {
            System.out.println("Kitap: " + book.getTitle());
            System.out.println("Yazar: " + book.getAuthor());
            System.out.println("Sayfa Sayısı: " + book.getPageCount());
  //          System.out.println("Tür: " + book.getGenre());
            System.out.println("-------------------");
        }
    }

    // Kitap arama
    public void searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Kitap bulundu:");
                System.out.println(book.getTitle() + " - " +
                                   book.getAuthor());
                return;
            }
        }

        System.out.println("Kitap bulunamadı.");
    }

    // Kitap silme
    public void removeBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(book);
                System.out.println(title + " silindi.");
                return;
            }
        }

        System.out.println("Kitap bulunamadı.");
    }}


