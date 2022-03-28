public class N_MethodF {

    public static void main(String[] args) {
        B_Orang daru = new B_Orang("Daru Nugroho",20);
        cetakOrang(daru);
    }

    private static void cetakOrang (B_Orang orang) {
        System.out.println("Nama = " + orang.nama);
        System.out.println("Umur = " +orang.umur);
    }
}
