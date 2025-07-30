package test_scripts;

public class TestQuestion5 {
    public static int minDistance(int[] arr) {
        int n = arr.length;

        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int prevIndex = -1;
        int minDist = n;

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

        System.out.println("Minimum distance between minimum values: " + result);
    }
}
