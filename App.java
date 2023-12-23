public class App {
    // Ini adalah deklarasi kelas App. Kelas ini memiliki satu metode main
    // yang merupakan titik masuk utama (entry point) saat program dijalankan.
    public static void main(String[] args) {
        // Metode main adalah metode khusus yang akan dieksekusi saat program
        // dijalankan.
        // Itu memiliki tipe kembalian void, artinya tidak mengembalikan nilai.
        // Parameter String[] args digunakan untuk menerima argumen baris perintah saat
        // program dijalankan,
        // meskipun dalam contoh ini, argumen tidak digunakan.
        Control control = new Control();
        // Membuat objek dari kelas Control. Ini adalah contoh pembuatan objek
        // (instantiation) dari kelas Control.
        // Objek ini akan digunakan untuk memanggil metode run() dari kelas Control.
        control.run();
        // Memanggil metode run() dari objek control. Ini memulai jalannya logika
        // program yang terkandung dalam kelas Control. Dengan cara ini,
        // kontrol aplikasi diberikan kepada objek Control.
    }
}
