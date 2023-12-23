import java.util.ArrayList;

public class ProsesPenyewaan {
    private Penyewa penyewa;
    private ArrayList<DetailPenyewaan> detailPenyewaanList;

    public ProsesPenyewaan(Penyewa penyewa) {
        this.penyewa = penyewa;
        this.detailPenyewaanList = new ArrayList<>();
    }

    public void tambahBarangSewaan(BarangSewaan barangSewaan, int jumlah) {
        detailPenyewaanList.add(new DetailPenyewaan(barangSewaan, jumlah));
    }
}
