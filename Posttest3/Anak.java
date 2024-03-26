
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
            super.displayData();
            System.out.println("Ukuran: " + this.ukuran);
        }
    }
    


