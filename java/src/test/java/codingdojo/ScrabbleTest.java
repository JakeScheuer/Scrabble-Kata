package codingdojo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ScrabbleTest
{
    Scrabble scrabble;

    @Before
    public void setup() {

        scrabble = new Scrabble();

    }

    @Test
    public void whenGetTileIsPassedACharacterReturnsItsValue() {

        Integer firstLetterScore = scrabble.getTileValue((Character)'F');

        assertEquals((Integer)4, firstLetterScore);

    }

    @Test
    public void whenCalculateIsPassedAWordReturnsTotalScoreOfTheWord() {

        Integer scoreOfWord = scrabble.calculate("foo");

        assertEquals((Integer) 6, scoreOfWord);

    }

    @Test
    public void whenCalculateIsPassedAOneLetterWordReturns0() {

        Integer scoreOfWord = scrabble.calculate("a");

        assertEquals((Integer) 0, scoreOfWord);

    }
}