# Hands-On Pekan 13 — Penerapan SOLID Programming

Repository ini berisi implementasi hasil *refactoring* kode Java berdasarkan prinsip **SOLID Programming** untuk tugas Hands-On Pekan 13 mata kuliah **Pemrograman Berorientasi Objek (PBO)**.

## Struktur Folder

```text
HandsOn-PBO-Pekan13-SOLID/
├── README.md
├── .gitignore
├── latihan1_notifikasi/
│   ├── Notifier.java
│   ├── EmailNotifier.java
│   ├── SMSNotifier.java
│   ├── WhatsAppNotifier.java
│   ├── TelegramNotifier.java
│   ├── NotificationService.java
│   └── Main.java
├── latihan2_penilaian/
│   ├── GradeCalculator.java
│   ├── GradeReportPrinter.java
│   ├── GradeRepository.java
│   └── Main.java
└── latihan3_smart_vehicle/
    ├── Vehicle.java
    ├── EnginePowered.java
    ├── FuelPowered.java
    ├── ElectricPowered.java
    ├── MobilBensin.java
    ├── MobilListrik.java
    ├── Sepeda.java
    ├── MobilHybrid.java
    └── Main.java
```

## Ringkasan Penerapan SOLID

1. **Latihan 1 — Notifikasi Multi-Platform (`latihan1_notifikasi/`)**
   - **Prinsip:** SRP, OCP, ISP, DIP
   - **Perubahan:** Memisahkan setiap platform notifikasi ke dalam kelas implementasi tersendiri yang mengimplementasikan *interface* kecil `Notifier`. `NotificationService` bergantung pada abstraksi `Notifier` sehingga kanal baru seperti `TelegramNotifier` dapat ditambahkan tanpa mengubah kode lama.

2. **Latihan 2 — Penilaian Mahasiswa (`latihan2_penilaian/`)**
   - **Prinsip:** SRP
   - **Perubahan:** Memecah kelas `StudentGrader` menjadi tiga kelas dengan tanggung jawab tunggal: `GradeCalculator` (perhitungan nilai), `GradeReportPrinter` (pencetakan laporan), dan `GradeRepository` (penyimpanan ke database).

3. **Latihan 3 — Smart Vehicle (`latihan3_smart_vehicle/`)**
   - **Prinsip:** ISP, OCP, LSP, SRP
   - **Perubahan:** Memisahkan kapabilitas kendaraan ke dalam *interface* spesifik (`Vehicle`, `EnginePowered`, `FuelPowered`, `ElectricPowered`). Tiap kendaraan hanya mengimplementasikan fitur yang relevan dan kendaraan baru seperti `MobilHybrid` dapat ditambahkan tanpa memodifikasi kelas yang ada.

## Cara Menjalankan Program

Pastikan **JDK (Java Development Kit)** sudah terpasang di perangkat Anda, lalu jalankan perintah berikut dari folder root proyek:

### Latihan 1
```bash
cd latihan1_notifikasi
javac *.java
java Main
```

### Latihan 2
```bash
cd latihan2_penilaian
javac *.java
java Main
```

### Latihan 3
```bash
cd latihan3_smart_vehicle
javac *.java
java Main
```
