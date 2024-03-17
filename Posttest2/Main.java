package POSTTEST_PBO.Posttest2;

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
                    int stok = 0;
                    int harga = 0;

                    boolean validStok = false;
                    while (!validStok) {
                        try {
                            System.out.println("Masukkan Stok Hijab:");
                            stok = Integer.parseInt(br.readLine());
                            validStok = true;
                        } catch (NumberFormatException e) {
                            System.out.println("Input stok harus berupa angka.");
                        }
                    }

                    boolean validHarga = false;
                    while (!validHarga) {
                        try {
                            System.out.println("Masukkan Harga Hijab:");
                            harga = Integer.parseInt(br.readLine());
                            validHarga = true;
                        } catch (NumberFormatException e) {
                            System.out.println("Input harga harus berupa angka.");
                        }
                    }  System.out.println("Data Berhasil Ditambahkan");

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
                            dataHijab.get(i).displayData(); // Perbaikan di sini
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
                            dataHijab.get(i).displayData();
                            System.out.println("###########################");
                        }
                    }
                    
                    int ubah = -1;
                    boolean validInput = false;
                    while (!validInput) {
                        System.out.println("Masukkan Nomor Data Hijab Yang Ingin Diubah :");
                        try {
                            int nomorData = Integer.parseInt(br.readLine());
                            ubah = nomorData - 1;
                            if (ubah >= 0 && ubah < dataHijab.size()) {
                                validInput = true;
                            } else {
                                System.out.println("Data Tidak Tersedia!!!");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Input harus berupa angka.");
                        }
                    }
                    
                    while (true) {
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
                                dataHijab.get(ubah).setMerk(br.readLine());
                                System.out.println("Data Berhasil Diubah");
                                break; 
                            case "2":
                                System.out.println("Masukkan Jenis Baru :");
                                dataHijab.get(ubah).setJenis(br.readLine());
                                System.out.println("Data Berhasil Diubah");
                                break; 
                            case "3":
                                System.out.println("Masukkan Warna Baru : ");
                                dataHijab.get(ubah).setWarna(br.readLine());
                                System.out.println("Data Berhasil Diubah");
                                break; 
                            case "4":
                                int newStok = 0;
                                validInput = false;
                                while (!validInput) {
                                    try {
                                        System.out.println("Masukkan Stok Baru : ");
                                        newStok = Integer.parseInt(br.readLine());
                                        validInput = true;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Input stok harus berupa angka.");
                                    }
                                }
                                dataHijab.get(ubah).setStok(newStok);
                                System.out.println("Data Berhasil Diubah");
                                break; 
                            case "5":
                                int newHarga = 0;
                                validInput = false;
                                while (!validInput) {
                                    try {
                                        System.out.println("Masukkan Harga Baru : ");
                                        newHarga = Integer.parseInt(br.readLine());
                                        validInput = true;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Input harga harus berupa angka.");
                                    }
                                }
                                dataHijab.get(ubah).setHarga(newHarga);
                                System.out.println("Data Berhasil Diubah");
                                break; 
                            default:
                                System.out.println("Pilihan tidak valid! Silakan pilih kembali.");
                                continue; 
                        }
                        
                       
                        break; 
                    }
                    break; 
                case "4":
                    for (int i = 0; i < dataHijab.size(); i++) {
                        System.out.println("###########################");
                        System.out.println("Data Hijab Ke " + (i + 1));
                        dataHijab.get(i).displayData(); // Perbaikan di sini
                        System.out.println("###########################");
                    }

                    System.out.println("Masukkan Merk Hijab yang Ingin Dihapus : ");
                    String merkHapus = br.readLine();
                    boolean removed = false;

                    for (int i = 0; i < dataHijab.size(); i++) {
                        if (dataHijab.get(i).getMerk().equalsIgnoreCase(merkHapus)) { // Perbaikan di sini
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
