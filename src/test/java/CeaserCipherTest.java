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

}