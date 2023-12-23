public class BarangSewaan {
    private String nama;
    private int harga;
    private String namaPenyewa;

    public BarangSewaan(String nama, int harga, String namaPenyewa) {
        this.nama = nama;
        this.harga = harga;
        this.namaPenyewa = namaPenyewa;
    }
    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public String getNamaPenyewa() {
        return namaPenyewa;
    }
}
