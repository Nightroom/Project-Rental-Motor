public class Penyewa {
    private String nama;
    private String NIK;
    private String SIM;
    private String KTP;
    // Variabel instance tersebut digunakan untuk menyimpan informasi
    // terkait dengan penyewa, seperti nama, NIK (Nomor Induk Kependudukan),
    // SIM (Surat Izin Mengemudi), dan KTP (Kartu Tanda Penduduk).

    public Penyewa(String nama, String NIK, String SIM, String KTP) {
        this.nama = nama;
        this.NIK = NIK;
        this.SIM = SIM;
        this.KTP = KTP;
    }
    // Konstruktor ini dipanggil saat membuat objek Penyewa.
    // Konstruktor menerima empat parameter (nama, NIK, SIM, dan KTP)
    // dan menginisialisasi variabel instance dengan nilai-nilai yang diberikan.

    public String getNama() {
        return nama;
    }

    public String getNIK() {
        return NIK;
    }

    public String getSIM() {
        return SIM;
    }

    public String getKTP() {
        return KTP;
    }
    // Metode-metode getter ini digunakan untuk mendapatkan nilai dari
    // masing-masing variabel instance (nama, NIK, SIM, KTP).
    // Dengan membuat metode-metode ini public, nilai-nilai tersebut dapat diakses
    // dari luar kelas Penyewa.

    public boolean hasSIM() {
        return SIM != null && !SIM.isEmpty();
    }

    public boolean hasKTP() {
        return KTP != null && !KTP.isEmpty();
    }
    // Metode-metode ini mengembalikan true jika penyewa memiliki SIM atau KTP,
    // dan false jika tidak. Digunakan untuk memeriksa apakah penyewa memenuhi
    // syarat penyewaan yang mungkin mengharuskan adanya SIM dan KTP.
}
