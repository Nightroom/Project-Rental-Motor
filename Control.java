import java.util.ArrayList;
import java.util.Scanner;

public class Control {
    private ArrayList<Penyewa> penyewaList;
    private ArrayList<Penyediaan> penyedianList;

    public Control() {
        penyewaList = new ArrayList<>();
        penyedianList = new ArrayList<>();

        // Inisialisasi data dummy
        penyewaList.add(new Penyewa("Dela", "123456789", "SIM123", "KTP123"));
        penyedianList.add(new Penyediaan("Rental Motor A", "987654321"));
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        // Proses penyewaan
        System.out.println("Selamat datang di Rental Motor");
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan NIK: ");
        String nik = scanner.nextLine();
        Penyewa penyewa = findPenyewaByNIK(nik);

        if (penyewa == null) {
            // Jika penyewa tidak ditemukan, tambahkan ke daftar penyewa
            penyewa = new Penyewa(nama, nik, "", ""); // KTP dan SIM dikosongkan
            penyewaList.add(penyewa);
        } else {
            System.out.println("Data penyewa ditemukan!");
        }

        System.out.print("Apakah Anda memiliki KTP? (y/n): ");
        char hasKTPInput = scanner.next().charAt(0);
        boolean hasKTP = hasKTPInput == 'y' || hasKTPInput == 'Y';

        System.out.print("Apakah Anda memiliki SIM? (y/n): ");
        char hasSIMInput = scanner.next().charAt(0);
        boolean hasSIM = hasSIMInput == 'y' || hasSIMInput == 'Y';

        if (hasKTP && hasSIM) {
            System.out.println("Syarat penyewaan: SIM dan KTP");

            // Menampilkan list barang
            ArrayList<BarangSewaan> barangSewaanList = createBarangSewaanList(nama);
            System.out.println("List Barang Sewaan:");
            for (int i = 0; i < barangSewaanList.size(); i++) {
                System.out.println((i + 1) + ". " + barangSewaanList.get(i).getNama() +
                        " - Harga: " + barangSewaanList.get(i).getHarga());
            }

            // Memilih barang untuk disewa
            System.out.print("Pilih nomor barang yang akan disewa: ");
            int selectedBarangIndex = scanner.nextInt();
            if (selectedBarangIndex >= 1 && selectedBarangIndex <= barangSewaanList.size()) {
                BarangSewaan selectedBarang = barangSewaanList.get(selectedBarangIndex - 1);
                // Proses penyewaan
                ProsesPenyewaan prosesPenyewaan = new ProsesPenyewaan(penyewa);
                prosesPenyewaan.tambahBarangSewaan(selectedBarang, 1); // Misalnya sewa 1 unit
                System.out.println("Penyewaan berhasil! Terima kasih.");
            } else {
                System.out.println("Pilihan barang tidak valid.");
            }
        } else {
            System.out.println("Maaf, penyewaan tidak dapat dilakukan tanpa SIM atau KTP.");
        }
        scanner.close();
    }

    private Penyewa findPenyewaByNIK(String nik) {

        for (Penyewa penyewa : penyewaList) {
            if (penyewa.getNIK().equals(nik)) {
                return penyewa;
            }
        }
        return null;
    }

    private ArrayList<BarangSewaan> createBarangSewaanList(String namaPenyewa) {
        ArrayList<BarangSewaan> barangSewaanList = new ArrayList<>();
        barangSewaanList.add(new BarangSewaan("Motor Yamaha", 50_000, namaPenyewa));
        barangSewaanList.add(new BarangSewaan("Motor Honda", 60_000, namaPenyewa));
        barangSewaanList.add(new BarangSewaan("Motor Suzuki", 55_000, namaPenyewa));
        return barangSewaanList;
    }

}
