public class Penyediaan {
    private String nama;
    private String nomorKontak;
    // Variabel instance nama digunakan untuk menyimpan nama penyediaan
    // (misalnya, nama rental motor), dan variabel instance nomorKontak digunakan
    // untuk menyimpan nomor kontak atau telepon dari penyediaan tersebut.

    public Penyediaan(String nama, String nomorKontak) {
        this.nama = nama;
        this.nomorKontak = nomorKontak;
    }
    // Konstruktor ini dipanggil saat membuat objek Penyediaan.
    // Konstruktor menerima dua parameter, yaitu nama dan nomorKontak,
    // kemudian menginisialisasi variabel instance nama dan nomorKontak dengan
    // nilai-nilai yang diberikan.

    public String getNama() {
        return nama;
    }

    // Metode ini merupakan getter yang digunakan untuk mendapatkan nilai
    // dari variabel nama. Dengan membuat metode ini public,
    // nilai dari nama dapat diakses dari luar kelas Penyediaan.
    public String getNomorKontak() {
        return nomorKontak;
    }
    // Metode ini merupakan getter yang digunakan untuk mendapatkan
    // nilai dari variabel nomorKontak. Sama seperti metode sebelumnya,
    // ini dibuat public agar nilai dari nomorKontak dapat diakses dari luar kelas
    // Penyediaan.
}
