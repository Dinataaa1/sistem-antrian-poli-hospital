package model;

// Kelas ini berdiri sendiri (tidak bergantung kelas lain).
public class Dokter {
    private String namaDokter;
    private String spesialis;

    public Dokter(String namaDokter, String spesialis) {
        this.namaDokter = namaDokter;
        this.spesialis = spesialis;
    }

    public String getNamaDokter() { return namaDokter; }
    public String getSpesialis() { return spesialis; }
}
