// //Pangarm:It is Special Type Of String Which Has All The Char(A-Z) Atleast Once

// We can solve with using HashSet Because set can't contain duplicates.
// create alphabet set we will add all character (a to z).
// Then i will start iterating through input string.
// Comapre input characters with Alphabet set when same character occurs i will remove that from set.
// At last if set is empty that means it was pangram.
import java.util.HashSet;
import java.util.Set;

public class CheckIfPangram {

    void checkIfPangram(String sentence) {

        Set<Character> alphabetSet = new HashSet<>();

        // Adding all characters from 'a' to 'z' in the HashSet
        for (int i = 'a'; i <= 'z'; i++) {
            alphabetSet.add((char) i);
        }

        // Removeing every character and check
        // if the set becomes empty at any point in time
        for (int i = 0; i < sentence.length(); i++) {
            alphabetSet.remove(sentence.charAt(i));
            if (alphabetSet.isEmpty()) {
                System.out.println("It is a pangram");
                return;
            }
        }
        
        System.out.println("It is not a pangram");
    }

    public static void main(String[] args) {
        CheckIfPangram pangramChecker = new CheckIfPangram();

        // Change the input sentence to test
        String sentence = "hgfvhdsgfhgdfkhsdgkf";

        pangramChecker.checkIfPangram(sentence);
    }
}
