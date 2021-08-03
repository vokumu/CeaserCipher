
public class CeaserCipher {
    private String secretWord;
    private int key;
    //Constructor
    public CeaserCipher(String secretWord, int key) {
        this.secretWord=secretWord;
        this.key=key;
    }
    //get Methods
    public String getSecretWord(){
        return this.secretWord;
    }
    public int getKey(){
        return this.key;
    }
    //cipher the string
    public String CipherSecretWord(String randomWord, int shiftValue){
        this.secretWord = randomWord;
        this.key = shiftValue;
        String newShiftedString = "";
        char[] alphabetCharacters = this.secretWord.toCharArray();
        if(shiftValue == 0 && !randomWord.equals("")) newShiftedString = this.secretWord;
        else if (randomWord.equals("") && shiftValue >= 0 && shiftValue < 26) newShiftedString = "Please type your word";
        else if ((randomWord.equals("")|| !randomWord.equals("")) && (shiftValue < 1 || shiftValue > 25)){
            newShiftedString = "Shift value should be a number greater or equal to 1 and less or equal to 25";
        }
        for(char character: alphabetCharacters){
            if (!randomWord.equals("") && shiftValue >= 1 && shiftValue < 26){
                int charVal =  Character.valueOf(character) + shiftValue;
                char shifted = (char) charVal;
                newShiftedString += Character.toString(shifted);
            }
        }
        return newShiftedString;
    }
    //decipher string
    public String decipherSecretWord(String randomWord, int shiftValue){
        this.secretWord = randomWord;
        this.key = shiftValue;

        String newShiftedString = "";

        char[] alphabetCharacters = this.secretWord.toCharArray();

        if(shiftValue == 0 && !randomWord.equals("")) newShiftedString = this.secretWord;
        else if (randomWord.equals("") && shiftValue >= 0 && shiftValue < 26) newShiftedString = "Please type your word";
        else if ((randomWord.equals("")|| !randomWord.equals("")) && (shiftValue < 1 || shiftValue > 25)){
            newShiftedString = "Shift value should be a number greater or equal to 1 and less or equal to 25";
        }

        for(char character: alphabetCharacters){
            if (!randomWord.equals("") && shiftValue >= 1 && shiftValue < 26){
                int charVal =  Character.valueOf(character) - shiftValue;
                char shifted = (char) charVal;

                newShiftedString += Character.toString(shifted);

            }

        }
        return newShiftedString;
    }

}

