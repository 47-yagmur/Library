ALGORİTMALAR VE PROGRAMLAMA II ÖDEV RAPORU
​Proje Adı: Java Swing ile Nesne Yönelimli Kütüphane Yönetim Sistemi
Saliha Haykır/230260116 

​1. GİRİŞ VE PROJENİN AMACI
​Bu projenin amacı, Nesne Yönelimli Programlama (OOP) prensiplerini ve Java Swing kütüphanesini kullanarak dinamik bir Kütüphane Yönetim Sistemi geliştirmektir. Projede verilerin bellekte dinamik olarak tutulması, kullanıcı dostu bir grafik arayüz (GUI) tasarlanması ve katmanlı mimari (Veri Modeli, İş Mantığı ve Görsel Arayüz) yapısının kavranması hedeflenmiştir.
​
2. SİSTEM MİMARİSİ VE SINIF TASARIMLARI
​Proje nesneye yönelik yaklaşım esasına göre 3 temel sınıftan oluşmaktadır:
​A. Book.java (Veri Modeli - Model)
​Sistemdeki her bir kitabı temsil eden şablondur. Kapsülleme (Encapsulation) ilkesine uygun olarak değişkenler private tanımlanmış ve bunlara erişim Getter/Setter metotları ile sağlanmıştır.
​Özellikler: title (String), author (String), pageCount (int), genre (String).
​B. Library.java (İş Mantığı - Controller)
​Kitap nesnelerini yöneten backend merkezidir. Verileri esnek ve dinamik bir yapıda tutabilmek için Java'nın ArrayList koleksiyon yapısı tercih edilmiştir.
​Metotlar: addBook(Book book): Listeye yeni kitap ekler.
​listBooks(): Listede kayıtlı tüm kitapları konsola listeler.
​searchBook(String title): İsme göre kitap arar.
​removeBook(String title): İsme göre eşleşen kitabı listeden siler.
​C. LibraryGui.java (Grafik Kullanıcı Arayüzü )
​Kullanıcının sistemle etkileşime girdiği JFrame sınıfından türetilmiş arayüz katmanıdır. Tasarım esnekliği açısından null layout (Absolute Positioning) kullanılmış ve bileşenler setBounds ile konumlandırılmıştır. Library sınıfı ile kurulan nesne bağıntısı sayesinde arayüzden alınan veriler doğrudan iş mantığı katmanına iletilir.
​
3. AKIŞ ŞEMASI VE MANTIKSAL BAĞLANTI (UML)
​Sistem, Grafik Arayüz (Frontend) ve Yönetim Motoru (Backend) arasında bir köprü mantığıyla çalışır. Kullanıcı arayüzdeki "Ekle" butonuna bastığı an şu olay sırası gerçekleşir:

4. KRİTİK KOD BLOKLARI
​Arayüz ve Arka Plan Entegrasyonu .​Kullanıcıdan alınan verilerin ArrayList yapısına aktarılmasını sağlayan ve LibraryGui içinde tetiklenen dinamik buton dinleyicisi:

5. EKRAN GÖRÜNTÜLERİ VE TEST SENARYOLARI
​Senaryo 1: Formun Başlatılması ve Grafik Arayüz Görünümü Uygulama çalıştırıldığında setVisible(true) komutu ile pencere ekrana hatasız gelir. setBounds koordinatları sayesinde giriş alanları hizada listelenir.


<img width="1920" height="1080" alt="Ekran görüntüsü 2026-06-14 222519" src="https://github.com/user-attachments/assets/e9cfc329-44d5-4984-926b-69587d31b9f0" />


​Senaryo 2: Veri Girişi ve Listeye Ekleme Testi Kullanıcı "Kitap Adı","Yazar" ve "Sayfa Sayısı" alanlarını doldurup "Ekle" butonuna bastığında veri kaybı yaşanmadan arka plandaki metoda aktarılır.


<img width="1920" height="1080" alt="Ekran görüntüsü 2026-06-14 222544" src="https://github.com/user-attachments/assets/aa094e10-50f2-43d4-b7a8-4e2674f89881" />


​Senaryo 3: Konsol Çıktısı Doğrulaması Butona basıldıktan sonra Library sınıfından tetiklenen addBook ve listBooks metotlarının NetBeans Output üzerindeki başarılı çıktısı.



<img width="1920" height="1080" alt="Ekran görüntüsü 2026-06-14 222734" src="https://github.com/user-attachments/assets/4ba5766e-6c6b-40b9-b31e-87a8f058f423" />


​6. SONUÇ
​Bu proje kapsamında katmanlı mimari yapısının mantığı başarıyla uygulanmıştır. Kodların tamamen manuel olarak yazılması, NetBeans otomatik form sihirbazının getirdiği kısıtlamaları ortadan kaldırarak kod hakimiyetini artırmıştır. Dinamik diziler (ArrayList) ve Nesne Yönelimli Programlama prensipleri pekiştirilmiştir.
​
