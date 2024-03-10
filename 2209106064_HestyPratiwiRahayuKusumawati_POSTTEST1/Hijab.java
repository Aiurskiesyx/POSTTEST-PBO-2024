public class Hijab {
    String merk, jenis, warna;
    int stok, harga;

    public Hijab(String merk, String jenis, String warna, int stok, int harga) {
        this.merk = merk;
        this.jenis = jenis;
        this.warna = warna;
        this.stok = stok;
        this.harga = harga;
    }

    void DisplayData() {
        String hargaFormatted = String.format("%,d", this.harga);
        
        System.out.println("Merk :" + this.merk);
        System.out.println("Jenis :" + this.jenis);
        System.out.println("Warna :" + this.warna);
        System.out.println("Stok :" + this.stok);
        System.out.println("Harga :" + hargaFormatted);
    }
}
