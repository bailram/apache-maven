### Dependency Management
- Saat project kita sudah besar, kadang kita sering menggunakan banyak dependency
- Masalah dengan banyaknya dependency adalah, jika kita salah menggunakan depedency yang sama namun versinya berbeda-beda
- Maven mendukung fitur dependency management, dimana kita bisa memasukkan daftar dependency di parent module berserta versinya, lalu menambahkan dependency tersebut di module tanpa harus menggunakan versinya
- Secara otomatis versi dependency akan sama dengan yang ada di dependency management di parent module

### Dependency Managmenet di Parent
```xml
<dependencyManagement>
    <dependenies>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>${junit.version}</version>
        </dependency>
        <dependency>
            <groupId>bailram</groupId>
            <artifactId>belajar-maven-data</artifactId>
            <version>${project.version}</version>
        </dependency>
    </dependenies>
<dependencyManagement>
```
setelah menambahkan dependency management itu di parent pom.xml nya. yang artinya dependency yang ada di depedency management ini bersifat default value version.<br>

fungsinya ketika ingin menambahkan salah satu depnedency yang ada di dependency management parent classnya di child modulenya. tinggal menyebutkan group id dan artifact id nya saja, tanpa perlu menyebutkan version nya.

### Dependency di Module
```xml
<dependencies>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
    </dependency>
    <dependency>
        <groupId>bailram</groupId>
        <artifactId>belajar-maven-data</artifactId>
    </dependency>
</dependencies>
```