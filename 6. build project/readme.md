### Build Project
- Saat kita membuat project biasanya akan ada 2 jenis kode yang kita buat, kode program nya, dan kode testing nya
- Maven mendukung hal tersebut

### Menjalankan Kompilasi Program
```
mvn compile
```

### Menjalankan Unit Test
```
mvn test
```

### Mem-package Project
```
mvn package
```
nanti target filenya akan ada di folder target. misal pengen running berarti harus
```
java -jar target/belajar-maven-1.0-SNAPSHOT.jar
```
