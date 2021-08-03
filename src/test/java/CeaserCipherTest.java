import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CeaserCipherTest {
    @Test
    public void newCipher_instantiatesCorrectly() {
        CeaserCipher testCipher=new CeaserCipher("word",2);
        assertEquals(true,testCipher instanceof CeaserCipher);
    }

    @Test
    public void newCipher_getSecretWord_word() {
        CeaserCipher testCipher=new CeaserCipher("word",2);
        assertEquals("word",testCipher.getSecretWord());
    }

    @Test
    public void newCipher_getKey_2() {
        CeaserCipher testCipher=new CeaserCipher("word",2);
        assertEquals(2,testCipher.getKey());
    }

    @Test
    public void testCipher_CipherSecretWord_stringShift0_int(){
        CeaserCipher testCipher=new CeaserCipher("word",2);
        String expected = "a";
        assertEquals(expected, testCipher.CipherSecretWord("a", 0));
    }
    @Test
    public void caesar_Cypher_shiftCharacterOneStepForward_emptyString_int(){
        CeaserCipher testCipher=new CeaserCipher("word",2);
        String expected = "Please type your word";
        assertEquals(expected, testCipher.CipherSecretWord("", 7));
    }
    @Test
    public void caesar_Cypher_shiftCharacterOneStepForward_string_int_shiftValueGreaterThan25OrLessThan1(){
        CeaserCipher testCipher=new CeaserCipher("word",2);
        String expected = "Shift value should be a number greater or equal to 1 and less or equal to 25";
        assertEquals(expected, testCipher.CipherSecretWord("bhbj", -6));
    }
    @Test
    public void caesar_Cypher_shiftCharacterOneStepForward_string_int_shiftedString(){
        CeaserCipher testCipher=new CeaserCipher("word",2);
        String expected = "wxy";
        assertEquals(expected, testCipher.CipherSecretWord("vwx", 1));
    }

}