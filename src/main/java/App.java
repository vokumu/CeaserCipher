import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //CeaserCipher cipher = new CeaserCipher(stringSecretWord, intKey);
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
        }
        else if(userTask.equals("decrypt")){
            System.out.println("Enter the sentence you want to encrypt:");
            stringSecretWord = scanner.nextLine();
            System.out.println("Enter your cipher Key:");
            intKey = scanner.nextInt();

        }
        else{
            System.out.println("Enter the sentence you want to encrypt:");
        }


        //Cipher
        //CeaserCipher cipher = new CeaserCipher(stringSecretWord, intKey);
        //System.out.println(cipher.CipherSecretWord(stringSecretWord,intKey));
    }
}
