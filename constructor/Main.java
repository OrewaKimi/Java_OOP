package oop.kim.constructor;

// class tanpa constructor / class polos
class Polos {
    String dataString;
    int dataInteger;
}

// class dengan constructor
class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;

    // constructor dengan parameter
    Mahasiswa(String inputNama, String inputNIM, String inputJurusan) {
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;
    }

    // metode untuk menampilkan informasi mahasiswa
    String info() {
        return "Nama: " + nama + "\nNIM: " + NIM + "\nJurusan: " + jurusan;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {

        Mahasiswa mahasiswa1 = new Mahasiswa("Usopp", "1140501", "Teknik Sniper");
        Mahasiswa mahasiswa2 = new Mahasiswa("Franky", "1140502", "Teknik Arsitektur");

        // Menampilkan informasi mahasiswa menggunakan metode info()
        System.out.println("Informasi Mahasiswa 1:\n" + mahasiswa1.info());
        System.out.println("\nInformasi Mahasiswa 2:\n" + mahasiswa2.info());

        // Contoh penggunaan class Polos (tidak dihapus, tetapi tidak digunakan)
        // Polos objectPolos = new Polos();
        // objectPolos.dataString = "polos";
        // objectPolos.dataInteger = 0;

        // System.out.println(objectPolos.dataString);
        // System.out.println(objectPolos.dataInteger);
    }
}