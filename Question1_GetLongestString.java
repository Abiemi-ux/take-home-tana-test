public class Question1_GetLongestString {

    public static void main(String[] args) {
        //Defining the variables we'll use
        String[] listofWords = {"AABCDA", "ABCDZADC", "ABCDBCA", "ABCDABDCA"}; 
        String ValidCharacters = "ABCD";
        String LongestWord = "" ;

        //Looping through the words in the dictionary
        for(int i = 0; i < listofWords.length; i++){
            String word = listofWords[i];
            boolean okay = true;

            //Looping through the characters in each word checking whether there are consecutive similar characters in each word
            for (int j = 1; j < word.length(); j++){
                if(word.charAt(j) == word.charAt(j - 1)){
                    okay = false;
                    break;
                }            
            }
            //Checking whether each char in each word is among the valid allowed characters
            if(okay){
                for ( int j = 0; j < word.length(); j++ ){
                    boolean found = false;
                    for (int k = 0; k < ValidCharacters.length(); k++){
                        if(word.charAt(j) == word.charAt(k)){
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
            //Checking whether each word is longest
            if (okay && word.length()> LongestWord.length()){
                LongestWord = word;
            }       

        }
        System.out.println(LongestWord);

    }    

}
