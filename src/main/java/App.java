import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        CeaserCipher cipher=new CeaserCipher();
        //CaesarCypher caesarCypher = new CaesarCypher();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Cease Cipher application \nThe application will allow you to encrypt or decrypt your secret message.\nTo do so type your action (Encrypt or Decrypt)");
        String userTask = scanner.nextLine();
        String stringSecretWord;
        int intKey;
        if(userTask.equals("encrypt")){
            System.out.println("Enter the sentence you want to encrypt:");
            stringSecretWord = scanner.nextLine();
            System.out.println("Enter your cipher Key:");
            intKey = scanner.nextInt();
            System.out.println("The encrypted word is "+cipher.CipherSecretWord(stringSecretWord,intKey));
        }
        else if(userTask.equals("decrypt")){
            System.out.println("Enter the sentence you want to Decrypt:");
            stringSecretWord = scanner.nextLine();
            System.out.println("Enter your cipher Key:");
            intKey = scanner.nextInt();
            System.out.println("The decrypted word is "+cipher.decipherSecretWord(stringSecretWord,intKey));

        }
        else{
            System.out.println("Your choice should be encrypt or decrypt");
        }
    }
}
