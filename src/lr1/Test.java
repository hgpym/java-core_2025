package lr1;

public class Test {
    public static void main(String[] args) {
        int[] intArray = {3, 4, 5};
        float[] floatArray = new float[] {7.2f, 1.8f, 9.3f};
        char[] charArray = new char[2];
        System.out.println("intArray(foreach)");
        for(var i : intArray) {
            System.out.print(i + " ");
        }
        System.out.println("\nintArray(for)");
        for(int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println("\nfloatArray(foreach)");
        for(var i : floatArray) {
            System.out.print(i + " ");
        }
        System.out.println("\nfloatArray(for)");
        for(int i = 0; i < floatArray.length; i++) {
            System.out.print(floatArray[i] + " ");
        }
        System.out.println("\ncharArray(foreach)");
        for(var i : charArray) {
            System.out.print(i + " ");
        }
        System.out.println("\ncharArray(for)");
        for(int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i] + " ");
        }
    }
}
