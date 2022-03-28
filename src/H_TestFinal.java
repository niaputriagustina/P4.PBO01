public class H_TestFinal {

    final int x = 10;
    final double PI = 3.14;

    public static void main(String[] args) {
        H_TestFinal myObj = new H_TestFinal();
        //myObj.x = 50; This Will Generate Error : Cannot Assign A Vallue To A Final Vaiable
        //myObj.PI = 25; This Will Generate Error : Cannot Assign A Vallue To A Final Vaiable
        System.out.println(myObj);
    }
}
