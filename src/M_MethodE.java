public class M_MethodE {
    public static void main(String[] args) {
        int [] myArray = {1,3,5,7,9,11};
        cetakArray(myArray);
    }

    private static void cetakArray (int [] array) {
        for (int i=0; i< array.length; i++) {
            System.out.print(String.valueOf(array[i]));
        }
        System.out.println();
    }
}
