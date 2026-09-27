package rumahsakit;

import java.util.ArrayList;
import java.util.List;
import model.Pasien;
import poli.Poli;

public class RumahSakit {
    private static RumahSakit instance;   // satu-satunya objek (Singleton)

    private String namaRS;
    private List<Poli> daftarPoli = new ArrayList<>();

    private RumahSakit() {                // private: tidak bisa "new" dari luar
        this.namaRS = "RS Sehat Sentosa";
    }

    public static RumahSakit getInstance() {
        if (instance == null) {
            instance = new RumahSakit();
        }
        return instance;
    }

    public void tambahPoli(Poli poli) {
        daftarPoli.add(poli);
    }

    public void tambahPasienKePoli(Pasien pasien, Poli poli, String keluhan, String hari) {
        poli.tambahPasien(pasien, keluhan, hari);
    }

    public void tampilkanAntrian() {
        System.out.println("=== Antrian " + namaRS + " ===");
        for (Poli poli : daftarPoli) {
            poli.tampilkanAntrian();
        }
    }
}
