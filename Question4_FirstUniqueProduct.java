public class Question4_FirstUniqueProduct {
    public static String firstUniqueProduct(String[] arr) {
        // Count appearances of each string using two loops
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            String current = arr[i];
            int count = 0;

            // Count how many times current appears
            for (int j = 0; j < n; j++) {
                if (arr[j].equals(current)) {
                    count++;
                }
            }

            // If appears exactly once, return it immediately
            if (count == 1) {
                return current;
            }
        }

        // If no unique found
        return null;
    }

    public static void main(String[] args) {
        String[] products = {"Apple", "Computer", "Apple", "Bag"};

        String result = firstUniqueProduct(products);

        if (result == null) {
            System.out.println("null");
        } else {
            System.out.println(result);
        }
    }
}

