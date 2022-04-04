package SoalLatihan;

//Membuat Class
class Pegawai {

    //Membuat Variabel Global
    int nip;
    String nama;

    //Membuat Constructor
    public Pegawai (int nip_pegawai) {
        this(nip_pegawai,"NoName");
    }

    //Membuat Method
    public Pegawai (int nip_pegawai, String nama_pegawai) {
        this.nip = nip_pegawai;
        this.nama = nama_pegawai;
    }
}

public class E_Pegawai {
    /*
    Tidak dapat dijalankan, karena tidak ada main method nya. Sebuah program hanya akan dieksekusi apabila terdapat main
    method, dimana syntaks nya seperti ini : public static void main (String [] args) { }. Di dalam main method tersebut
    pula fungsi fungsi dari kelas kelas sebelumnya dapat dijalankan atau dieksekusi oleh komputer.
     */

}
