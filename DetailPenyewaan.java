public class DetailPenyewaan {
    private BarangSewaan barangSewaan;
    private int jumlah;
    // Ini adalah deklarasi variabel instance yang digunakan untuk menyimpan
    // informasi terkait detail penyewaan.
    // barangSewaan adalah objek dari kelas BarangSewaan yang menunjukkan barang
    // yang disewa,
    // dan jumlah adalah jumlah barang yang disewa.

    public DetailPenyewaan(BarangSewaan barangSewaan, int jumlah) {
        this.barangSewaan = barangSewaan;
        this.jumlah = jumlah;
    }
    // Konstruktor ini dipanggil saat membuat objek DetailPenyewaan.
    // Konstruktor menerima dua parameter, yaitu objek BarangSewaan yang menunjukkan
    // barang yang disewa, dan jumlah yang menunjukkan jumlah barang yang disewa.
    // Konstruktor kemudian
    // menginisialisasi variabel instance barangSewaan dan jumlah sesuai dengan
    // nilai yang diberikan.
}
