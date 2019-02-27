package codingdojo;



public class Scrabble {

    public Integer score = 0;

    public Integer calculate(String word) {
        getWordValue(word);
        return score;

    }

    private void getWordValue(String word) {
        for(int i = 0; i < word.length() ; i++) {
            score += getTileValue(word.toUpperCase().charAt(i));
        }
    }

    public Integer getTileValue(Character tile){

        return ScrabbleData.Tiles.get(tile);

    }
}
