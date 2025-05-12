package aplikasidatapegawai;

import java.util.Scanner;

/**
 *
 * @author Maria Droste D. Jehalu
 * TGL : 10 MEI 2025
 */
public class AplikasiDataPegawai {
    static Scanner scanner = new Scanner(System.in);
    static Pegawai[] daftarPegawai = new Pegawai[100];
    static int jumlahPegawai = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== MENU DATA PEGAWAI ===");
            System.out.println("1. Tambah Pegawai");
            System.out.println("2. Tampilkan Semua Pegawai");
            System.out.println("3. Ubah Data Pegawai");
            System.out.println("4. Hapus Data Pegawai");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Buang newline

            switch (pilihan) {
                case 1: tambahPegawai(); break;
                case 2: tampilkanPegawai(); break;
                case 3: ubahPegawai(); break;
                case 4: hapusPegawai(); break;
                case 5: System.out.println("Terima kasih."); break;
                default: System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
    }

    static void tambahPegawai() {
        System.out.print("ID: "); int id = scanner.nextInt(); scanner.nextLine();
        System.out.print("Nama: "); String nama = scanner.nextLine();
        System.out.print("Alamat: "); String alamat = scanner.nextLine();
        System.out.print("Status Kepegawaian: "); String status = scanner.nextLine();
        System.out.print("Jabatan: "); String jabatan = scanner.nextLine();
        System.out.print("Divisi: "); String divisi = scanner.nextLine();
        System.out.print("Catatan Kehadiran: "); String kehadiran = scanner.nextLine();
        System.out.print("Email: "); String email = scanner.nextLine();
        System.out.print("No Telepon: "); String telepon = scanner.nextLine();
        System.out.print("Jadwal Sertifikasi: "); String sertifikasi = scanner.nextLine();

        daftarPegawai[jumlahPegawai++] = new Pegawai(id, nama, alamat, status, jabatan, divisi, kehadiran, email, telepon, sertifikasi);
        System.out.println("Data berhasil ditambahkan.");
    }

    static void tampilkanPegawai() {
        if (jumlahPegawai == 0) {
            System.out.println("Belum ada data pegawai.");
        } else {
            for (int i = 0; i < jumlahPegawai; i++) {
                System.out.println(daftarPegawai[i]);
            }
        }
    }

    static void ubahPegawai() {
        System.out.print("Masukkan ID pegawai yang ingin diubah: ");
        int id = scanner.nextInt(); scanner.nextLine();
        boolean ditemukan = false;
        for (int i = 0; i < jumlahPegawai; i++) {
            if (daftarPegawai[i].getId() == id) {
                System.out.print("Nama baru: "); daftarPegawai[i].setNama(scanner.nextLine());
                System.out.print("Alamat baru: "); daftarPegawai[i].setAlamat(scanner.nextLine());
                System.out.print("Status baru: "); daftarPegawai[i].setStatusKepegawaian(scanner.nextLine());
                System.out.print("Jabatan baru: "); daftarPegawai[i].setJabatan(scanner.nextLine());
                System.out.print("Divisi baru: "); daftarPegawai[i].setDivisi(scanner.nextLine());
                System.out.print("Kehadiran baru: "); daftarPegawai[i].setCatatanKehadiran(scanner.nextLine());
                System.out.print("Email baru: "); daftarPegawai[i].setEmail(scanner.nextLine());
                System.out.print("Telepon baru: "); daftarPegawai[i].setNoTelepon(scanner.nextLine());
                System.out.print("Sertifikasi baru: "); daftarPegawai[i].setJadwalSertifikasi(scanner.nextLine());

                System.out.println("Data berhasil diubah.");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("ID tidak ditemukan.");
        }
    }

    static void hapusPegawai() {
        System.out.print("Masukkan ID pegawai yang ingin dihapus: ");
        int id = scanner.nextInt(); scanner.nextLine();
        boolean ditemukan = false;
        for (int i = 0; i < jumlahPegawai; i++) {
            if (daftarPegawai[i].getId() == id) {
                for (int j = i; j < jumlahPegawai - 1; j++) {
                    daftarPegawai[j] = daftarPegawai[j + 1];
                }
                daftarPegawai[--jumlahPegawai] = null;
                System.out.println("Data berhasil dihapus.");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("ID tidak ditemukan.");
        }
    }
}



    
    

