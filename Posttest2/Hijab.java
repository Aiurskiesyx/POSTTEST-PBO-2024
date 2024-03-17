package POSTTEST_PBO.Posttest2;

public class Hijab {
    private String merk, jenis, warna;
    private int stok, harga;

    public Hijab(String merk, String jenis, String warna, int stok, int harga) {
        this.merk = merk;
        this.jenis = jenis;
        this.warna = warna;
        this.stok = stok;
        this.harga = harga;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void displayData() {
        String hargaFormatted = String.format("%,d", this.harga);
        
        System.out.println("Merk: " + this.merk);
        System.out.println("Jenis: " + this.jenis);
        System.out.println("Warna: " + this.warna);
        System.out.println("Stok: " + this.stok);
        System.out.println("Harga: " + hargaFormatted);
    }
}
