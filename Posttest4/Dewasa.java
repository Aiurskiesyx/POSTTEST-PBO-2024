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
        super.displayData();
        System.out.println("Bahan: " + this.bahan);
    }
}
