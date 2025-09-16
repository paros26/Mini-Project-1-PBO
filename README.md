# Mini-Project-1-PBO

Sistem Manajemen Penyewaan Kendaraan
📌 Deskripsi Program

Program ini adalah aplikasi CRUD sederhana berbasis Java untuk mengelola data penyewaan kendaraan.
Fitur yang tersedia meliputi menambahkan kendaraan, melihat daftar kendaraan, mengupdate data, menghapus data, serta pencarian (search) kendaraan berdasarkan nama atau jenis.

Program ini dikembangkan menggunakan konsep OOP (Object Oriented Programming) dengan struktur MVC sederhana serta pemisahan class dalam packages sesuai fungsinya.

## Struktur Project


<img width="383" height="177" alt="image" src="https://github.com/user-attachments/assets/8f04d922-dc0a-4e8d-8346-70cc9d59c4ed" />


main/Main.java → berisi menu utama dan interaksi dengan user.

model/Kendaraan.java → class model yang merepresentasikan data kendaraan.

service/KendaraanService.java → berisi logika CRUD (Create, Read, Update, Delete) dan fitur pencarian.

## Fitur Program


<img width="478" height="165" alt="image" src="https://github.com/user-attachments/assets/5795a404-5aa0-43f4-9eac-2b93b2a2dd02" />



* Tambah Kendaraan → input data kendaraan baru (nama, jenis, harga).

* Lihat Semua Kendaraan → menampilkan seluruh data kendaraan.

* Update Kendaraan → memperbarui data kendaraan berdasarkan nomor urut.

* Hapus Kendaraan → menghapus data kendaraan dari daftar.

* Cari Kendaraan → mencari kendaraan berdasarkan nama atau jenis.

* Keluar → mengakhiri program.


## Alur Program

1. User menjalankan program melalui Main.java.

2. Program menampilkan menu utama (1–6).

3. User memilih menu, lalu sistem menjalankan fungsi di KendaraanService.

4. Data kendaraan disimpan dalam ArrayList<Kendaraan>.

5. User bisa menambahkan, melihat, memperbarui, menghapus, dan mencari data kendaraan.

Program berjalan terus hingga user memilih menu Keluar.


## Nilai Tambahan

1. Fitur Search

   <img width="849" height="538" alt="image" src="https://github.com/user-attachments/assets/0d94ef3e-7194-471f-95ae-a76a284070aa" />


Jadi saya di sini menerapkan fitur serach untuk mencari kendaraan yang telah di input


2.Validasi Input


   <img width="945" height="499" alt="image" src="https://github.com/user-attachments/assets/fec14163-90dc-42ce-9abe-40395da0a992" />


   Jadi di sini saya menerapkan validasi pada menu tambahkan kendaraan yang di bagian input harga sewa, apa bila menginput berupa huruf atau kosong maka akan terjadi alert dan melakukan validasi untul input ulang
