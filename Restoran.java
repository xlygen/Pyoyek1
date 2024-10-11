// Kelas Induk Restoran
public class Restoran {
    private String namaRestoran;

    // Constructor Overloading
    public Restoran() {
        this.namaRestoran = "Restoran Default";
    }

    public Restoran(String namaRestoran) {
        this.namaRestoran = namaRestoran;
    }

    // Getter dan Setter
    public String getNamaRestoran() {
        return namaRestoran;
    }

    public void setNamaRestoran(String namaRestoran) {
        this.namaRestoran = namaRestoran;
    }

    // Method tampilkan nama restoran
    public void tampilkanInfoRestoran() {
        System.out.println("Nama Restoran: " + namaRestoran);
    }
}
