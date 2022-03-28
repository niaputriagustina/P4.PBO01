import PaketA.F_Mobil;

public class F_TestMobil {
    public static void main(String[] args) {
        F_Mobil avanza = new F_Mobil("Innova","BM3210");
        avanza.jmlRoda = 4;
        avanza.bahanBakar = "Solar";
        avanza.fullAC = true;
        System.out.println(avanza.getInfo());
    }
}
