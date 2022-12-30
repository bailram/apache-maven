### Lifecycle
- Maven bekerja dalam konsep lifecycle
- Untuk menjalankan lifecycle, kita bisa menggunakan perintah : mvn namalifecycle
- Lifecycle akan menjalankan banyak plugin, entah bawaan maven, atau bisa kita tambahkan plugin lain jika mau
- https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html

### Contoh Lifecycle
- clean, menghapus folder target (tempat menyimpan hasil kompilasi)
- compile, untuk melakukan kompilasi source code project ke binary
- test-compile, untuk melakukan kopmilasi source code project ke binary 
- test, untuk menjalankan unit test
- package, untuk membuat distribution file aplikasi
- install, untuk menginstall project ke local repository, sehingga bisa digunakan di project lain di local
- deploy, deploy project ke remote repository di server
