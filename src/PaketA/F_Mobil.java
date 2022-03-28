package PaketA;

public class F_Mobil {
    private String nama;
    private String noBm;
    public int jmlRoda;
    public String bahanBakar;
    public boolean fullAC;

    public F_Mobil (String nama, String noBm) {
        this.nama = nama;
        this.noBm = noBm;
        this.jmlRoda = 4;
        this.bahanBakar = "Bensin";
        this.fullAC = true;
    }

    public String getInfo() {
        String info = "Mobil : " +nama+
                "\nNomor BM : " +noBm+
                "\nJumlah Roda : " +jmlRoda+
                "\nJenis Bahan Bakar : " +bahanBakar+
                "\nFull AC : " +fullAC;
        return info;
    }
}
