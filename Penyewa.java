public class Penyewa {
    private String nama;
    private String NIK;
    private String SIM;
    private String KTP;

    public Penyewa(String nama, String NIK, String SIM, String KTP) {
        this.nama = nama;
        this.NIK = NIK;
        this.SIM = SIM;
        this.KTP = KTP;
    }

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

    public boolean hasSIM() {
        return SIM != null && !SIM.isEmpty();
    }

    public boolean hasKTP() {
        return KTP != null && !KTP.isEmpty();
    }
}
