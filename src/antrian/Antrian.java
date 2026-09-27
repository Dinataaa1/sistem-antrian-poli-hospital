package antrian;

import model.Pasien;

// Satu tiket antrian = satu kunjungan pasien ke sebuah poli.
// Kelas ini yang "memanggil" Pasien, sehingga Pasien tetap berdiri sendiri.
public class Antrian {
    private int nomorAntrian;
    private Pasien pasien;
    private String keluhan;
    private String hari;

    public Antrian(int nomorAntrian, Pasien pasien, String keluhan, String hari) {
        this.nomorAntrian = nomorAntrian;
        this.pasien = pasien;
        this.keluhan = keluhan;
        this.hari = hari;
    }

    public int getNomorAntrian() { return nomorAntrian; }
    public Pasien getPasien() { return pasien; }
    public String getKeluhan() { return keluhan; }
    public String getHari() { return hari; }
}
