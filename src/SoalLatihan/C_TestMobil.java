package SoalLatihan;

//Membuat Class Mobil
class Mobil {

    //Membuat Variabel Global
    String objek;
    String merekMobil;
    String warnaMobil;
    String kategoriMobil;
    int hargaSewa;
    int jumlahUnit;

    //Membuat Constructor Dengan Parameter
    Mobil (String objek, String merekMobil, String warnaMobil, String kategoriMobil, int hargaSewa, int jumlahUnit) {
        this.objek = objek;
        this.merekMobil = merekMobil;
        this.warnaMobil = warnaMobil;
        this.kategoriMobil = kategoriMobil;
        this.hargaSewa = hargaSewa;
        this.jumlahUnit = jumlahUnit;
    }

    //Membuat Method
    public void InfoMobil () {
        System.out.print("" + objek);
        System.out.print("\t" + merekMobil);
        System.out.print("\t" + warnaMobil);
        System.out.print("\t" + kategoriMobil);
        System.out.print("\t" + hargaSewa);
        System.out.print("\t" + jumlahUnit);
    }
}

public class C_TestMobil {
    public static void main(String[] args) {

        //Membuat Objek
        Mobil mobil1 = new Mobil ("mobil1", "Toyota"," Biru","     Minibus",2000, 7);
        Mobil mobil2 = new Mobil ("mobil2", "Daihatsu", "Hitam", "Pick-up",   1500, 2);
        Mobil mobil3 = new Mobil ("mobil3", "Suzuki", "Silver", " SUV",     1800, 5);
        Mobil mobil4 = new Mobil ("mobil4", "Honda", " Merah", "   Sedan",  1300, 5);

        //Menampilkan Isi Objek
        System.out.println("Objek\t\tA\t\tB\t\tC\t\tD\t\tE");
        mobil1.InfoMobil();
        System.out.println();
        mobil2.InfoMobil();
        System.out.println();
        mobil3.InfoMobil();
        System.out.println();
        mobil4.InfoMobil();


    }
}
