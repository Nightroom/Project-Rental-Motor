public class BarangSewaan {
    private String nama;
    // Ini adalah variabel instance (field) yang menyimpan nama barang sewaan.
    // Modifier private berarti bahwa variabel ini hanya dapat diakses di dalam
    // kelas BarangSewaan sendiri.
    private int harga;
    // Ini adalah variabel instance lainnya yang menyimpan harga barang sewaan dalam
    // bentuk bilangan bulat.
    // Seperti variabel nama, variabel ini juga bersifat private.
    private String namaPenyewa;

    public BarangSewaan(String nama, int harga, String namaPenyewa) {
        this.nama = nama;
        this.harga = harga;
        this.namaPenyewa = namaPenyewa;
    }

    // Ini adalah konstruktor kelas BarangSewaan. Konstruktor ini dipanggil ketika
    // Anda
    // membuat objek baru dari kelas BarangSewaan.
    public String getNama() {
        return nama;
    }

    // Ini adalah metode akses (getter) yang digunakan untuk mengambil nilai
    // variabel nama.
    // Dengan membuat metode ini public, nilai dari nama dapat diakses dari luar
    // kelas BarangSewaan.
    public int getHarga() {
        return harga;
    }

    public String getNamaPenyewa() {
        return namaPenyewa;
    }
}
