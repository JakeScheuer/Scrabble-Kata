package codingdojo;

import java.util.ArrayList;
import java.util.List;

public class Word {

    private Character column;
    private Integer row;
    private String word;
    private boolean isVertical;


    public Word(Character column, Integer row, String word, boolean isVertical) {
        this.column = column;
        this.row = row;
        this.word = word;
        this.isVertical = isVertical;
    }

    public Integer getWordValue() {

        int score = 0;

        if (word.length() >= 2 && word.length() <= 15){

            for(int i = 0; i < word.length() ; i++) {
                score += getTileValue(word.toUpperCase().charAt(i));
            }

        }

        return score;

    }

    public String getStartingPosition() {

        return Character.toUpperCase(column) + "," + row;

    }

    public Integer getTileValue(Character tile){

        return ScrabbleData.Tiles.get(tile);

    }

    public List<String> playWordHorizontal() {

        List<String> coordinates = new ArrayList<String>();

        int valueOfFirstColumn = getStartingPosition().charAt(0);

        for (int i = 0; i < word.length(); i++) {

            String nextColumnLetter = String.valueOf((char) (valueOfFirstColumn + i));

            String nextCoordinate = nextColumnLetter+","+row;

            coordinates.add(nextCoordinate);

        }

        return coordinates;
    }

    public List<String> playWordVertical() {

        List<String> coordinates = new ArrayList<String>();

        for (int i = 0; i < word.length(); i++) {

            String nextCoordinate = column+","+(row+i);

            coordinates.add(nextCoordinate);

        }

        return coordinates;
    }
}
