### Multi Module Project
- Saat aplikasi sudah sangat besar, kadang ada baiknya kita buat aplikasi dalam bentuk modular
- MIsal kita pisahkan module model, controller, view, service, repository, dan lain-lain
- Untungnya, Maven mendukung pembuatan project multi module

### Membuat Module Baru
- Untuk membuat module baru, di dalam project yang sudah ada, kita hanya tinggal membuat folder baru, lalu menambahkan setting pom.xml di folder tesebut
- Module harus memiliki parnet, dimana parent nya adalah project diatas folder tersebut
- Selanjutnya, di parent nya pun, module harus diinclude 

### Konfigurasi Module
```xml
    <parent>
        <artifactId>belajar-maven</artifactId>
        <groupId>bailram</groupId>
        <version>1.0-SNAPSHOT</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <artifactId>belajar-maven-data</artifactId>

</project>
```

### Konfigurasi Parent
```xml
    <modelVersion>4.0.0</modelVersion>

    <groupId>bailram</groupId>
    <artifactId>belajar-maven</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>pom</packaging>
    <modules>
        <module>belajar-maven-data</module>
    </modules>

    <name>beajar maven</name>
```

### Run
- tambahkan dulu konfigurasi distribution filenya
- compile dulu
```apache
mvn clean package assembly:single
```
- run jar di folder /target/xxxx-jar-with-dependencies.jar di module yang ada main classnya
```apache
java -jar apache-maven-app/target/apache-maven-app-1.0-SNAPSHOT-jar-with-dependencies.jar

```