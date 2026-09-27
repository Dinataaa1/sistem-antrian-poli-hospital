package poli;

import antrian.Antrian;
import java.util.LinkedList;
import java.util.Queue;
import model.Dokter;
import model.Pasien;

public abstract class Poli {
    protected String namaPoli;
    protected Dokter dokter;                                  // dokter (beserta spesialisnya) milik poli ini
    protected Queue<Antrian> daftarAntrian = new LinkedList<>();
    protected int nomorTerakhir = 0;

    public Poli(String namaPoli, Dokter dokter) {
        this.namaPoli = namaPoli;
        this.dokter = dokter;
    }

    // Pendaftaran ke poli: keluhan dan hari diinput di sini, lalu dicatat dalam tiket Antrian
    public void tambahPasien(Pasien pasien, String keluhan, String hari) {
        nomorTerakhir++;
        Antrian a = new Antrian(nomorTerakhir, pasien, keluhan, hari);
        daftarAntrian.add(a);
    }

    public void tampilkanAntrian() {
        System.out.println("[" + namaPoli + "] Dokter: " + dokter.getNamaDokter()
                + " (" + dokter.getSpesialis() + ")");
        if (daftarAntrian.isEmpty()) {
            System.out.println("   (antrian kosong)");
        }
        for (Antrian a : daftarAntrian) {
            System.out.println("   No. " + a.getNomorAntrian() + " - " + a.getPasien().getNama());
        }
    }

    public abstract void panggilAntrian();      // pasien terdepan masuk ruangan
    public abstract void prosesPemeriksaan();   // pasien terdepan diperiksa lalu keluar antrian
}
