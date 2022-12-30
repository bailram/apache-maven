### Maven Properties
- Maven mendukung properties untuk menyimpan data konfigurasi
- Fitur ini akan sangat memudahkan kita kedepannya, dibandingkan melaukan hardcode di konfigurasi maven 

### Kode : Properties
bisa ditambahkan di pom.xml
```xml
<properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>14</maven.compiler.source>
    <maven.compiler.target>14</maven.compiler.target>
    <junit.version>4.6.2</junit.version>
</properties>
```

### Kode : Menggunakan Properties
pakai ${nama_properties} di pom.xml
```xml
<dependencies>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
        <version>${junit.version}</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```