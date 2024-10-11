// Kelas Anak Minuman
public class Minuman extends Menu {
    // Constructor
    public Minuman(String namaMenu, double harga) {
        super(namaMenu, harga);
    }

    // Overriding method tampilkanInfoMenu
    @Override
    public void tampilkanInfoMenu() {
        System.out.println("Minuman - " + getNamaMenu() + ": Rp " + getHarga());
    }
}
