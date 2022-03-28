public class A_Mahasiswa {
    public static class Mahasiswa {
        public int nrp;
        public String nama;
        public void info () {
            System.out.println("Ini Siswa RPL Polbeng");
        }
    }
    public static void main(String[] args) {
        Mahasiswa it = new Mahasiswa();
        it.nrp = 5;
        it.nama = "Andi";
        it.info();
    }
}
