package codingdojo;

import static org.junit.Assert.*;
import org.junit.Test;


public class ScrabbleTest
{
    @Test
    public void whenCalculateIsPassedAStringReturnsFirstLetter() {

        Scrabble scrabble = new Scrabble();
        Character firstLetter = scrabble.calculate("foo");
        assertEquals((Character)'F', firstLetter);

    }
}