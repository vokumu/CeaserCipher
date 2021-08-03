import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your secret string:");
        String stringSecretWord = scanner.nextLine();
        System.out.println("Enter your cipher Key:");
        int intKey = scanner.nextInt();

        //Cipher
        CeaserCipher cipher = new CeaserCipher(stringSecretWord, intKey);
        System.out.println(cipher.CipherSecretWord(stringSecretWord,intKey));
    }
}
