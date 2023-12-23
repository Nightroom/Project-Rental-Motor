import java.util.ArrayList;

public class ProsesPenyewaan {
    private Penyewa penyewa;
    private ArrayList<DetailPenyewaan> detailPenyewaanList;

    // penyewa: Variabel instance yang menyimpan objek dari kelas Penyewa,
    // yang merepresentasikan penyewa yang sedang melakukan proses penyewaan.
    // detailPenyewaanList: Variabel instance yang menyimpan ArrayList dari objek
    // DetailPenyewaan.
    // Setiap objek DetailPenyewaan merepresentasikan detail dari suatu penyewaan
    // terkait dengan barang sewaan tertentu.
    public ProsesPenyewaan(Penyewa penyewa) {
        this.penyewa = penyewa;
        this.detailPenyewaanList = new ArrayList<>();
    }

    // Konstruktor ini dipanggil saat membuat objek ProsesPenyewaan.
    // Konstruktor menerima satu parameter, yaitu objek Penyewa,
    // dan menginisialisasi variabel instance penyewa dengan nilai yang diberikan.
    // Selain itu, detailPenyewaanList diinisialisasi sebagai ArrayList kosong.
    public void tambahBarangSewaan(BarangSewaan barangSewaan, int jumlah) {
        detailPenyewaanList.add(new DetailPenyewaan(barangSewaan, jumlah));
    }
}
// Metode ini digunakan untuk menambahkan detail penyewaan baru ke dalam
// detailPenyewaanList.
// Metode menerima dua parameter, yaitu objek BarangSewaan yang akan disewa dan
// jumlah barang yang akan disewa.
// Sebuah objek DetailPenyewaan baru dibuat dengan menggunakan parameter
// tersebut,
// dan kemudian ditambahkan ke dalam detailPenyewaanList.