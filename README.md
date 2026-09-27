# Hospital Queue System (Java)

Program sederhana simulasi antrian poli rumah sakit, dibuat dengan Java murni (tanpa framework) untuk mempraktikkan konsep OOP: **abstraction, inheritance, polymorphism**, dan **singleton pattern**.

## Fitur

- Pendaftaran pasien ke poli (Poli Umum, Poli Gigi, Poli Anak)
- Setiap poli memiliki dokter dan antrian tiketnya sendiri
- Pemanggilan & pemeriksaan antrian dengan perilaku berbeda tiap poli (polymorphism)
- Data rumah sakit dikelola sebagai satu instance tunggal (singleton)

## Struktur Proyek

```
hospital-queue-system/
└── src/
    ├── Main.java                    # program utama, jalankan dari sini
    ├── model/
    │   ├── Pasien.java              # data pribadi pasien
    │   └── Dokter.java              # data dokter
    ├── antrian/
    │   └── Antrian.java             # tiket antrian (nomor, pasien, keluhan, hari)
    ├── poli/
    │   ├── Poli.java                # kelas abstrak, induk semua poli
    │   ├── PoliUmum.java
    │   ├── PoliGigi.java
    │   └── PoliAnak.java
    └── rumahsakit/
        └── RumahSakit.java          # singleton, mengelola semua poli
```

## Cara Menjalankan

Dari dalam folder `hospital-queue-system`:

```bash
javac -d out src/*.java src/*/*.java
java -cp out Main
```

## Konsep OOP yang Dipakai

| Konsep | Implementasi |
|---|---|
| Abstraction | `Poli` sebagai kelas abstrak |
| Inheritance | `PoliUmum`, `PoliGigi`, `PoliAnak` mewarisi `Poli` |
| Polymorphism | Setiap poli punya `panggilAntrian()` & `prosesPemeriksaan()` dengan perilaku sendiri |
| Singleton | `RumahSakit.getInstance()` memastikan hanya ada satu objek rumah sakit |

## Lisensi

Proyek ini dirilis di bawah [MIT License](LICENSE).
