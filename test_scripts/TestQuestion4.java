package test_scripts;

public class TestQuestion4 {
    public static String firstUniqueProduct(String[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            String current = arr[i];
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j].equals(current)) {
                    count++;
                }
            }

            if (count == 1) {
                return current;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        String[] products = {"Apple", "Computer", "Apple", "Bag"};

        String result = firstUniqueProduct(products);

        if (result == null) {
            System.out.println("null");
        } else {
            System.out.println("First unique product: " + result);
        }
    }
}
