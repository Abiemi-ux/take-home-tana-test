public class Question3_MakeZero {

    public static int canMakeZeros(int[] arr) {
        int n = arr.length;
        int g = arr[0];

        for (int i = 1; i < n; i++) {
            g = gcd(g, arr[i]);
        }

        // If the gcd is equal to the first element, it is possible
        if (g == arr[0]) {
            return 1;
        }
        return 0;
    }

    // Helper function to compute gcd
    private static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int result = canMakeZeros(a);
        System.out.println(result);
    }
}
