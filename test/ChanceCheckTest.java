import org.junit.Test;

import static junit.framework.Assert.assertTrue;

//
public class ChanceCheckTest {



    @Test
    public void ChanceFor3And6AreSame() throws Exception {
        ChanceCheck chanceCheck = new ChanceCheck();
        assertTrue(chanceCheck.theChanceOFTwoFaces(3, 6));

    }
    @Test
    public void ChanceFor3And5AreSame() throws Exception {
        ChanceCheck chanceCheck = new ChanceCheck();
        assertTrue(chanceCheck.theChanceOFTwoFaces(3, 5));

    }


}
