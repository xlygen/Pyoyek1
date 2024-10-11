// Kelas Main
public class MainClass {
    public static void main(String[] args) {
        // Membuat objek restoran
        Restoran restoran = new Restoran("Restoran Dimas (342)");
        restoran.tampilkanInfoRestoran();

        // Membuat objek menu makanan, minuman, dessert
        Menu nasiGoreng = new Makanan("Nasi Goreng UAD", 25000);
        Menu esTeh = new Minuman("Es Teh UAD", 5000);
        Menu brownies = new Dessert("Kue UAD", 15000);

        // Polimorfisme: menampilkan info dari berbagai jenis menu
        System.out.println("\nMenu Restoran :");
        nasiGoreng.tampilkanInfoMenu();
        esTeh.tampilkanInfoMenu();
        brownies.tampilkanInfoMenu();
        
        // Menghitung total harga keseluruhan
        double totalHargaKeseluruhan = nasiGoreng.getHarga() + esTeh.getHarga() + brownies.getHarga();
        System.out.println("\nTotal Harga Keseluruhan: Rp " + totalHargaKeseluruhan);
    }
}
