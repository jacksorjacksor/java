import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.SysexMessage;

public class Competition1 {
    public static String ciphertext = "ETEVHTWGSAHGWYVPNKQOEGWYVPNKPDEPHWAOVWPFWNHANEVWXAVOAEAJEUXTAOWBTEVHTWGSAHGWYVPNQAOQVGTYHAVAXETOANFQEOIQPLANTEVHFYNSQVEBEOWSKNCKLOPEVTYJAUFWYNCOTWZESQEPERQSQOPEVYCEVHEGDEHEVHEYOPNQEEHWYFTKTEVHTWGSAHGWYVPNKQOWVAPDEPWVTKFWNHANOTEVHTWGSAHGWYVPNQAOPDANAENAWVTKPIWHWYFTKTEVHTWGSAHGWYVPNQAOQVPDAIWNTHWVAWBPDAUQOYLFASQOPEVIDEPQOPDAWPDANWVA";
    public static String phrase = "NEPALSERBIASWITZERLANDBURKINAFASOKYRGYZSTANLUXEMBOURGSLOVAKIATAJIKISTANUGANDACHADANDAUSTRIA";

    public static void main(String[] args) {
        // System.out.println("Ciphertext: " + ciphertext);
        // System.out.println("Hint phrase: " + phrase);

        /////////////////////////////////////////
        // 1. List of all capital letters
        /////////////////////////////////////////

        // Code for array of capital letters:
        // https://stackoverflow.com/questions/50923610/create-array-with-uppercase-ascii-letters-in-java
        char[] capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        /////////////////////////////////////////
        // 2. Make list of indexes for N
        /////////////////////////////////////////
        List<Integer> listOfIndexesOfN = new ArrayList<Integer>();

        for (int i = 0; i < phrase.length(); i++) {

            if (phrase.charAt(i) == 'N') {
                listOfIndexesOfN.add(i);
            }
            ;

        }
        System.out.println(listOfIndexesOfN);

        /////////////////////////////////////////
        // 3. Go through and find if letters at such indexes are equal for N
        /////////////////////////////////////////

        int indexWherePhraseStartsInCiphertext;

        // For each letter of the cipher
        for (int i = 0; i < ciphertext.length(); i++) {
            // If i + last element of indexArray is not greater than ciphertext.length()
            if (i + listOfIndexesOfN.get(listOfIndexesOfN.size() - 1) < ciphertext.length()) {
                // Make array of each character from that cipher at the displaced positions

                List<Character> listOfCharacters = new ArrayList<Character>();
                for (int j = 0; j < listOfIndexesOfN.size(); j++) {
                    listOfCharacters.add(ciphertext.charAt(listOfIndexesOfN.get(j) + i));
                }
                char letterToCheck = listOfCharacters.get(0);
                boolean allLettersMatch = true;

                for (int k = 1; k < listOfCharacters.size() - 1; k++) {
                    if (letterToCheck != listOfCharacters.get(k)) {
                        allLettersMatch = false;
                    }

                }
                if (allLettersMatch) {
                    indexWherePhraseStartsInCiphertext = i;
                    System.out.println(" DONE ");
                    System.out.println(listOfCharacters);
                    System.out.println(indexWherePhraseStartsInCiphertext);
                    break;
                }
            }
        }

        // Make dictionary

    }
}
