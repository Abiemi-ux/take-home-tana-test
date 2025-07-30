package test_scripts;

public class TestQuestion6 {
    public static String[] getTopThreeWords(String sentence) {
        String[] words = sentence.split(" ");
        String[] unique = new String[words.length];
        int[] counts = new int[words.length];
        int uniqueCount = 0;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            boolean found = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (unique[j].equals(word)) {
                    counts[j]++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique[uniqueCount] = word;
                counts[uniqueCount] = 1;
                uniqueCount++;
            }
        }

        String[] top3 = new String[3];
        for (int k = 0; k < 3; k++) {
            int maxIndex = -1;
            int maxCount = -1;
            for (int j = 0; j < uniqueCount; j++) {
                if (counts[j] > maxCount) {
                    maxCount = counts[j];
                    maxIndex = j;
                }
            }
            if (maxIndex != -1) {
                top3[k] = unique[maxIndex];
                counts[maxIndex] = -1;
            }
        }

        for (int i = 0; i < top3.length - 1; i++) {
            for (int j = i + 1; j < top3.length; j++) {
                if (top3[i].compareTo(top3[j]) > 0) {
                    String temp = top3[i];
                    top3[i] = top3[j];
                    top3[j] = temp;
                }
            }
        }

        return top3;
    }

    public static void main(String[] args) {
        String input = "hi there care to discuss algorithm basis or how to solve algorithm or";
        String[] result = getTopThreeWords(input);
        System.out.println("Top 3 words:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
