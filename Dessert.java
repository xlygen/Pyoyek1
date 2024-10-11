// Kelas Anak Dessert
public class Dessert extends Menu {
    // Constructor
    public Dessert(String namaMenu, double harga) {
        super(namaMenu, harga);
    }

    // Overriding method tampilkanInfoMenu
    @Override
    public void tampilkanInfoMenu() {
        System.out.println("Dessert - " + getNamaMenu() + ": Rp " + getHarga());
    }
}
