public class O_MethodG {
    public static void main(String[] args) {
        B_Orang dosen = getOrang("Depandi Enda",29);
        cetakOrang(dosen);
    }

    private static void cetakOrang (B_Orang orang) {
        System.out.println("Nama : " +orang.nama);
        System.out.println("Umur : " +orang.umur+ " Tahun.");
    }

    private static B_Orang getOrang (String nama, int umur) {
        B_Orang orang = new B_Orang (nama, umur);
        return orang;
    }

}
