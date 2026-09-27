package model;

// Data pribadi saja. Kelas ini berdiri sendiri (tidak bergantung kelas lain).
public class Pasien {
    private String nik;
    private String nama;
    private String jenisKelamin;

    public Pasien(String nik, String nama, String jenisKelamin) {
        this.nik = nik;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNik() { return nik; }
    public String getNama() { return nama; }
    public String getJenisKelamin() { return jenisKelamin; }
}
