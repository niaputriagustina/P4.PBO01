public class G_TestStatic {

    //Static Method
    static void myStaticMethod () {
        System.out.println("Static Methods Can Be Called Without Creating Objects");
    }

    //Public Method
    public void myPublicMethod () {
        System.out.println("Public Mehtods Must Be Called By Creating Objects");
    }

    //Main Mehtod
    public static void main(String[] args) {
        myStaticMethod(); //Call The Static Method
        //myPublicMethod(); This Would Output An Error

        G_TestStatic myObj = new G_TestStatic(); //Create An Object Of MyClass
        myObj.myPublicMethod(); //Call The Public Method
    }
}
