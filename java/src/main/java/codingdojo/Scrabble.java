package codingdojo;

public class Scrabble {

    public int score = 0;

    public Character calculate(String word) {
        Character firstLetter = word.toUpperCase().charAt(0);
        return firstLetter;

    }
}
