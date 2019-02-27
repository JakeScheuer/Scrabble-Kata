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

//    @Test
//    public void whenCalculateIsPassedAStringReturnsFirstLetter() {
//
//        Character firstLetter = scrabble.calculate("foo");
//
//        assertEquals((Character)'F', firstLetter);
//
//    }

    @Test
    public void whenCalculateIsPassedAStringReturnsScoreOfFirstLetter() {

        Integer firstLetterScore = scrabble.calculate("foo");

        assertEquals((Integer)4, firstLetterScore);

    }
}