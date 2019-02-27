package codingdojo;



public class Scrabble {

    public int score = 0;

    public Integer calculate(String word) {
        Character firstLetter = word.toUpperCase().charAt(0);
        return getTileValue(firstLetter);

    }

    private Integer getTileValue(Character tile){

        return ScrabbleData.Tiles.get(tile);

    }
}
