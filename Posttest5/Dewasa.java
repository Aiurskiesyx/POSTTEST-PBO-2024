public class Dewasa extends Hijab {
    private String bahan;

    public Dewasa(String merk, String jenis, String warna, int stok, int harga, String bahan) {
        super(merk, jenis, warna, stok, harga);
        this.bahan = bahan;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    @Override
    public void displayData() {
        String hargaFormatted = String.format("%,d", this.harga);
        
        System.out.println("Merk: " + this.merk);
        System.out.println("Jenis: " + this.jenis);
        System.out.println("Warna: " + this.warna);
        System.out.println("Bahan: " + this.bahan);
        System.out.println("Stok: " + this.stok);
        System.out.println("Harga: " + hargaFormatted);
    }
}
