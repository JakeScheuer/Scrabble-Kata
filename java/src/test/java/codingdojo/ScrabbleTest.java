package codingdojo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class ScrabbleTest
{
    Scrabble scrabble;

    @Before
    public void setup() {

        scrabble = new Scrabble();

    }

    @Test
    public void whenGetTileIsPassedACharacterReturnsItsValue() {

        Word word = new Word('A', 1, "foo", true);


        Integer firstLetterScore = word.getTileValue((Character)'F');

        assertEquals((Integer)4, firstLetterScore);

    }

    @Test
    public void whenCalculateIsPassedAWordReturnsTotalScoreOfTheWord() {

        Word word = new Word('A', 1, "foo", true);

        Integer scoreOfWord = scrabble.calculate(word);

        assertEquals((Integer) 6, scoreOfWord);

    }

    @Test
    public void whenCalculateIsPassedAOneLetterWordReturns0() {

        Word word = new Word('A', 1, "a", true);

        Integer scoreOfWord = scrabble.calculate(word);

        assertEquals((Integer) 0, scoreOfWord);

    }

    @Test
    public void whenCalculateIsPassedAWordLargerThan15Returns0() {

        Word word = new Word('A', 1, "icannotthinkofone", true);

        Integer scoreOfWord = scrabble.calculate(word);

        assertEquals((Integer) 0, scoreOfWord);

    }

    @Test
    public void whenGetStartingPositionIsCalledReturnsFormattedStartingPosition() {

        Word word = new Word('A', 1, "hello", true);

        assertEquals("A,1", word.getStartingPosition());

    }

    @Test
    public void whenPlayWordHorizontalIsCalledAListOfCoordinatesIsGenerated() {
        Word word = new Word('A', 1, "hello", false);

        List<String> actualCoordinates = word.playWordHorizontal();
        List<String> expectedCoordinates = new ArrayList<String>(){{
            add("A,1");
            add("B,1");
            add("C,1");
            add("D,1");
            add("E,1");
        }};
        assertEquals(expectedCoordinates, actualCoordinates);
    }

    @Test
    public void whenPlayWordVerticalIsCalledAListOfCoordinatesIsGenerated() {
        Word word = new Word('A', 1, "hello", true);

        List<String> actualCoordinates = word.playWordVertical();
        List<String> expectedCoordinates = new ArrayList<String>(){{
            add("A,1");
            add("A,2");
            add("A,3");
            add("A,4");
            add("A,5");
        }};
        assertEquals(expectedCoordinates, actualCoordinates);
    }

}