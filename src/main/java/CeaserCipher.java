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
    //check if key is in range
}
