public class Question2_UniqueSums {

    public static int countWays(int[] numbers, int result) {
        return findWays(numbers, 0, result);
    }

    public static int findWays(int[] numbers, int pos, int need) {
        // Found exact match!
        if (need == 0) {
            return 1;
        }
        
        // No more numbers or went over result
        if (pos >= numbers.length || need < 0) {
            return 0;
        }
        
        // Current number we're deciding about
        int currentNum = numbers[pos];
        
        // Option 1: Take this number
        int takeIt = findWays(numbers, pos + 1, need - currentNum);
        
        // Option 2: Skip this number  
        int skipIt = findWays(numbers, pos + 1, need);
        
        // Total ways = take it + skip it
        return takeIt + skipIt;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 60, 50, 70, 20};
        int result = 120;
        
        int ways = countWays(numbers, result);
        System.out.println(ways + " ways to sum to " + result);
        
        //Test 2
        int[] simple = {1, 2, 3, 4, 5};
        int simpleResult = 10;
        int simpleWays = countWays(simple, simpleResult);
        System.out.println(simpleWays + " ways to sum to " + simpleResult);
    }
}