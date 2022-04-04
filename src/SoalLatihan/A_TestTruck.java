package SoalLatihan;

class Truck {

    //Membuat Variabel Global
    double muatan;
    double muatanMaks;

    //Membuat Constructor Dengan Parameter
    Truck (double muatanMaks) {
        this.muatanMaks = muatanMaks;
    }

    //Membuat Mehtod
    public double getMuatan () {
        return muatan;
    }

    public void setMuatan (double muatan) {
        this.muatan = muatan;
    }

    public double getMuatanMaks () {
        return muatanMaks;
    }

    public void setMuatanMaks (double muatanMaks) {
        this.muatanMaks = muatanMaks;
    }

    //Ditambah Kondisi If
    public void tambahMuatan (double berat) {
        double total;
        total = this.muatan = muatan + berat;

        if (total > muatanMaks) {
            System.out.println("Muatan Tidak Bisa Ditambah Lagi!");
            total = this.muatan = muatan - berat;
        }
    }

    //Ditambah Method Konversi Kg Ke Newton
    public void kgToNewton () {
        double total;
        total = this.muatan = muatan * 9.8;
        System.out.println(total);
    }
}

public class A_TestTruck {

    public static void main(String[] args) {

        //Membuat Objek
        Truck truk = new Truck (1000);

        //Mengakses Method
        System.out.println("Muatan Maksimal = " + truk.getMuatanMaks());
        truk.tambahMuatan(500.0);
        System.out.println("Tambah Muatan : 500");
        truk.tambahMuatan(350.0);
        System.out.println("Tambah Muatan : 350");
        truk.tambahMuatan(100.0);
        System.out.println("Tambah Muatan : 100");
        truk.tambahMuatan(150.0);
        System.out.println("Tambah Muatan : 150");
        System.out.println("Muatan Sekarang = " + truk.getMuatan());
        System.out.println("Muatan Dikonversi Ke Newton");
        truk.kgToNewton();
    }
}
