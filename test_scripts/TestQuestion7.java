package test_scripts;

public class TestQuestion7 {
    public static String[] rotateRight(String[] arr, int n) {
        int size = arr.length;
        String[] rotated = new String[size];
        n = n % size;

        for (int i = 0; i < size; i++) {
            int newIndex = (i + n) % size;
            rotated[newIndex] = arr[i];
        }

        return rotated;
    }

    public static void main(String[] args) {
        String[] list = {"ID_A01", "ID_A02", "ID_A03", "ID_A04", "ID_A05", "ID_A06"};
        int n = 2;

        String[] result = rotateRight(list, n);
        System.out.println("Rotated list:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }
}
