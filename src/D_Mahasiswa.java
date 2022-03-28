public class D_Mahasiswa {

    private String nama;
    private int nrp;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNrp() {
        return nrp;
    }

    public void setNrp(int nrp) {
        this.nrp = nrp;
    }

    public D_Mahasiswa(String nama, int nrp) {
        this.nama = nama;
        this.nrp = nrp;
    }

    public void info() {
        System.out.println(nama + ", " + nrp);
    }

    public String toString() {
        System.out.println("Data Mahasiwa\n" + nama + "\n" + nrp);
        return null;
    }
}
