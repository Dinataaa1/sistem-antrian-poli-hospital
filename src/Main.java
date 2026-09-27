import model.Dokter;
import model.Pasien;
import poli.Poli;
import poli.PoliAnak;
import poli.PoliGigi;
import poli.PoliUmum;
import rumahsakit.RumahSakit;

public class Main {
    public static void main(String[] args) {
        RumahSakit rs = RumahSakit.getInstance();

        // Dokter dan Pasien dibuat terpisah (berdiri sendiri)
        Dokter dokterUmum = new Dokter("dr. Budi", "Dokter Umum");
        Dokter dokterGigi = new Dokter("drg. Sari", "Dokter Gigi");
        Dokter dokterAnak = new Dokter("dr. Rina, Sp.A", "Spesialis Anak");

        Pasien andi  = new Pasien("3578010101900001", "Andi", "Laki-laki");
        Pasien bunga = new Pasien("3578015505920002", "Bunga", "Perempuan");
        Pasien cahyo = new Pasien("3578010202850003", "Cahyo", "Laki-laki");
        Pasien dita  = new Pasien("3578014404180004", "Dita", "Perempuan");

        PoliUmum poliUmum = new PoliUmum("Poli Umum", dokterUmum);
        PoliGigi poliGigi = new PoliGigi("Poli Gigi", dokterGigi);
        PoliAnak poliAnak = new PoliAnak("Poli Anak", dokterAnak);

        rs.tambahPoli(poliUmum);
        rs.tambahPoli(poliGigi);
        rs.tambahPoli(poliAnak);

        // Keluhan dan hari diinput saat mendaftar ke poli
        rs.tambahPasienKePoli(andi,  poliUmum, "Demam", "Senin");
        rs.tambahPasienKePoli(bunga, poliUmum, "Batuk", "Senin");
        rs.tambahPasienKePoli(cahyo, poliGigi, "Sakit gigi", "Selasa");
        rs.tambahPasienKePoli(andi,  poliGigi, "Gusi bengkak", "Selasa");  // Andi yang sama, poli lain
        rs.tambahPasienKePoli(dita,  poliAnak, "Demam", "Rabu");

        rs.tampilkanAntrian();

        // Polymorphism: tipe sama (Poli), perilaku berbeda tiap poli
        System.out.println("\n=== Pasien Masuk Ruangan ===");
        Poli[] semuaPoli = { poliUmum, poliGigi, poliAnak };
        for (Poli poli : semuaPoli) {
            poli.panggilAntrian();
            poli.prosesPemeriksaan();
            System.out.println();
        }

        rs.tampilkanAntrian();
    }
}
