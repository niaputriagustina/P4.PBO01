public class C_TestOrang {
    public static void main(String[] args) {
        B_Orang dido = new B_Orang();
        dido.nama = "Dido";
        dido.umur = 4;
        System.out.println("Nama : " +dido.nama);
        System.out.println("Umur : " +dido.umur+ " Tahun.");
        dido.menangis();

        System.out.println();

//        B_Orang dodo = new B_Orang("Dodo");
//        System.out.println("Nama : " +dodo.nama);
//        System.out.println("Umur : " +dodo.umur+ " Tahun.");
//        dodo.tertawa();

//        B_Orang badu = new B_Orang(); //Constructor Tanpa Parameter
//        badu.nama = "Badu";
//        badu.umur = 12;
//        System.out.println("Nama : " +badu.nama);
//        System.out.println("Umur : " +badu.umur+ " Tahun.");
//        badu.tertawa();
//
//        System.out.println();

//        B_Orang dodo = new B_Orang("Dodo", 10); //Constructor Dengan 2 Parameter
//        System.out.println("Nama : " +dodo.nama);
//        System.out.println("Umur : " +dodo.umur+ " Tahun.");
//        dodo.menangis();

        System.out.println();

        B_Orang jono = new B_Orang("Jono",12,168,76); //Constructor Dengan 4 Parameter
        System.out.println("Nama : " +jono.nama);
        System.out.println("Umur : " +jono.umur+ " Tahun.");
        System.out.println("Tinggi Badan : " +jono.tinggiBadan+ " CM.");
        System.out.println("Berat Badan : " +jono.beratBadan+ " Kg.");
        jono.tertawa();
    }
}
