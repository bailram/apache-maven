### Membuat Distribution File
- Secara defualt, maven mendukung pembuatan distribution file menggunakan lifecycle package
- Hanya saja, hasil disstribution file nya berupa file jar yang berisikan binary code dari project kita
- Dependency lainnya tidak dimasukkan, sehingga tidak bisa langsung dijalankan

### Menggunakan Assembly Plugin
- Salah satu plugin yang bisa kita gunakan untuk membuat distribution file beserta dependecy yang kita butuhkan adalah Assembly Plugin
- https://maven.apache.org/plugins/maven-assembly-plugin/usage.html
- Tidak hanya Assembly Plugin, sebenarnya masih banyak plugin lain yang bisa kita gunakan untuk membuat distribution file di Maven
- Untuk membuat distribution file, kita bisa menggunakan perintah 
```apache
mvn package assembly:single
```

