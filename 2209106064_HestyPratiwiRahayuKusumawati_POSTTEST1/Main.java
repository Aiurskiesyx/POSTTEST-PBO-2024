import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Hijab> dataHijab = new ArrayList<>();

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        while (true) {
            System.out.println("""
                                         Selamat Datang di D'LUXURY STORE
                    #####################################################################
                                                        Menu
                    1. Tambah Data Hijab
                    2. Lihat Data Hijab
                    3. Ubah Data Hijab
                    4. Hapus Data Hijab
                    0. Exit 
                    ##################################################################### 
                    """);

            System.out.println("Masukkan Menu :");
            String menu = br.readLine();

            switch (menu) {
                case "1":
                    System.out.println("Masukkan Merk Hijab :");
                    String merk = br.readLine();
                    System.out.println("Masukkan Jenis Hijab:");
                    String jenis = br.readLine();
                    System.out.println("Masukkan Warna Hijab:");
                    String warna = br.readLine();
                    System.out.println("Masukkan Stok Hijab:");
                    int stok = Integer.parseInt(br.readLine());
                    System.out.println("Masukkan Harga Hijab:");
                    int harga = Integer.parseInt(br.readLine());

                    Hijab hijabBaru = new Hijab(merk, warna, jenis, stok, harga);
                    dataHijab.add(hijabBaru);
                    break;
                case "2":
                    if (dataHijab.isEmpty()) {
                        System.out.println("###########################");
                        System.out.println("D'LUXURY STORE");
                        System.out.println("Tidak ada data hijab yang tersedia.");
                        System.out.println("###########################");
                    } else {
                        System.out.println("###########################");
                        System.out.println("Data Hijab yang Tersedia:");
                        for (int i = 0; i < dataHijab.size(); i++) {
                            System.out.println("Data Hijab Ke " + (i + 1));
                            dataHijab.get(i).DisplayData();
                            System.out.println("########################");
                        }
                    }
                    break;
                    case "3":
                    if (dataHijab.isEmpty()) {
                        System.out.println("Tidak Ada Data Hijab Yang Tersedia!!!");
                    } else {
                        for (int i = 0; i < dataHijab.size(); i++) {
                            System.out.println("###########################");
                            System.out.println("Data Hijab Ke " + (i + 1));
                            dataHijab.get(i).DisplayData();
                            System.out.println("###########################");
                        }
                    }
                
                    System.out.println("Masukkan Nomor Data Hijab Yang Ingin Diubah :");
                    int nomorData = Integer.parseInt(br.readLine());
                    int ubah = nomorData - 1;
                    if (ubah >= 0 && ubah < dataHijab.size()) {
                        System.out.println("Pilih Atribut Yang Ingin Diubah:");
                        System.out.println("1. Merk");
                        System.out.println("2. Jenis");
                        System.out.println("3. Warna");
                        System.out.println("4. Stok");
                        System.out.println("5. Harga");
                        System.out.println("Masukkan pilihan Anda:");
                
                        String pilihanAtribut = br.readLine();
                        switch (pilihanAtribut) {
                            case "1":
                                System.out.println("Masukkan Merk Baru : ");
                                dataHijab.get(ubah).merk = br.readLine();
                                break;
                            case "2":
                                System.out.println("Masukkan Jenis Baru :");
                                dataHijab.get(ubah).jenis = br.readLine();
                                break;
                            case "3":
                                System.out.println("Masukkan Warna Baru : ");
                                dataHijab.get(ubah).warna = br.readLine();
                                break;
                            case "4":
                                System.out.println("Masukkan Stok Baru : ");
                                dataHijab.get(ubah).stok = Integer.parseInt(br.readLine());
                                break;
                            case "5":
                                System.out.println("Masukkan Harga Baru : ");
                                dataHijab.get(ubah).harga = Integer.parseInt(br.readLine());
                                break;
                            default:
                                System.out.println("Pilihan tidak valid!");
                                break;
                        }
                        System.out.println("Data Berhasil Diubah");
                    } else {
                        System.out.println("Data Tidak Tersedia!!!");
                    }
                    break;                
                case "4":
                    for (int i = 0; i < dataHijab.size(); i++) {
                        System.out.println("###########################");
                        System.out.println("Data Hijab Ke " + (i + 1));
                        dataHijab.get(i).DisplayData();
                        System.out.println("###########################");
                    }

                    System.out.println("Masukkan Merk Hijab yang Ingin Dihapus : ");
                    String merkHapus = br.readLine();
                    boolean removed = false;
                
                    for (int i = 0; i < dataHijab.size(); i++) {
                        if (dataHijab.get(i).merk.equalsIgnoreCase(merkHapus)) {
                            dataHijab.remove(i);
                            removed = true;
                            System.out.println("Data Hijab Berhasil Terhapus");
                            break; 
                        }
                    }
                    if (!removed) {
                        System.out.println("Data Hijab dengan Merk '" + merkHapus + "' Tidak Ditemukan");
                    }
                    break;
                case "0":
                    System.out.println("Terimakasih Telah Menggunakan Program Pendataan Hijab Ini");
                    System.out.println("Silahkan Datang Kembali!!!");
                    return;
                default:
                    System.out.println("Menu Yang Anda Pilih Tidak Tersedia!!!");
                    break;
            }
        
         }
    }
}
