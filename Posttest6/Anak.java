public class Anak extends Hijab {
    private String ukuran;

    public Anak(String merk, String jenis, String warna, int stok, int harga, String ukuran) {
        super(merk, jenis, warna, stok, harga);
        this.ukuran = ukuran;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    @Override
    public void displayData() {
        String hargaFormatted = String.format("%,d", this.harga);
        
        System.out.println("Merk: " + this.merk);
        System.out.println("Jenis: " + this.jenis);
        System.out.println("Warna: " + this.warna);
        System.out.println("Ukuran: " + this.ukuran);
        System.out.println("Stok: " + this.stok);
        System.out.println("Harga: " + hargaFormatted);
    }
}
