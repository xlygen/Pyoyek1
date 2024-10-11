// Kelas Anak Makanan
public class Makanan extends Menu {
    // Constructor
    public Makanan(String namaMenu, double harga) {
        super(namaMenu, harga);
    }

    // Overriding method tampilkanInfoMenu
    @Override
    public void tampilkanInfoMenu() {
        System.out.println("Makanan - " + getNamaMenu() + ": Rp " + getHarga());
    }
}
