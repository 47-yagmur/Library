package algo2odev;

public class Book {
    private String title;
    private String author;
    private int pageCount;  
    private String genre; // kitap türü
    
    // Kurucu Metot (Constructor)
    public Book(String title, String author, int pageCount, String genre) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.genre = genre;
    }
    
    // Getter ve Setter Metotları
    
    public String getTitle() { return this.title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return this.author; }
    public void setAuthor(String author) { this.author = author; }

    public int getPageCount() { return this.pageCount; }
    public void setPageCount(int pageCount) { this.pageCount = pageCount; }

 /*   public String getGenre() { return this.genre; }
    public void setGenre(String genre) { this.genre = genre; } */
}

   
    

