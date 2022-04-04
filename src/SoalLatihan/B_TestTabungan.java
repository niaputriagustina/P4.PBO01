package SoalLatihan;

//Membuat Class Tabungan
class Tabungan {

    //Membuat Variabel Global
    private int noRekening;
    private long saldo;

    //Membuat Constructor Dengan Parameter
    Tabungan (int noRekening, int saldo) {
        this.noRekening = noRekening;
        this.saldo = saldo;
    }

    //Membuat Method
    public int getNoRekening () {
        return noRekening;
    }

    public void setNoRekening (int noRekening) {
        this.noRekening = noRekening;
    }

    public long getSaldo () {
        return saldo;
    }

    public void setSaldo (long saldo) {
        this.saldo = saldo;
    }

    public void debit (long jumlah) {
        this.saldo = saldo + jumlah;
    }

    public void kredit (long jumlah) {
        this.saldo = saldo - jumlah;
    }
}

public class B_TestTabungan {
    public static void main(String[] args) {

        //Membuat Objek
        Tabungan tabungan = new Tabungan (1, 5000);

        //Mengakses Method
        System.out.println("Saldo Awal : " + tabungan.getSaldo());
        System.out.println("\nJumlah Uang Yang Disimpan : 3000");
        tabungan.debit(3000);
        System.out.println("\nJumlah Uang Yang Diambil : 6000");
        tabungan.kredit(6000);
        System.out.println("Jumlah Uang Yang Disimpan : 3500");
        tabungan.debit(3500);
        System.out.println("Jumlah Uang Yang Diambil : 4000");
        tabungan.kredit(4000);
        System.out.println("Jumlah Uang Yang Diambil : 1600");
        tabungan.kredit(1600);
        System.out.println("Jumlah Uang Yang Disimpan : 2000");
        tabungan.debit(2000);
        System.out.println("\nSisa Saldo Sekarang = " + tabungan.getSaldo());

    }
}
