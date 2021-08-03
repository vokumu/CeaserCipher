import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CeaserCipherTest {
    @Test
    public void newCipher_instantiatesCorrectly() {
        CeaserCipher testCipher=new CeaserCipher("word",2);
        assertEquals(true,testCipher instanceof CeaserCipher);
    }
}