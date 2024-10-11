// Kelas Induk Menu
public class Menu {
    private String namaMenu;
    private double harga;

    // Constructor
    public Menu(String namaMenu, double harga) {
        this.namaMenu = namaMenu;
        this.harga = harga;
    }

    // Getter dan Setter
    public String getNamaMenu() {
        return namaMenu;
    }

    public double getHarga() {
        return harga;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Method untuk menampilkan menu
    public void tampilkanInfoMenu() {
        System.out.println(namaMenu + ": Rp " + harga);
    }
}
