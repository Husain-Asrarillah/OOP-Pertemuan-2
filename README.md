# 📘 Laporan Praktikum OOP – Pertemuan Kedua

**Nama:** Husain Asrarillah  
**NIM:** 09020624035  
**Mata Kuliah:** Object Oriented Programming (OOP)  
**Tugas:** Praktikum Pertemuan Kedua  

---

## 📌 Deskripsi
Repository ini berisi laporan dan implementasi kode program dari praktikum **Pertemuan Kedua** mata kuliah OOP.  
Pada praktikum ini dipelajari konsep dasar **Class**, **Inheritance**, serta penggunaan **Interface** dalam Java.  

Struktur program terdiri dari:
- **Superclass** → `Kendaraan`  
- **Interface** → `Pemilik`, `Pemelihara`, `Pengemudi`  
- **Subclass** → `Mobil` (yang mewarisi `Kendaraan` dan mengimplementasikan ketiga interface)  

---

## 📂 Struktur File
```

PertemuanKedua/
│
├── Kendaraan.java      # Superclass
├── Pemilik.java        # Interface Pemilik
├── Pemelihara.java     # Interface Pemelihara
├── Pengemudi.java      # Interface Pengemudi
└── Mobil.java          # Subclass yang extends Kendaraan dan implements interface

````

---

## ⚙️ Konsep yang Digunakan
1. **`this`** → digunakan dalam konstruktor `Kendaraan` untuk membedakan antara parameter dan atribut class.  
   ```java
   this.merk = merk;
   this.tahun = tahun;
````

`this` di sini menunjuk ke atribut milik objek saat ini.

2. **`super`** → digunakan pada konstruktor `Mobil` untuk memanggil konstruktor dari superclass (`Kendaraan`).

   ```java
   super(merk, tahun);
   ```

   Dengan `super`, subclass bisa mengisi atribut bawaan dari superclass tanpa harus menuliskan ulang.

## 📝 Kesimpulan

* Praktikum ini berhasil menunjukkan bagaimana membuat **class**, **subclass**, dan **interface** di Java.
* Keyword **`this`** membantu mengakses atribut dalam objek saat ini.
* Keyword **`super`** digunakan untuk memanfaatkan atribut dan konstruktor dari superclass.

---

✍️ *Laporan ini dibuat oleh Husain Asrarillah (09020624035) sebagai bukti telah menyelesaikan tugas SPADA pada pertemuan kedua mata kuliah OOP.*

```
