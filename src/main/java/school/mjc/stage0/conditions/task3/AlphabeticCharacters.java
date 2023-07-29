package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {

        if (character == 'a' || character <= 'z') {

            if (character == 'a' || character == 'e' || character == 'o' || character == 'u' || character == 'i') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("wrong alphabet!");
        }
    }

    //Implement the program that will consume a character from method argument which will be from english alphabet
    //and print vowel if it is "Vowel" or consonant if it's "Consonant".
    //And If it is not from eng alphabet than print "wrong alphabet!"

    public static void main(String[]args){
        AlphabeticCharacters ac = new AlphabeticCharacters();
        ac.vowelDeterminer('o');
    }
}
