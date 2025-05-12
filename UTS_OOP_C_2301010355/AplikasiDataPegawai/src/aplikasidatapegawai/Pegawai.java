package aplikasidatapegawai;

/**
 *
 * @author Maria Droste D. Jehalu
 * TGL : 10 MEI 2025
 */
public class Pegawai {
    private int id;
    private String nama;
    private String alamat;
    private String statusKepegawaian;
    private String jabatan;
    private String divisi;
    private String catatanKehadiran;
    private String email;
    private String noTelepon;
    private String jadwalSertifikasi;

    // Constructor kosong
    public Pegawai() {}

    // Constructor lengkap
    public Pegawai(int id, String nama, String alamat, String statusKepegawaian, String jabatan,
                   String divisi, String catatanKehadiran, String email, String noTelepon, String jadwalSertifikasi) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.statusKepegawaian = statusKepegawaian;
        this.jabatan = jabatan;
        this.divisi = divisi;
        this.catatanKehadiran = catatanKehadiran;
        this.email = email;
        this.noTelepon = noTelepon;
        this.jadwalSertifikasi = jadwalSertifikasi;
    }

    // Getter dan Setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getAlamat() { return alamat; }
    public void setAlamat(String alamat) { this.alamat = alamat; }

    public String getStatusKepegawaian() { return statusKepegawaian; }
    public void setStatusKepegawaian(String statusKepegawaian) { this.statusKepegawaian = statusKepegawaian; }

    public String getJabatan() { return jabatan; }
    public void setJabatan(String jabatan) { this.jabatan = jabatan; }

    public String getDivisi() { return divisi; }
    public void setDivisi(String divisi) { this.divisi = divisi; }

    public String getCatatanKehadiran() { return catatanKehadiran; }
    public void setCatatanKehadiran(String catatanKehadiran) { this.catatanKehadiran = catatanKehadiran; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getNoTelepon() { return noTelepon; }
    public void setNoTelepon(String noTelepon) { this.noTelepon = noTelepon; }

    public String getJadwalSertifikasi() { return jadwalSertifikasi; }
    public void setJadwalSertifikasi(String jadwalSertifikasi) { this.jadwalSertifikasi = jadwalSertifikasi; }

    // Overriding toString
    @Override

    public String toString() {
        return "ID: " + id + ", Nama: " + nama + ", Alamat: " + alamat +
                ", Status: " + statusKepegawaian + ", Jabatan: " + jabatan +
                ", Divisi: " + divisi + ", Kehadiran: " + catatanKehadiran +
                ", Email: " + email + ", Telepon: " + noTelepon +
                ", Sertifikasi: " + jadwalSertifikasi;

    }
}


