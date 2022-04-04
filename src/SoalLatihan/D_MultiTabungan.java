package SoalLatihan;

//Membuat Class
class MultiTabungan {

    //Membuat Variabel
    private int noRekening;
    private long saldo;

    //Membuat Constructor Dengan Parameter
    MultiTabungan (int noRekening, long saldo) {
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

    public void debitIDR (long jumlah) {
        this.saldo = saldo + jumlah;
    }

    public void kreditIDR (long jumlah) {
        this.saldo = saldo - jumlah;
    }

    public void debitAUD (long jumlah) {
        long total;
        total = jumlah * 16000;
        this.saldo = saldo + total;
    }

    public void kreditAUD (long jumlah) {
        long AUD = 16000;
        this.saldo = saldo - (AUD * jumlah);
    }

    public void debitUSD (long jumlah) {
        long total;
        total = jumlah * 15000;
        this.saldo = saldo + total;
    }

    public void kreditUSD (long jumlah) {
        long USD = 15000;
        this.saldo = saldo - (USD * jumlah);
    }
}

public class D_MultiTabungan {
    public static void main(String[] args) {
        //Membuat Objek
        MultiTabungan tabungan = new MultiTabungan(1, 100000);
        System.out.println("Saldo Awal : " + tabungan.getSaldo());

        System.out.println("Jumlah Uang Yang Disimpan (IDR) : 3000");
        tabungan.debitIDR(30000);
        System.out.println("Jumlah Uang Yang Diambil (IDR) : 6000");
        tabungan.kreditIDR(60000);

        //Dalam Mata Uang USD
        System.out.println("Jumlah Uang Yang Disimpan (USD) : 5 USD");
        tabungan.debitUSD(5);
        System.out.println("Jumlah Uang Yang Diambil (USD) : 4 USD");
        tabungan.kreditUSD(4);

        //Dalam Mata Uang AUD
        System.out.println("Jumlah Uang Yang Diambil (AUD) : 3 AUD");
        tabungan.kreditAUD(3);
        System.out.println("Jumlah Uang Yang Disimpan (AUD) : 4 AUD");
        tabungan.debitAUD(4);

        System.out.println("\nSisa Saldo Sekarang = " + tabungan.getSaldo());
    }
}
