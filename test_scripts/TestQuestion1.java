package test_scripts;

public class TestQuestion1 {
    public static void main(String[] args) {
        String[] listofWords = {"AABCDA", "ABCDZADC", "ABCDBCA", "ABCDABDCA"};
        String ValidCharacters = "ABCD";
        String LongestWord = "";

        for(int i = 0; i < listofWords.length; i++){
            String word = listofWords[i];
            boolean okay = true;

            for (int j = 1; j < word.length(); j++){
                if(word.charAt(j) == word.charAt(j - 1)){
                    okay = false;
                    break;
                }
            }

            if(okay){
                for ( int j = 0; j < word.length(); j++ ){
                    boolean found = false;
                    for (int k = 0; k < ValidCharacters.length(); k++){
                        if(word.charAt(j) == ValidCharacters.charAt(k)){
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        okay = false;
                        break;
                    }
                }
            }

            if (okay && word.length()> LongestWord.length()){
                LongestWord = word;
            }
        }
        System.out.println("Longest valid word: " + LongestWord);
    }
}
