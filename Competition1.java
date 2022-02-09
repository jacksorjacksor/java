import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Competition1 {

    /*
     * With eternal gratitude to Linsey Rimmer for explaining how HashMaps work.
     * May your ciphertext never use the letter "Q"
     */

    public static String ciphertext = "ETEVHTWGSAHGWYVPNKQOEGWYVPNKPDEPHWAOVWPFWNHANEVWXAVOAEAJEUXTAOWBTEVHTWGSAHGWYVPNQAOQVGTYHAVAXETOANFQEOIQPLANTEVHFYNSQVEBEOWSKNCKLOPEVTYJAUFWYNCOTWZESQEPERQSQOPEVYCEVHEGDEHEVHEYOPNQEEHWYFTKTEVHTWGSAHGWYVPNKQOWVAPDEPWVTKFWNHANOTEVHTWGSAHGWYVPNQAOPDANAENAWVTKPIWHWYFTKTEVHTWGSAHGWYVPNQAOQVPDAIWNTHWVAWBPDAUQOYLFASQOPEVIDEPQOPDAWPDANWVA";
    public static String phrase = "NEPALSERBIASWITZERLANDBURKINAFASOKYRGYZSTANLUXEMBOURGSLOVAKIATAJIKISTANUGANDACHADANDAUSTRIA";

    public static void main(String[] args) {
        /////////////////////////////////////////
        // 1. List of all capital letters
        /////////////////////////////////////////

        /////////////////////////////////////////
        // 2. Make list of indexes for N
        /////////////////////////////////////////
        List<Integer> listOfIndexesOfN = new ArrayList<Integer>();

        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == 'N') {
                listOfIndexesOfN.add(i);
            }
        }

        /////////////////////////////////////////
        // 3. Go through and find if letters at such indexes are equal for N
        /////////////////////////////////////////

        int indexWherePhraseStartsInCiphertext = -1;

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
                    break;
                }
            }
        }

        /////////////////////////////////////////
        // # 4. Make dictionary of letter replacements
        /////////////////////////////////////////

        // HASHMAP
        HashMap<Character, Character> cipherToPhraseHashMap = new HashMap<Character, Character>();
        for (int i = 0; i < phrase.length(); i++) {
            if (cipherToPhraseHashMap.containsKey(ciphertext.charAt(i + indexWherePhraseStartsInCiphertext))) {
                continue;
            }
            cipherToPhraseHashMap.put(ciphertext.charAt(i + indexWherePhraseStartsInCiphertext), phrase.charAt(i));
        }
        /////////////////////////////////////////
        // # 5. Translate
        /////////////////////////////////////////

        String myOutputValue = "";
        for (int i = 0; i < ciphertext.length(); i++) {
            myOutputValue += cipherToPhraseHashMap.get(ciphertext.charAt(i));
        }

        System.out.println(myOutputValue);
    }
}
