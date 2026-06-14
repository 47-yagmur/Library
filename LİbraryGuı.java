import algo2odev.Book;
import javax.swing.JButton;
import  javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LİbraryGuı extends JFrame {
  
    JLabel lblTitle;
    JTextField txtTitle;
    JLabel lblAuthor;
    JTextField txtAuthor;
    JLabel lblpageCount;
    JTextField txtpageCount;
    JButton btnAdd;
    Library myLibrary;

    public LİbraryGuı() {
        
        myLibrary = new Library();

        setTitle("Kütüphane Sistemi");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        
        lblTitle = new JLabel("Kitap Adı:");
        lblTitle.setBounds(20,20,100,25);
        add(lblTitle);

        txtTitle = new JTextField();
        txtTitle.setBounds(120,20,200,25);
        add(txtTitle);

        lblAuthor = new JLabel("Yazar:");
        lblAuthor.setBounds(20,60,100,25);
        add(lblAuthor);

        txtAuthor = new JTextField();
        txtAuthor.setBounds(120,60,200,25);
        add(txtAuthor);
        
        lblpageCount = new JLabel("Sayfa Sayısı:");
        lblpageCount.setBounds(20,100,100,25);
        add(lblpageCount);

        txtpageCount = new JTextField();
        txtpageCount.setBounds(120,100,200,25);
        add(txtpageCount);
        
        btnAdd = new JButton("Ekle");
        btnAdd.setBounds(120,140,100,35);
        add(btnAdd);
        
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            
        String title = txtTitle.getText();
        String author = txtAuthor.getText();
        String pageCount = txtpageCount.getText();
        
        Integer.parseInt(pageCount);
        
        Book newBook = new Book(title, author, 0, "Belirtilmedi");
        myLibrary.addBook(newBook);
        myLibrary.listBooks();
        
        txtTitle.setText("");
        txtAuthor.setText("");
        txtpageCount.setText("");
        
    }
});

        setVisible(true);
    }
    
    public static void main(String[] args) {
        new LİbraryGuı();
}
}
    

