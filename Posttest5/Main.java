import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public final class Main {
    private static final InputStreamReader isr = new InputStreamReader(System.in);
    private static final BufferedReader br = new BufferedReader(isr);

    private static final ArrayList<Anak> Ank = new ArrayList<>();
    private static final ArrayList<Dewasa> Dws = new ArrayList<>();
    private static final ArrayList<Hijab> dataHijab = new ArrayList<>();

    public static void main(String[] args) throws IOException {
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
            final String menu = br.readLine();

            switch (menu) {
                case "1":
                    Tambah();
                    break;
                case "2":
                    Lihat();
                    break;
                case "3":
                    Ubah();
                    break;
                case "4":
                    Hapus();
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

    public static void Tambah() throws IOException {
        while (true) {
            System.out.println("""
                ###########################
                Pilih Menu :
                1. Tambah Hijab Anak
                2. Tambah Hijab Dewasa
                0. Keluar
                ###########################
                """);
            System.out.println("Input : ");
            final String menu = br.readLine();

            if ("1".equals(menu)) {
                Tambah("Anak");
                break;
            } else if ("2".equals(menu)) {
                Tambah("Dewasa");
                break;
            } else if ("0".equals(menu)) {
                break; // Exit the loop to return to main menu
            } else {
                System.out.println("Menu Yang Anda Pilih Tidak Tersedia!!!");
            }
        }
    }

    public static void Tambah(final String jenis) throws IOException {
        if ("Anak".equals(jenis)) {
            System.out.println("Masukkan Merk Hijab :");
            final String merk = br.readLine();
            System.out.println("Masukkan Jenis Hijab:");
            final String jenisHijab = br.readLine();
            System.out.println("Masukkan Warna Hijab:");
            final String warna = br.readLine();
            System.out.println("Masukkan Size Hijab:");
            final String ukuran = br.readLine();
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
            }

            System.out.println("Data Berhasil Ditambahkan");

            final Anak dataAnak = new Anak(merk, warna, jenisHijab, stok, harga, ukuran);
            Ank.add(dataAnak);
        } else if ("Dewasa".equals(jenis)) {
            System.out.println("Masukkan Merk Hijab :");
            final String merk = br.readLine();
            System.out.println("Masukkan Jenis Hijab:");
            final String jenisHijab = br.readLine();
            System.out.println("Masukkan Warna Hijab:");
            final String warna = br.readLine();
            System.out.println("Masukkan Bahan Hijab:");
            final String bahan = br.readLine();
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
            }
            System.out.println("Data Berhasil Ditambahkan");

            final Dewasa dataDewasa = new Dewasa(merk, warna, jenisHijab, stok, harga, bahan);
            Dws.add(dataDewasa);
        }
    }

    public static void Lihat() throws IOException {
        while (true) {
            System.out.println("""
                ###########################
                Pilih Menu :
                1. Lihat Hijab Anak
                2. Lihat Hijab Dewasa
                0. Keluar
                ###########################
                """);
            System.out.println("Input : ");
            final String menu = br.readLine();

            switch (menu) {
                case "1":
                    if (Ank.isEmpty()) {
                        System.out.println("Tidak ada data hijab anak yang tersedia.");
                    } else {
                        for (int i = 0; i < Ank.size(); i++) {
                            System.out.println("###########################");
                            System.out.println("Data Hijab Anak Ke " + (i + 1));
                            Ank.get(i).displayData(); // Perbaikan di sini
                            System.out.println("###########################");
                        }
                    }
                    break;
                case "2":
                    if (Dws.isEmpty()) {
                        System.out.println("Tidak ada data hijab dewasa yang tersedia.");
                    } else {
                        for (int i = 0; i < Dws.size(); i++) {
                            System.out.println("###########################");
                            System.out.println("Data Hijab Dewasa Ke " + (i + 1));
                            Dws.get(i).displayData(); // Perbaikan di sini
                            System.out.println("###########################");
                        }
                    }
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Menu Yang Anda Pilih Tidak Tersedia!!!");
                    break;
            }
        }
    }

    public static void Ubah() throws IOException {
        while (true) {
            System.out.println("""
                ###########################
                Pilih Menu :
                1. Ubah Hijab Anak
                2. Ubah Hijab Dewasa
                0. Keluar
                ###########################
                """);
            System.out.println("Input : ");
            final String menu = br.readLine();

            switch (menu) {
                case "1":
                    UbahAnak();
                    break;
                case "2":
                    UbahDewasa();
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Menu Yang Anda Pilih Tidak Tersedia!!!");
                    break;
            }
        }
    }

    public static void UbahAnak() throws IOException {
        if (Ank.isEmpty()) {
            System.out.println("Tidak Ada Data Hijab Anak Yang Tersedia!!!");
            return;
        }

        System.out.println("Data Hijab Anak yang Tersedia:");
        for (int i = 0; i < Ank.size(); i++) {
            System.out.println("Data Hijab Anak Ke " + (i + 1));
            Ank.get(i).displayData();
            System.out.println("###########################");
        }

        int ubah = -1;
        boolean validInput = false;
        while (!validInput) {
            System.out.println("Masukkan Nomor Data Hijab Anak Yang Ingin Diubah :");
            try {
                int nomorData = Integer.parseInt(br.readLine());
                ubah = nomorData - 1;
                if (ubah >= 0 && ubah < Ank.size()) {
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
            System.out.println("4. Ukuran");
            System.out.println("5. Stok");
            System.out.println("6. Harga");
            System.out.println("Masukkan pilihan Anda:");

            final String pilihanAtribut = br.readLine();
            switch (pilihanAtribut) {
                case "1":
                    System.out.println("Masukkan Merk Baru : ");
                    Ank.get(ubah).setMerk(br.readLine());
                    System.out.println("Data Berhasil Diubah");
                    break;
                case "2":
                    System.out.println("Masukkan Jenis Baru :");
                    Ank.get(ubah).setJenis(br.readLine());
                    System.out.println("Data Berhasil Diubah");
                    break;
                case "3":
                    System.out.println("Masukkan Warna Baru : ");
                    Ank.get(ubah).setWarna(br.readLine());
                    System.out.println("Data Berhasil Diubah");
                    break;
                case "4":
                    System.out.println("Masukkan Ukuran Baru : ");
                    Ank.get(ubah).setUkuran(br.readLine());
                    System.out.println("Data Berhasil Diubah");
                    break;
                case "5":
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
                    Ank.get(ubah).setStok(newStok);
                    System.out.println("Data Berhasil Diubah");
                    break;
                case "6":
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
                    Ank.get(ubah).setHarga(newHarga);
                    System.out.println("Data Berhasil Diubah");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih kembali.");
                    continue;
            }
            break;
        }
    }

    public static void UbahDewasa() throws IOException {
        if (Dws.isEmpty()) {
            System.out.println("Tidak Ada Data Hijab Dewasa Yang Tersedia!!!");
            return;
        }

        System.out.println("Data Hijab Dewasa yang Tersedia:");
        for (int i = 0; i < Dws.size(); i++) {
            System.out.println("Data Hijab Dewasa Ke " + (i + 1));
            Dws.get(i).displayData();
            System.out.println("###########################");
        }

        int ubah = -1;
        boolean validInput = false;
        while (!validInput) {
            System.out.println("Masukkan Nomor Data Hijab Dewasa Yang Ingin Diubah :");
            try {
                int nomorData = Integer.parseInt(br.readLine());
                ubah = nomorData - 1;
                if (ubah >= 0 && ubah < Dws.size()) {
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
            System.out.println("4. Bahan");
            System.out.println("5. Stok");
            System.out.println("6. Harga");
            System.out.println("Masukkan pilihan Anda:");

            final String pilihanAtribut = br.readLine();
            switch (pilihanAtribut) {
                case "1":
                    System.out.println("Masukkan Merk Baru : ");
                    Dws.get(ubah).setMerk(br.readLine());
                    System.out.println("Data Berhasil Diubah");
                    break;
                case "2":
                    System.out.println("Masukkan Jenis Baru :");
                    Dws.get(ubah).setJenis(br.readLine());
                    System.out.println("Data Berhasil Diubah");
                    break;
                case "3":
                    System.out.println("Masukkan Warna Baru : ");
                    Dws.get(ubah).setWarna(br.readLine());
                    System.out.println("Data Berhasil Diubah");
                    break;
                case "4":
                    System.out.println("Masukkan Bahan Baru : ");
                    Dws.get(ubah).setBahan(br.readLine());
                    System.out.println("Data Berhasil Diubah");
                    break;
                case "5":
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
                    Dws.get(ubah).setStok(newStok);
                    System.out.println("Data Berhasil Diubah");
                    break;
                case "6":
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
                    Dws.get(ubah).setHarga(newHarga);
                    System.out.println("Data Berhasil Diubah");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih kembali.");
                    continue;
            }
            break;
        }
    }

    public static void Hapus() throws IOException {
        while (true) {
            System.out.println("""
                ###########################
                Pilih Menu :
                1. Hapus Hijab Anak
                2. Hapus Hijab Dewasa
                0. Keluar
                ###########################
                """);
            System.out.println("Input : ");
            final String menu = br.readLine();

            switch (menu) {
                case "1":
                    if (Ank.isEmpty()) {
                        System.out.println("Tidak Ada Data Hijab Anak Yang Tersedia!!!");
                        continue;
                    }
                    System.out.println("Data Hijab Anak yang Tersedia:");
                    for (int i = 0; i < Ank.size(); i++) {
                        System.out.println("Data Hijab Anak Ke " + (i + 1));
                        Ank.get(i).displayData();
                        System.out.println("###########################");
                    }
                    System.out.println("Masukkan Nomor Data Hijab Anak Yang Ingin Dihapus :");
                    try {
                        int nomorData = Integer.parseInt(br.readLine());
                        int hapus = nomorData - 1;
                        if (hapus >= 0 && hapus < Ank.size()) {
                            Ank.remove(hapus);
                            System.out.println("Data Hijab Anak Berhasil Terhapus");
                        } else {
                            System.out.println("Data Tidak Tersedia!!!");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Input harus berupa angka.");
                    }
                    break;
                case "2":
                    if (Dws.isEmpty()) {
                        System.out.println("Tidak Ada Data Hijab Dewasa Yang Tersedia!!!");
                        continue;
                    }
                    System.out.println("Data Hijab Dewasa yang Tersedia:");
                    for (int i = 0; i < Dws.size(); i++) {
                        System.out.println("Data Hijab Dewasa Ke " + (i + 1));
                        Dws.get(i).displayData();
                        System.out.println("###########################");
                    }
                    System.out.println("Masukkan Nomor Data Hijab Dewasa Yang Ingin Dihapus :");
                    try {
                        int nomorData = Integer.parseInt(br.readLine());
                        int hapus = nomorData - 1;
                        if (hapus >= 0 && hapus < Dws.size()) {
                            Dws.remove(hapus);
                            System.out.println("Data Hijab Dewasa Berhasil Terhapus");
                        } else {
                            System.out.println("Data Tidak Tersedia!!!");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Input harus berupa angka.");
                    }
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Menu Yang Anda Pilih Tidak Tersedia!!!");
                    break;
            }
        }
    }
}
