import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TestOccurrence {

    @Test
    public void shouldReturnChanceOf1In6(){
        Occurrence occurrence = new Occurrence(1, 6);
        double expectedChance = 0.16666666666666666;

        assertEquals(expectedChance, occurrence.getChance());
    }

    @Test
    public void shouldReturnChanceOf1In2(){
        Occurrence occurrence = new Occurrence(1, 2);
        double expectedChance = 0.5;

        assertEquals(expectedChance, occurrence.getChance());
    }

    @Test
    public void shouldReturnTrueForTwoEqualOccurrences() {
        Occurrence chanceOf3InSixFacesDice = new Occurrence(1, 6);
        Occurrence chanceOf6InSixFacesDice = new Occurrence(1, 6);

        assertTrue(chanceOf3InSixFacesDice.equals(chanceOf6InSixFacesDice));
    }

    @Test
    public void shouldReturnFalseForTwoDifferentOccurrences() {
        Occurrence chanceOf3InSixFacesDice = new Occurrence(1, 6);
        Occurrence chanceOf1InFourFacesDice = new Occurrence(1, 4);

        assertFalse(chanceOf3InSixFacesDice.equals(chanceOf1InFourFacesDice));
    }

    @Test
    public void shouldReturnTrueForTwoEqualOccurrencesWithDifferentOutcomes() {
        Occurrence chanceOfOddNumberInSixFacesDice = new Occurrence(3, 6);
        Occurrence chanceOfHeadInACoin = new Occurrence(1, 2);

        assertTrue(chanceOfOddNumberInSixFacesDice.equals(chanceOfHeadInACoin));
    }

}
