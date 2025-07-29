public class Question5_MinDistance {

    public static int minDistance(int[] arr) {
        int n = arr.length;

        // Step 1: Find minimum value
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Step 2: Find smallest distance between consecutive minimums
        int prevIndex = -1;
        int minDist = n;  // Start with max possible distance

        for (int i = 0; i < n; i++) {
            if (arr[i] == min) {
                if (prevIndex != -1) {
                    int dist = i - prevIndex;
                    if (dist < minDist) {
                        minDist = dist;
                    }
                }
                prevIndex = i;
            }
        }

        return minDist;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5, 2};

        int result = minDistance(arr);

        System.out.println(result);  // Expected output: 3
    }
}
