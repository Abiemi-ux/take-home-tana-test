public class Question3_MakeZero {

    public static int canMakeZeros(int[] arr) {
        int n = arr.length;

        // Try to make all elements zero from the end
        for (int i = n - 1; i >= 1; i--) {
            if (arr[i] >= arr[i - 1]) {
                arr[i] = arr[i] - arr[i - 1];
            } else {
                return 0; // can't subtract if the left one is bigger
            }
        }

        // Now I check if all except the first are zero
        for (int i = 1; i < n; i++) {
            if (arr[i] != 0) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3}; 

        int result = canMakeZeros(a);

        System.out.println(result);
    }
}
